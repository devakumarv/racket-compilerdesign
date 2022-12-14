grammar ASTspec;
@parser::header { import ast.*; }

start : t1= program {$t1.node.print();};

program returns [ASTNode node]: t1=defOrExpr t2=program EOF {$node = new defOrExpr_program_eof_program($t1.node,$t2.node);}
                               | t3=defOrExpr {$node = new defOrExpr_program($t3.node);};

defOrExpr returns [ASTNode node] :t1=definition {$node = new definition_defOrExpr($t1.node);}
                                 | t2=expr {$node = new expr_defOrExpr($t2.node);};
          
nameplus  returns [ASTNode node] : t1=name t2=nameplus {$node = new name_nameplus_nameplus($t1.node,$t2.node);}
                                  | t3=name {$node = $t3.node};
                                  
namestar  returns [ASTNode node] : t1=name t2=namestar {$node = new name_namestar_namestar($t1.node,$t2.node);}
		                         | {$node = new epsilon_namestar();}
		                         ; 
		 
definitionstar  returns [ASTNode node] : t1=definition t2=definitionstar {$node = new definition_definitionstar_definitionstar($t1.node,$t2.node);}
			                           | {$node = new epsilon_definitionstar();}
			                           ; 
			             
definition  returns [ASTNode node] : (LEFTB DEFINE t1=name t2=expr RIGHTB {$node = new lb_def_name_expr_rb_definition($t1.node,$t2.node);}) 
                                   | (LEFTB DEFINE LEFTB t3=name t4=nameplus RIGHTB t5=expr RIGHTB {$node = new lb_def_lb_name_nameplus_rb_expr_rb_definition($t3.node,$t4.node,$t5.node);})
                                   | (LEFTB DEFINESTRUCT t6=name LEFTB t7=namestar RIGHTB RIGHTB {$node = new lb_defs_name_lb_namestar_rb_rb($t6.node,$t7.node);});
           
exprplus  returns [ASTNode node] : t1=expr t2=exprplus {$node = new expr_exprplus_exprplus($t1.node,$t2.node);}
		                         | t3=expr {$node = new expr_exprplus($t3.node);};
		 
lner  returns [ASTNode node] : (LEFTSQB t1=name t2=expr RIGHTSQB t3=lner {$node = new lsqb_name_expr_rsqb_lner_lner($t1.node,$t2.node,$t3.node);})
	                         | {$node = new epsilon_lner();}
	                         ;
	 
leerbplus  returns [ASTNode node] : (LEFTB t1=expr t2=expr RIGHTB t3=leerbplus {$node = new lb_expr_expr_rb_leerbplus_leerbplus($t1.node,$t2.node,$t3.node);})
		                          | (LEFTB t4=expr t5=expr RIGHTB {$node = new lb_expr_expr_rb_leerbplus($t4.node,$t5.node);}) ;
		   
leersqbplus  returns [ASTNode node] : (LEFTSQB t1=expr t2=expr RIGHTSQB t3=leersqbplus {$node = new lsqb_expr_expr_rsqb_leersqbplus_leersqbplus($t1.node,$t2.node,$t3.node);} )
		                        	| (LEFTSQB t4=expr t5=expr RIGHTSQB {$node = new lsqb_expr_expr_rsqb_leersqbplus($t4.node,$t5.node);});
			
leersqbstar  returns [ASTNode node] : (LEFTSQB t1=expr t2=expr RIGHTSQB t3=leersqbstar {$node = new lsqb_expr_expr_rsqb_leersqbstar_leersqbstar($t1.node,$t2.node,$t3.node);} )
			                        | {$node = new epsilon_leersqbstar();}
			                        ;
			
