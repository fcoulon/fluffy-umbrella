/*******************************************************************************
 * Copyright (c) 2017 Inria and Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.ecoretools.ale.core.interpreter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.query.ast.Expression;
import org.eclipse.ecoretools.ale.core.parser.visitor.ParseResult;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;

import org.eclipse.ecoretools.ale.implementation.ModelBehavior;

public class DiagnosticLogger {
	List<Diagnostic> log = new ArrayList<Diagnostic>();
	List<ParseResult<ModelBehavior>> parseResults;
	
	public DiagnosticLogger(List<ParseResult<ModelBehavior>> parseResults) {
		this.parseResults = parseResults;
	}
	
	public void notify(Diagnostic diag) {
		log.add(diag);
	}
	
	public List<Diagnostic> getLog() {
		return log;
	}
	
	public void diagnosticForHuman() {
		log
		.stream()
		.forEach(diagnotic -> {
			if(diagnotic instanceof BasicDiagnostic){
				BasicDiagnostic chain = (BasicDiagnostic) diagnotic;
				chain
					.getChildren()
					.stream()
					.forEach(
						diag -> {
							if(diag.getSource().equals(ImplementationEvaluator.PLUGIN_ID)){
								Expression failedExp = (Expression) diag.getData().get(0);
								Diagnostic diagExp = (Diagnostic) diag.getData().get(1);
								printError(failedExp, diagExp.toString());
							}
						}
					);
			}
		});
	}
	
	private void printError(Expression expr, String errorMsg) {
		
		for(ParseResult<ModelBehavior> p : parseResults) {
			Integer startPos = p.getStartPositions().get(expr);
			if(startPos != null) {
				String file = p.getSourceFile();
				int line =  getLine(startPos,file);
				System.out.println("\n[AQL eval fail] At line "+ line +" in " + file + " :\n" + errorMsg);
			}
		}
	}
	
	private int getLine(int offset, String file) {
		try (LineNumberReader r = new LineNumberReader(new FileReader(file))) {
			r.setLineNumber(1); //first line is number 0 by default
		    int count = 0;
		    while (r.read() != -1 && count < offset) {
		        count++;
		    }
		    if (count == offset) {
		        return r.getLineNumber();
		    } else {
		        System.out.println("File is not long enough");
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
