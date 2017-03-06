// Define a grammar called Hello
grammar XtdAQL;

import Query;

@header {
	package lang.core.parser;
}

//ID : ([a-zA-Z] | '_') ([a-zA-Z] | [0-9] | '_')*;
//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMENT : '/*' .*? '*/' -> skip ; // .*? matches anything until the first */
LINECOMMENT : '//' ~[\r\n]* -> skip; //Line comment

/*
 * Structure
 */

rRoot : 
	'behavior' name=qualified
	rImportSyntax*
	rImportSemantic*
	rImportService*
	rClass*
;

rImportSyntax : 'import' 'syntax' uri=STRING 'as' name=Ident ';'
;

rImportSemantic : 'import' 'semantic' qualified 'as' Ident '(' Ident '=>' Ident ')' ';'
;

rImportService : 'import' 'service' qualified ';'
;

rClass : 'class' name=qualified ('extends' qualified)? '{' rAttribute* rOperation* '}'
; 

rOperation : (tags+=rTag)* ('def' | 'override') type=rType name=Ident '(' parameters=rParameters? ')' body=rBlock
;

rType:qualified|typeLiteral;

rTag : '@'Ident
; 

rParameters : rVariable (',' rVariable)*
;

rVariable : type=rType name=Ident
;

rAttribute : type=rType name=Ident (':=' value=expression)? ';'
;

/*
 * Statements
 */

rStatement : rVarDecl 
		| rAssign
		| rForEach
		| rWhile
		| rIf
		| rExpression
;

rVarDecl : type=rType name=Ident (':=' value=expression)? ';'
;

rAssign : expression ':=' expression ';'
;

rForEach : 'for' '(' Ident  'in' rCollection ')' rBlock
;

rCollection : '[' Integer '..' Integer ']' | expression
;

rBlock : '{' (rStatement (rStatement)*)? '}'
;

rIf : 'if' '(' expression ')' rBlock ('else' rBlock)?
;

rWhile : 'while' '(' expression ')' rBlock
;

rExpression : expression ';'
;

STRING :  '"' (.)*? '"'
;

qualified : Ident ('.'Ident)*
;
