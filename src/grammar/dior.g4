grammar dior;

file
: code
| EOF
;

code
: statement ';' code
| statement ';'
;

block
: '{' statement* '}'
;

statement
: block
| declaration
| forStatement
| assignment
| printOut
;

declaration
: 'var' ID
;

forStatement
: 'for' ('(')? forConditions (')')? statement
;

forConditions
: iterator=varRef 'from' startExpr=expression range='to' endExpr=expression
;

varRef
: ID
;

assignment
: ID EQUALS expression
;

expression
: unaryExpression
| addExpression
;

addExpression
: unaryExpression '+' expression
;

unaryExpression
: ID
| INT
;

printOut
: 'print' ID
;

ID : [a-zA-Z0-9]+ ;

INT: ('0'..'9')+ ;

WS:	[ \n\t\r]+ -> skip ;

GREATER
: '>'
;

LESS
: '<'
;

EQUALS
: '='
;


