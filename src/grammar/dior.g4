grammar dior;

file
 : block
 ;

block
 : NEW_LINE* (statement (NEW_LINE+ | EOF))*
 ;

statement
 : assignment
 | if_statement
 | while_statement
 | until_statement
 | do_while_statement
 | write
 ;

assignment
 : ID IS expression # expressionAssignment
 | ID PLUS          # incrementAssignment
 | ID MINUS         # decrementAssignment
 ;

if_statement
 : IF condition_block (ELSE IF condition_block)* (ELSE NEW_LINE statement_block)? END IF
 ;

condition_block
 : expression NEW_LINE statement_block
 ;

statement_block
 : block
 ;

while_statement
 : WHILE expression NEW_LINE statement_block END WHILE
 ;

until_statement
 : UNTIL expression NEW_LINE statement_block END UNTIL
 ;

do_while_statement
 : DO NEW_LINE statement_block WHILE expression
 ;

// Added unary expressions instead of combining them in the lexer.
expression
 : atom                                            # atomExpression
 | MINUS expression                                # unaryMinusExpression
 | PLUS expression                                 # unaryPlusExpression
 | expression PLUS expression                      # plusExpression
 | expression MINUS expression                     # minusExpression
 | expression MULTIPLY expression                  # multiplicationExpression
 | expression DIVIDE expression                    # divisionExpression
 | expression PLUS                                 # incrementExpression
 | expression MINUS                                # decrementExpression
 | expression AND expression                       # andExpression
 | expression OR expression                        # orExpression
 | expression EQUALS expression                    # equalityExpression
 | expression NOT EQUALS expression                # notEqualityExpression
 | expression LESS_THAN expression                 # lessThanExpression
 | expression NOT LESS_THAN expression             # notLessThanExpression
 | expression GREATER_THAN expression              # greaterThanExpression
 | expression NOT GREATER_THAN expression          # notGreaterThanExpression
 | expression GREATER_THAN OR EQUALS expression    # greaterThanOrEqualExpression
 | expression LESS_THAN OR EQUALS expression       # lessThanOrEqualExpression
 ;

atom
 : INT                              # integerAtom
 | FLOAT                            # floatAtom
 | bool                             # boolAtom
 | ID                               # idAtom
 | STRING                           # stringAtom
 | OPEN_PAR expression CLOSE_PAR    # expressionAtom
 ;

write
 : WRITE expression
 ;

// By making this a parser rule, you needn't inspect the lexer rule
// to see if it's true or false.
bool
 : TRUE
 | FALSE
 ;

//////////////////////////////////
// LEXER
//////////////////////////////////

PLUS                        : '+';
MINUS                       : '-';
MULTIPLY                    : '*';
DIVIDE                      : '/';

OPEN_CURLY                  : '{';
CLOSE_CURLY                 : '}';
OPEN_PAR                    : '(';
CLOSE_PAR                   : ')';
COLON                       : ':';
NEW_LINE                    : '\r'? '\n';

IF                          : 'if';
ELSE                        : 'else';
END                         : 'end';
WHILE                       : 'while';
UNTIL                       : 'until';
DO                          : 'do';
EQUALS                      : '==';
NOT                         : '!';
IS                          : '=';
LESS_THAN                   : '<';
GREATER_THAN                : '>';
WRITE                       : 'print';
AND                         : '&';
OR                          : '|';

TRUE  : 'TRUE'  | 'true'  | 'YES' | 'yes';
FALSE : 'FALSE' | 'false' | 'NO'  | 'no';

INT
 : DIGIT+
 ;

// (DIGIT+)? is the same as: DIGIT*
FLOAT
 : DIGIT+ [.,] DIGIT*
 | DIGIT* [.,] DIGIT+
 ;

// If a rule can never become a token on its own (an INT will always
// be created instead of a DIGIT), mark it as a 'fragment'.
fragment DIGIT
 : [0-9]
 ;

// Added support for escaped backslashes.
STRING
 : '"' ( '\\"' | '\\\\' | ~["\\] )* '"'
 ;

// Can it start with a digit? Maybe this is better: [a-zA-Z] [a-zA-Z0-9]*
ID
 : [a-zA-Z0-9]+
 ;

WHITESPACE
 : [ \t]+ -> skip
 ;

COMMENT
 : ( ';;' .*? ';;' | ';' ~[\r\n]* ) -> skip
 ;
