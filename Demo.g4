grammar Demo;

start: ( (stat|function)? NEWLINE )*
;

block: ( stat? NEWLINE )*
;

stat: IF equal THEN blockif ENDIF 	#if
    | REPEAT repetitions block ENDREPEAT	#repeat
	| PRINT ID			    #print
	| ID '=' value			#assign
	| READ ID   			#read
	| ID                    #call
;

function: FUNCTION fparam fblock ENDFUNCTION
;

fparam: ID
;

fblock: block
;

repetitions: value
;

blockif: block
;

equal: ID '==' INT
;

value: INT			            #int
       | ID			            #id
       | DOUBLE			        #double
       | value ADD value		#add
       | value MULT value		#mult
;

FUNCTION: 'function'
;

ENDFUNCTION: 'endfunction'
;

REPEAT:	'repeat'
;

ENDREPEAT: 'endrepeat'
;

IF:	'if'
;

THEN:	'then'
;

ENDIF:	'endif'
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