expr  returns [ASTNode node]: (LEFTB BEGINN t1=exprplus RIGHTB {$node = new lb_begin_exprplus_rb_expr($t1.node);})

    | (LEFTB BEGINN0 t2=exprplus RIGHTB {$node = new lb_begin0_exprplus_rb_expr($t2.node);})
    
    | (LEFTB SETNQ NAME t3=expr RIGHTB {$node = new lb_setnq_name_expr_rb_expr($t3.node);})
    
    | (LEFTB DELAY t4=expr RIGHTB {$node = new lb_delay_expr_rb_expr($t4.node);})
    
    | (LEFTB CAR t5=expr RIGHTB {$node = new lb_car_expr_rb_expr($t5.node);})
    
    | (LEFTB CDR t6=expr RIGHTB {$node = new lb_cdr_expr_rb_expr($t6.node);})
    
    | (LEFTB COMBINATIONS t7=expr RIGHTB {$node = new lb_combinations_expr_rb_expr($t7.node);})
    
    | (LEFTB LIST t8=expr RIGHTB {$node = new lb_list_expr_rb_expr($t8.node);})
    
    | (LEFTB REVERSE t9=expr RIGHTB {$node = new lb_reverse_expr_rb_expr($t9.node);})
    
    | (LEFTB APPEND NAME t10=expr RIGHTB {$node = new lb_append_name_expr_rb_expr($t10.node);})
    
    | (LEFTB LAMBDA LEFTB t11=namestar RIGHTB t12=expr RIGHTB {$node = new lb_lambda_lb_namestar_rb_expr_rb_expr($t11.node,$t12.node);})
    
    | (LEFTB LAMBDASYM LEFTB t13=namestar RIGHTB t14=expr RIGHTB {$node = new lb_lambdasym_lb_namestar_rb_expr_rb_expr($t13.node,$t14.node);})
    
    | (LEFTB LOCAL LEFTSQB t15=definitionstar RIGHTSQB t16=expr RIGHTB {$node = new lb_local_lsqb_definitionstar_rsqb_expr_rb_expr($t15.node,$t16.node);})
    
    | (LEFTB LETREC LEFTB t17=lner RIGHTB t18=expr RIGHTB {$node = new lb_letrec_lb_definitionstar_rsqb_expr_rb_expr($t17.node,$t18.node);})
    
    | (LEFTB SHARED LEFTB t19=lner RIGHTB t20=expr RIGHTB {$node = new lb_shared_lb_lner_rb_expr_rb_expr($t19.node,$t20.node);})
    
    | (LEFTB LET LEFTB t21=lner RIGHTB t22=expr RIGHTB {$node = new lb_let_lb_lner_rb_expr_rb_expr($t21.node,$t22.node);})
    
    | (LEFTB LETSTAR LEFTB t23=lner RIGHTB t24=expr RIGHTB {$node = new lb_letstar_lb_lner_rb_expr_rb_expr($t23.node,$t24.node);})
    
    | (LEFTB RECUR t25=name LEFTB t26=lner RIGHTB t27=expr RIGHTB {$node = new lb_recur_name_lb_lner_rb_expr_rb_expr($t25.node,$t26.node,$t27.node);})
    
    | (LEFTB t28=name t29=exprplus RIGHTB {$node = new lb_name_exprplus_rb_expr($t28.node,$t29.node);})
    
    | (LEFTB COND t30=leerbplus RIGHTB {$node = new lb_cond_leerbplus_rb_expr($t30.node);})
    
    | (LEFTB COND t31=leersqbplus RIGHTB {$node = new lb_cond_leersqbplus_rb_expr($t31.node);})
    
    | (LEFTB COND t32=leersqbstar LEFTSQB ELSE t33=expr RIGHTSQB RIGHTB {$node = new lb_cond_leersqbstar_lsqb_else_expr_rsqb_rb_expr($t32.node,$t33.node);})
    
    | (LEFTB IF  t34=expr t35=expr t36=expr RIGHTB {$node = new lb_if_expr_expr_expr_rb_expr($t34.node,$t35.node,$t36.node);})
    
    | (LEFTB AND t37=expr t38=exprplus RIGHTB {$node = new lb_and_expr_exprplus_rb_expr($t37.node,$t38.node);} )
    
    | (LEFTB OR  t39=expr t40=exprplus RIGHTB {$node = new lb_or_expr_exprplus_rb_expr($t39.node,$t40.node);})
    
    | (DISPLAY t41=name {$node = new display_name_expr($DISPLAY.text,$t41.node);})
    
    | (DISPLAY t42=string {$node = new display_string_expr($DISPLAY.text,$t42.node);})
    
    | NEWLINE  { $node= new newline_expr($NEWLINE.text);}
    
    | EMPTY { $node= new empty_expr($EMPTY.text);}
    
    | QUOTESX { $node= new quotesx_expr($QUOTESX.text);}
    
    | QSMARK { $node= new qsmark_expr($QSMARK.text);}
    
    | CHARACTERQUOTED { $node= new characterquoted_expr($CHARACTERQUOTED.text);}
    
    | t43=reloperators {$node = $t43.node}
    
    | t44=arthoperators {$node = $t44.node}
    
    | t45=name {$node = $t45.node}
    
    | t46=number {$node = $t46.node}
    
    | t47=symbol {$node = $t47.node}
    
    | t48=bool {$node = $t48.node}
    
    | t49=string {$node = $t49.node}
    
    | t50=character {$node = $t50.node}
    ;

pkg  returns [ASTNode node] : (LEFTB t1=string t2=string t3=number t4=number RIGHTB {$node = new lb_string_string_number_number_rb($t1.node,$t2.node,$t3.node,$t4.node);});

name  returns [ASTNode node]:(NAME { $node= new name_nameplus($NAME.text);} );

symbol returns [ASTNode node]: (SYMBOL { $node= new symbol_expr($SYMBOL.text);} );
    
number  returns [ASTNode node]: (INT { $node= new int_expr($INT.text);})
	                           | (DECIMAL { $node= new decimal_expr($DECIMAL.text);});

bool  returns [ASTNode node]: (BOOLEAN { $node= new boolean_expr($BOOLEAN.text);});

string  returns [ASTNode node] : (STRING { $node= new string_expr($STRING.text);});

character  returns [ASTNode node]: (CHARACTER { $node= new character_expr($CHARACTER.text);}) ;

reloperators  returns [ASTNode node]: (RELOPERATORS { $node= new reloperators_expr($RELOPERATORS.text);});

arthoperators  returns [ASTNode node]: (ARTHOPERATORS { $node= new arthoperators_expr($ARTHOPERATORS.text);});

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