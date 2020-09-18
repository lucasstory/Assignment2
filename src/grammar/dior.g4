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
| whileStatment
| assignment
| printOut
;

declaration
: 'var' ID
;

whileStatment
: 'while' '(' expression ')'
    statement*
;

forStatement
: 'for' '(' forConditions ')'
    statement*
;

forConditions
: iterator=varRef 'FROM' startExpr=expression range='TO' endExpr=expression
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
| compareExpression
;

addExpression
: unaryExpression '+' expression
;

compareExpression
: unaryExpression maths expression
;

unaryExpression
: ID
| INT
;

printOut
: 'print' ID
;

maths
: GREATER
| LESS
| EQUALS
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


