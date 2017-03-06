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
	'behavior' qualified ';'
	rImportSyntax*
	rImportSemantic*
	rImportService*
	rClass*
;

rImportSyntax : 'import' 'syntax' STRING 'as' Ident ';'
;

rImportSemantic : 'import' 'semantic' qualified 'as' Ident '(' Ident '=>' Ident ')' ';'
;

rImportService : 'import' 'service' qualified ';'
;

rClass : 'class' qualified ('extends' qualified)? '{' rAttribute* rOperation* '}'
; 

rOperation : (rTag)* ('def' | 'override') (qualified|typeLiteral) Ident '(' rParameters? ')' rBlock
;

rTag : '@'Ident
; 

rParameters : rVariable (',' rVariable)*
;

rVariable : (qualified|typeLiteral) Ident
;

rAttribute : (qualified|typeLiteral) Ident (':=' expression)? ';'
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

rVarDecl : (qualified|typeLiteral) Ident (':=' expression)? ';'
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
