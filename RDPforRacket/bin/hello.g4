lexer grammar hello;

//program : defOrExpr program EOF
//         |defOrExpr 
//         ;
//
//defOrExpr : definition
//          | expr
//          | testCase
//          | libraryRequire
//          ;
//nameplus : name nameplus
//         | name
//         ;
//namestar : name namestar
//		 | 
//		 ; 
//definitionstar : definition definitionstar
//			   | 
//			   ;           
//definition : LEFTB DEFINE name expr RIGHTB
//           | LEFTB DEFINE LEFTB name nameplus RIGHTB expr RIGHTB
//           | LEFTB DEFINESTRUCT name LEFTB namestar RIGHTB RIGHTB
//           ;
//exprplus : expr exprplus 
//		 | expr
//		 ;
//lner : LEFTSQB name expr RIGHTSQB lner
//	 | 
//	 ;
//leerbplus : LEFTB expr expr RIGHTB leerbplus
//		  | LEFTB expr expr RIGHTB
//		  ;
//leersqbplus : LEFTSQB expr expr RIGHTSQB leersqbplus
//			| LEFTSQB expr expr RIGHTSQB
//			;
//leersqbstar : LEFTSQB expr expr RIGHTSQB leersqbstar
//			| 
//			;
//expr: LEFTB BEGINN exprplus RIGHTB
//    | LEFTB BEGINN0 exprplus RIGHTB
//    | LEFTB SETNQ NAME expr RIGHTB
//    | LEFTB DELAY expr RIGHTB
//    | LEFTB CAR expr RIGHTB
//    | LEFTB CDR expr RIGHTB
//    | LEFTB COMBINATIONS expr RIGHTB
//    | LEFTB LIST expr RIGHTB
//    | LEFTB REVERSE expr RIGHTB
//    | LEFTB APPEND NAME expr RIGHTB
//    | LEFTB LAMBDA LEFTB namestar RIGHTB expr RIGHTB
//    | LEFTB LAMBDASYM LEFTB namestar RIGHTB expr RIGHTB
//    | LEFTB LOCAL LEFTSQB definitionstar RIGHTSQB expr RIGHTB
//    | LEFTB LETREC LEFTB lner RIGHTB expr RIGHTB
//    | LEFTB SHARED LEFTB lner RIGHTB expr RIGHTB
//    | LEFTB LET LEFTB lner RIGHTB expr RIGHTB
//    | LEFTB LETSTAR LEFTB lner RIGHTB expr RIGHTB
//    | LEFTB RECUR name LEFTB lner RIGHTB expr RIGHTB
//    | LEFTB name exprplus RIGHTB
//    | LEFTB COND leerbplus RIGHTB
//    | LEFTB COND leersqbplus RIGHTB
//    | LEFTB COND leersqbstar LEFTSQB ELSE expr RIGHTSQB RIGHTB
//    | LEFTB IF  expr expr expr RIGHTB
//    | LEFTB AND expr exprplus RIGHTB
//    | LEFTB OR  expr exprplus RIGHTB
//    | DISPLAY name
//    | DISPLAY string
//    | NEWLINE
//    | EMPTY
//    | QUOTESX
//    | QSMARK
//    | QUOTEQUOTED quoted
//    | QUOTEQUASIQUOTED quasiQuoted
//    | CHARACTERQUOTED
//    | reloperators
//    | arthoperators
//    | name
//    | number
//    | symbol
//    | bool
//    | string
//    | character
//    ;
//quotedstar : quoted quotedstar
//		   | 
//		   ;
//quoted
//    : name
//    | string
//    | character
//    | LEFTB quotedstar RIGHTB
//    | QUOTEQUOTED quoted
//    | QUOTEQUASIQUOTED quoted
//    | COMMA quoted
//    | COMMAAT quoted
//    ;
//quasiQuotedstar : quasiQuoted quasiQuotedstar
//				| 
//				;
//quasiQuoted
//    : name
//    | number
//    | string
//    | character
//    | LEFTB quasiQuotedstar RIGHTB
//    | QUOTEQUOTED quasiQuoted
//    | QUOTEQUASIQUOTED quasiQuoted
//    | COMMA expr
//    | COMMAAT expr
//    ;
//exprquestionmark : expr
//				  | 
//				  ;
//testCase
//    : LEFTB TSCHECKEXP expr expr RIGHTB
//    | LEFTB TSCHECKRAND expr expr RIGHTB
//    | LEFTB TSCHECKWITHIN expr expr expr RIGHTB
//    | LEFTB TSCHECKMEMBEROF expr exprplus RIGHTB
//    | LEFTB TSCHECKSATSIS expr name RIGHTB
//    | LEFTB TSCHECKERROR expr exprquestionmark RIGHTB
//    ;
//stringplus : string stringplus
//			| string
//			;
//lsprquestionmark : LEFTB stringplus RIGHTB
//				 | 
//				 ;
//libraryRequire
//    : LEFTB REQUIRE STRING RIGHTB
//    | LEFTB REQUIRE name RIGHTB
//    | LEFTB REQUIRE LEFTB name STRING lsprquestionmark RIGHTB RIGHTB
//    | LEFTB REQUIRE LEFTB name STRING pkg RIGHTB RIGHTB
//    ;
//
//pkg: LEFTB string string number number RIGHTB;
//
//name: NAME;
//
//symbol : SYMBOL;
//    
//number : INT|DECIMAL;
//
//bool : BOOLEAN;
//
//string : STRING;
//
//character : CHARACTER ;
//
//reloperators : RELOPERATORS;
//
//arthoperators : ARTHOPERATORS;

