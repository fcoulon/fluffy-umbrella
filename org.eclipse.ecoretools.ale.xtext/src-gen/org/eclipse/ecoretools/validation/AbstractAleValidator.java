/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.ecoretools.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractAleValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.eclipse.ecoretools.ale.AlePackage.eINSTANCE);
		return result;
	}
	
}
