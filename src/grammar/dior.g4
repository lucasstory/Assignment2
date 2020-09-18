grammar dior;

file
: code
| EOF
;

code
: statement ';' code
| statement ';'
;

statement
: declaration
| assignment
| printOut
;

declaration
: 'var' ID
;

assignment
: ID '=' expression
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
