grammar Demo;

start: ( stat? NEWLINE )*
;

block: ( stat? NEWLINE )*
;

stat: IF equal THEN blockif ENDIF 	#if
    | REPEAT repetitions block ENDREPEAT	#repeat
	| PRINT ID			    #print
	| ID '=' expr			#assign
	| READ ID   			#read
;

repetitions: expr
;

REPEAT:	'repeat'
;

ENDREPEAT: 'endrepeat'
;

blockif: block
;

equal: ID '==' expr
;

IF:	'if'
;

THEN:	'then'
;

ENDIF:	'endif'
;

expr: expr1			    #single1
	| expr1 ADD expr1	#add
;

expr1: expr2            #single2
	| expr2 MULT expr2	# mult
;

expr2: INT			    # int
	| DOUBLE		    # double
;

PRINT: 'print'
;

READ:	'read'
;

ID: ('a'..'z'|'A'..'Z')+
;

INT: '0'..'9'+
;

DOUBLE: '0'..'9'+'.'+'0'..'9'+
;

ADD: '+'
;

MULT: '*'
;

NEWLINE:	'\r'? '\n'
;

WS : [ \t\r\n]+ -> skip ;