BEGINN : 'begin';
BEGINN0 : 'begin0';
SETNQ : 'set!';
SET : 'set';
DELAY : 'delay';
CAR : 'car';
CDR : 'cdr';
COMBINATIONS : 'combinations';
LIST : 'list';
REVERSE : 'reverse';
APPEND : 'append';
LAMBDA : 'lambda';
LAMBDASYM : 'λ';
LOCAL : 'local';
LETREC : 'letrec';
SHARED : 'shared';
LET : 'let';
LETSTAR : 'let*';
RECUR : 'recur';
COND : 'cond';
ELSE : 'else ';
IF : 'if';
AND : 'and';
OR : 'or';
TSCHECKEXP : 'check-expect';
TSCHECKRAND : 'check-random' ;
TSCHECKWITHIN : 'check-within' ;
TSCHECKMEMBEROF :'check-member-of' ;
TSCHECKSATSIS : 'check-satisfied';
TSCHECKERROR :'check-error' ;
REQUIRE : 'require';
DISPLAY : 'display';
DEFINE : 'define';
NEWLINE : 'newline';
EMPTY : 'empty';
DEFINESTRUCT : 'define-struct';
QSMARK : '?';
QUOTESX: '’()';
QUOTEQUOTED : '’';
LEFTB : '(';      
RIGHTB : ')';
LEFTSQB : '[';
RIGHTSQB : ']';
QUOTEQUASIQUOTED : '‘' ;
CHARACTERQUOTED : '\u0027' '()';
ARTHOPERATORS : '+'
              | '-'
              | '*'
              | '/'
              ;
BOOLEAN
    : '#true'
    | '#T'
    | '#t'
    | '#false'
    | '#F'
    | '#f'
    ; 
RELOPERATORS :'<'
          |'='
          |'>'
          ;
SYMBOL : ([$%&!*-+\\^_~])+;
INT: [1-9] [0-9]*
   | '0'
   ;
DECIMAL : INT '.' [0-9]+; 
NAME: ([--:A-Za-z])+;
COMMA : ',';
COMMAAT : ',@';
STRING: '"' ([ -~])* '"';
CHARACTER
    : '#' '\u005C' [A-Za-z0-9]
    | '#' '\u005C' 'space'
    ;
LANG: '#lang' ~ ('\n' | '\r')* '\r'? '\n' -> skip;
COMMENT: ';' ~ ('\n' | '\r')* '\r'? '\n' -> skip;
WS: (' ' | '\r' | '\t' | '\u000C' | '\n') -> skip;
