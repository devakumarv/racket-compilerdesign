import org.antlr.v4.runtime.*;
public class RDP {
	hello lexer;
	Token token;
	RDP(hello lexer){
		this.lexer = lexer;
	}
	public void start() {
		  token = lexer.nextToken();
	      System.out.println("The final result of the RDP process returns -> "+ program());
	}
	
//program : defOrExpr program EOF
//  |defOrExpr 
//  ;
	
	public boolean program() {
		System.out.println("In program : "+token.getType()+" "+token.getText());
		if(defOrExpr()) {
			if(program()) {
				if(token.getText()== "<EOF>") {
					System.out.println("Exiting program, : "+token.getType()+" "+token.getText());
					return true;
				}
			}
			else if(token.getText()== "<EOF>") {
				System.out.println("Exiting program, : "+token.getType()+" "+token.getText());
				return true;
			}
		}
		 System.out.println("False condition in program, : "+token.getType()+" "+token.getText());
		return false;
	}

	
//defOrExpr : definition
//  | expr;
	

	public boolean defOrExpr() {
		System.out.println("In defOrExpr"+": "+token.getType()+" "+token.getText());
		if(definition()) {
			System.out.println("Exiting definition, : "+token.getType()+" "+token.getText());
			return true;
			}
		else if(expr()) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
			}
		System.out.println("False condition in defOrExpr, : "+token.getType()+" "+token.getText());
		return false;
	
	}
//nameplus : name nameplus
//  | name ;
	
	public boolean nameplus() {
		System.out.println("In nameplus"+": "+token.getType()+" "+token.getText());
		if(name()) {
			token = lexer.nextToken();
			if(nameplus()) {
				System.out.println("Exiting nameplus, : "+token.getType()+" "+token.getText());
				return true;
			}
			
			else if(!nameplus()){
			    System.out.println("Exiting nameplus, : "+token.getType()+" "+token.getText());
				return true;
			}
		}
		System.out.println("False condition in nameplus, : "+token.getType()+" "+token.getText());
		return false;
	}
//namestar : name namestar
//	 | 
//	 ;	
	
   public boolean namestar() {
	   System.out.println("In namestar"+": "+token.getType()+" "+token.getText());
		if(name()) {
			if(namestar()) {
				System.out.println("Exiting namestar, : "+token.getType()+" "+token.getText());
				return true;
			}
			else {
				System.out.println("False condition in namestar, : "+token.getType()+" "+token.getText());
				return false;
				}
		}
		System.out.println("Exiting namestar, : "+token.getType()+" "+token.getText());
		return true;
	}
   
//definitionstar : definition definitionstar
//   | 
//   ;
   
   public boolean definitionstar() {
	   System.out.println("In definitionstar"+": "+token.getType()+" "+token.getText());
		if(definition()) {
			if(definitionstar()) {
				System.out.println("Exiting definitionstar, : "+token.getType()+" "+token.getText());
				return true;
			}
			else {
				System.out.println("False condition in definitionstar, : "+token.getType()+" "+token.getText());
				return false;
				}
		}
		System.out.println("Exiting definitionstar, : "+token.getType()+" "+token.getText());
		return true;
	}
   
  
//exprplus : expr exprplus 
//	 | expr
//	 ;
   
   public boolean exprplus() {
		System.out.println("In exprplus"+": "+token.getType()+" "+token.getText());
		if(expr()) {
			if(exprplus()) {
				System.out.println("Exiting exprplus, : "+token.getType()+" "+token.getText());
				return true;
			}
			
			else if(!exprplus()){
			    System.out.println("Exiting exprplus, : "+token.getType()+" "+token.getText());
				return true;
			}
		}
		System.out.println("False condition in exprplus, : "+token.getType()+" "+token.getText());
		return false;
	}

 //stringplus : string stringplus
//	| string
//	;
   
   public boolean stringplus() {
		System.out.println("In stringplus"+": "+token.getType()+" "+token.getText());
		if(string()) {
			token = lexer.nextToken();
			if(stringplus()) {
				System.out.println("Exiting stringplus, : "+token.getType()+" "+token.getText());
				return true;
			}
			
			else if(token.getType()==-1){
			    System.out.println("Exiting stringplus, : "+token.getType()+" "+token.getText());
				return true;
			}
		}
		System.out.println("False condition in stringplus, : "+token.getType()+" "+token.getText());
		return false;
	}
   
   
 //name: NAME;
   public boolean name() {
		System.out.println("In name"+": "+token.getType()+" "+token.getText());
		//token = lexer.nextToken();
	    if(token.getType()==52) {
	    	System.out.println("Exiting name, : "+token.getType()+" "+token.getText());
		   return true;
	   }
	    System.out.println("False condition in name, : "+token.getType()+" "+token.getText());
	   return false;
   }
   
 //number : INT|DECIMAL;
   public boolean number() {
	   System.out.println("In number"+": "+token.getType()+" "+token.getText());
		//token = lexer.nextToken();
	   if(token.getType()==50) {
		   System.out.println("Exiting number, : "+token.getType()+" "+token.getText());
		   return true;
	   }
	   else if(token.getType()==51) {
		   System.out.println("Exiting number, : "+token.getType()+" "+token.getText());
		   return true;
	   }
	   System.out.println("False condition in number, : "+token.getType()+" "+token.getText());
      return false;
   }
   
 //symbol : SYMBOL;
   public boolean symbol() {
	   System.out.println("In symbol"+": "+token.getType()+" "+token.getText());
		//token = lexer.nextToken();
	   if(token.getType()==49) {
		   System.out.println("Exiting symbol, : "+token.getType()+" "+token.getText());
		   return true;
	   }
	   System.out.println("False condition in symbol, : "+token.getType()+" "+token.getText());
	   return false;
   }
   
   
 //bool : BOOLEAN;  
   public boolean bool() {
	   System.out.println("In bool"+": "+token.getType()+" "+token.getText());
		//token = lexer.nextToken();
	   if(token.getType()==47) {
		   System.out.println("Exiting bool, : "+token.getType()+" "+token.getText());
		   return true;
	   }
	   System.out.println("False condition in bool, : "+token.getType()+" "+token.getText());
	   return false;
   }
   
   
 //string : STRING;
   public boolean string() {
		System.out.println("In string"+": "+token.getType()+" "+token.getText());
		//token = lexer.nextToken();
	   if(token.getType()==55) {
		   System.out.println("Exiting string, : "+token.getType()+" "+token.getText());
		   return true;
	   }
	   System.out.println("False condition in string, : "+token.getType()+" "+token.getText());
      return false;
   }
   
   
 //character : CHARACTER ;
   public boolean character() {
	   System.out.println("In character"+": "+token.getType()+" "+token.getText());
		//token = lexer.nextToken();
	   if(token.getType()==56) {
		   System.out.println("Exiting character, : "+token.getType()+" "+token.getText());
		   return true;
	   }
	   System.out.println("False condition in character, : "+token.getType()+" "+token.getText());
	   return false;
   }
   
   
 //arthoperators : ARTHOPERATORS;
   public boolean arthoperators() {
	   System.out.println("In arthoperators"+": "+token.getType()+" "+token.getText());
		//token = lexer.nextToken();
	   if(token.getType()==46) {
		   System.out.println("Exiting arthoperators, : "+token.getType()+" "+token.getText());
		   return true;
	   }
	   System.out.println("False condition in arthoperators, : "+token.getType()+" "+token.getText());
	   return false;
   }
   
   
 //reloperators : RELOPERATORS; 
   public boolean reloperators() {
	   System.out.println("In reloperators"+": "+token.getType()+" "+token.getText());
	   //token = lexer.nextToken();
	   if(token.getType()==48) {
		   System.out.println("Exiting reloperators, : "+token.getType()+" "+token.getText());
		   return true;
	   }
	  System.out.println("False condition in reloperators, : "+token.getType()+" "+token.getText());
	  return false;
   }
   
   
 //lner : LEFTSQB name expr RIGHTSQB lner
//	 | 
//	 ;  
   
   
   public boolean lner() {
	   System.out.println("In lner"+": "+token.getType()+" "+token.getText());
	   //token = lexer.nextToken();
	   if(token.getType()==42) {
		   if(name()) {
			   if(expr()) {
				   token = lexer.nextToken();
				   if(token.getType()==43) {
					   if(lner()) {
						   System.out.println("Exiting lner, : "+token.getType()+" "+token.getText());
						   return true;
					   }
					   else {
						   System.out.println("False condition in lner, : "+token.getType()+" "+token.getText());
						   return false;
						   }
				   }
				   else {
					   System.out.println("False condition in lner, : "+token.getType()+" "+token.getText());
					   return false;
					   }
			   }
			   else {
				   System.out.println("False condition in lner, : "+token.getType()+" "+token.getText());
				   return false;
			   }
		   }
		   else {
			   System.out.println("False condition in lner, : "+token.getType()+" "+token.getText());
			   return false;
		   }
	   }
	  System.out.println("Exiting lner, : "+token.getType()+" "+token.getText());
      return true;
   }
   
 //leersqbstar : LEFTSQB expr expr RIGHTSQB leersqbstar
//	| 
//	;
   
   public boolean leersqbstar() {
	   System.out.println("In leersqbstar : "+token.getType()+" "+token.getText());
	  //token = lexer.nextToken();
	   if(token.getType()==42) {
		   if(expr()) {
			   if(expr()) {
				   token = lexer.nextToken();
				   if(token.getType()==43) {
					   if(leersqbstar()) {
						   System.out.println("Exiting leersqbstar, : "+token.getType()+" "+token.getText());
						   return true;
					   }
					   else {
						   System.out.println("False condition in leersqbstar, : "+token.getType()+" "+token.getText());
						   return false;
						   }
				   }
				   else {
					   System.out.println("False condition in leersqbstar, : "+token.getType()+" "+token.getText());
					   return false;
					   }
			   }
			   else {
				   System.out.println("False condition in leersqbstar, : "+token.getType()+" "+token.getText());
				   return false;
			   }
		   }
		   else {
			   System.out.println("False condition in leersqbstar, : "+token.getType()+" "+token.getText());
			   return false;
		   }
	   }
	     System.out.println("Exiting leersqbstar, : "+token.getType()+" "+token.getText());
	      return true;
   }
   
   
 //leerbplus : LEFTB expr expr RIGHTB leerbplus
//	  | LEFTB expr expr RIGHTB
//	  ;  
   
   public boolean leerbplus() {
	   System.out.println("In leerbplus : "+token.getType()+" "+token.getText());
	   token = lexer.nextToken();
	   if(token.getType()==40) {
		   if(expr()) {
			   if(expr()) {
				   token = lexer.nextToken();
				   if(token.getType()==41) {
					   if(leerbplus()) {
						   System.out.println("Exiting leerbplus, : "+token.getType()+" "+token.getText());
						   return true;
					   }
					   else {
						   System.out.println("Exiting leerbplus, : "+token.getType()+" "+token.getText());
						   return true;
						   }
				   }
			   } 
		   }
	   }
	   System.out.println("False condition in leerbplus, : "+token.getType()+" "+token.getText());
	   return false;
   }
   
   
 //leersqbplus : LEFTSQB expr expr RIGHTSQB leersqbplus
//	| LEFTSQB expr expr RIGHTSQB
//	;  
   public boolean leersqbplus() {
	   System.out.println("In leersqbplus : "+token.getType()+" "+token.getText());
	   token = lexer.nextToken();
	   if(token.getType()==42) {
		   if(expr()) {
			   if(expr()) {
				   token = lexer.nextToken();
				   if(token.getType()==43) {
					   if(leersqbplus()) {
						   System.out.println("Exiting leersqbplus, : "+token.getType()+" "+token.getText());
						   return true;
					   }
					   else {
						   System.out.println("Exiting leersqbplus, : "+token.getType()+" "+token.getText());
						   return true;
						   }
				   }
			   }
			  
		   }
		   
	   }
	  return false;
   }
   
//definition : LEFTB DEFINE name expr RIGHTB
// | LEFTB DEFINE LEFTB name nameplus RIGHTB expr RIGHTB
// | LEFTB DEFINESTRUCT name LEFTB namestar RIGHTB RIGHTB
// ;
   
	public boolean definition() {
		System.out.println("In definition"+": "+token.getType()+" "+token.getText());
		if(token.getType()== 40) {
			token = lexer.nextToken();
			if(token.getType()==33) {
				token = lexer.nextToken();
				if(name()) {
					if(expr()) {
						token = lexer.nextToken();
						if(token.getType()==41) {
							token = lexer.nextToken();
							System.out.println("Exiting definition, : "+token.getType()+" "+token.getText());
							return true;
						}
					} 
				}
				else if(token.getType()==40) {
					token = lexer.nextToken();
						if(name()) {
							if(nameplus()) {
								if(token.getType()==41) {
									if(expr()) {
										token = lexer.nextToken();
										if(token.getType()==41) {
											token = lexer.nextToken();
											System.out.println("Exiting definition, : "+token.getType()+" "+token.getText());
											return true;
										}
									}
								}
							}
						}
				}
			}
			else if(token.getType()==36) {
				if(name()) {
					token=lexer.nextToken();
					if(token.getType()==40) {
						if(namestar()) {
							token=lexer.nextToken();
							if(token.getType()==41) {
								token=lexer.nextToken();
								if(token.getType()==41) {
									System.out.println("Exiting definition, : "+token.getType()+" "+token.getText());
									return true;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("False condition in definition, : "+token.getType()+" "+token.getText());
		return false;
	}
	
//expr: LEFTB BEGINN exprplus RIGHTB
//  | LEFTB BEGINN0 exprplus RIGHTB
//  | LEFTB SETNQ NAME expr RIGHTB
//  | LEFTB DELAY expr RIGHTB
//  | LEFTB CAR expr RIGHTB
//  | LEFTB CDR expr RIGHTB
//  | LEFTB COMBINATIONS expr RIGHTB
//  | LEFTB LIST expr RIGHTB
//  | LEFTB REVERSE expr RIGHTB
//  | LEFTB APPEND NAME expr RIGHTB
//  | LEFTB LAMBDA LEFTB namestar RIGHTB expr RIGHTB
//  | LEFTB LAMBDASYM LEFTB namestar RIGHTB expr RIGHTB
//  | LEFTB LOCAL LEFTSQB definitionstar RIGHTSQB expr RIGHTB
//  | LEFTB LETREC LEFTB lner RIGHTB expr RIGHTB
//  | LEFTB SHARED LEFTB lner RIGHTB expr RIGHTB
//  | LEFTB LET LEFTB lner RIGHTB expr RIGHTB
//  | LEFTB LETSTAR LEFTB lner RIGHTB expr RIGHTB
//  | LEFTB RECUR name LEFTB lner RIGHTB expr RIGHTB
//  | LEFTB name exprplus RIGHTB
//  | LEFTB COND leerbplus RIGHTB
//  | LEFTB COND leersqbplus RIGHTB
//  | LEFTB COND leersqbstar LEFTSQB ELSE expr RIGHTSQB RIGHTB
//  | LEFTB IF  expr expr expr RIGHTB
//  | LEFTB AND expr exprplus RIGHTB
//  | LEFTB OR  expr exprplus RIGHTB
//  | DISPLAY name
//  | DISPLAY string
//  | NEWLINE
//  | EMPTY
//  | QUOTESX
//  | QSMARK
//  | QUOTEQUOTED quoted
//  | QUOTEQUASIQUOTED quasiQuoted
//  | CHARACTERQUOTED
//  | reloperators
//  | arthoperators
//  | name
//  | number
//  | symbol
//  | bool
//  | string
//  | character
//  ;							
	
	
	public boolean expr() {
		System.out.println("In expr"+": "+token.getType()+" "+token.getText());
		token = lexer.nextToken();
		if(token.getType()==40) {
			token = lexer.nextToken();
			if(token.getType()==1) {
				token = lexer.nextToken();
				if(exprplus()) {
					if(token.getType()==41) {
						System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
						return true;
				    }	 
				}
			}
			
			else if(token.getType()==2) {
				token=lexer.nextToken();
				if(exprplus()) {
					if(token.getType()==41) {
						System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
						return true;
						}
				}
			}
			
			else if(token.getType()==3) {
				token=lexer.nextToken();
				if(token.getType()==52) {
					if(expr()) {
						if(token.getType()==41) {
							System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
							return true;
						}
					}		
				}
			}
			
			else if(token.getType()==5) {
				token=lexer.nextToken();
				if(expr()) {
					if(token.getType()==41) {
						System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
						return true;
					}
				}
			}
			
			else if(token.getType()==6) {
				token=lexer.nextToken();
				if(expr()) {
					if(token.getType()==41) {
						System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
						return true;
					}
				}
			}
			
			else if(token.getType()==7) {
				token=lexer.nextToken();
				if(expr()) {
					if(token.getType()==41) {
						System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
						return true;
					}
				}
			}
			
			else if(token.getType()==8) {
				token=lexer.nextToken();
				if(expr()) {
					if(token.getType()==41) {
						System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
						return true;
					}
				}
			}
			
			else if(token.getType()==9) {
				if(expr()) {
					token=lexer.nextToken();
					if(token.getType()==41) {
						token = lexer.nextToken();
						System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
						return true;
					}
				}
			}
			
			else if(token.getType()==10) {
				if(expr()) {
					if(token.getType()==41) {
						System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
						return true;
						}
				}
			}
			
			else if(token.getType()==11) {
				token=lexer.nextToken();
				if(token.getType()==52) {
					if(expr()) {
						token = lexer.nextToken();
						if(token.getType()==41) {
							//token = lexer.nextToken();
							System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
							return true;
							}	
					}
				}
			}
			
			else if(token.getType()==12) {
				token = lexer.nextToken();
				if(token.getType()==40) {
					if (namestar()) {
						token = lexer.nextToken();
						if(token.getType()==41) {
							if(expr()) {
								token = lexer.nextToken();
								if(token.getType()==41) {
									System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
									return true;
									}		
							}
						}	
					}
				}
			}
			
			else if(token.getType()==13) {
				token = lexer.nextToken();
				if(token.getType()==40) {
					if (namestar()) {
						token = lexer.nextToken();
						if(token.getType()==41) {
							if(expr()) {
								token = lexer.nextToken();
								if(token.getType()==41) {
									System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
									return true;
								}
							}	
						}	
					}
				}
			}
			
			else if(token.getType()==14) {
				token = lexer.nextToken();
				if(token.getType()==42) {
					if (definitionstar()) {
						token = lexer.nextToken();
						if(token.getType()==43) {
							if(expr()) {
								token = lexer.nextToken();
								if(token.getType()==41) {
									System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
									return true;
								}
							}
						}
					}
				}
			}
			
			else if(token.getType()==15) {
				token = lexer.nextToken();
				if(token.getType()==40) {
					if (lner()) {
						if(token.getType()==41) {
							if(expr()) {
								if(token.getType()==41) {
									System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
									return true;
								}
							}
						}
					}
				}
			}
			
			else if(token.getType()==16) {
				token = lexer.nextToken();
				if(token.getType()==40) {
					if (lner()) {
						token = lexer.nextToken();
						if(token.getType()==41) {
							if(expr()) {
								token = lexer.nextToken();
								if(token.getType()==41) {
									System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
									return true;
								}
							}
						}
					}
				}
			}
			
			else if(token.getType()==17) {
				token = lexer.nextToken();
				if(token.getType()==40) {
					if (lner()) {
						token = lexer.nextToken();
						if(token.getType()==41) {
							if(expr()) {
								token = lexer.nextToken();
								if(token.getType()==41) {
									System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
									return true;
								}
							}	
						}
					}
				}
			}
			
			else if(token.getType()==18) {
				token = lexer.nextToken();
				if(token.getType()==40) {
					if (lner()) {
						token = lexer.nextToken();
						if(token.getType()==41) {
							if(expr()) {
								token = lexer.nextToken();
								if(token.getType()==41) {
									System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
									return true;
								}
							}
						}
					}
				}
			}
			
			else if(token.getType()==19) {
				if(name()) {
					token = lexer.nextToken();
					if(token.getType()==40) {
						if (lner()) {
							token = lexer.nextToken();
							if(token.getType()==41) {
								if(expr()) {
									token = lexer.nextToken();
									if(token.getType()==41) {
										System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
										return true;
									}									
								}						
							}							
						}						
					}					
				}
			}
			
			else if(name()) {
				if(exprplus()) {
					if(token.getType()==41) {
						System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
						return true;
					}
				}
			}
			
			else if(token.getType()==20) {
				if(leerbplus()) {
					token = lexer.nextToken();
					if(token.getType()==41) {
						System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
						return true;
					}
				}
			}
			
			else if(token.getType()==20) {
				if(leersqbplus()) {
					token = lexer.nextToken();
					if(token.getType()==41) {
						System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
						return true;
					}
				}
			}
			
			else if(token.getType()==20) {
				if(leersqbstar()) {
					token = lexer.nextToken();
					if(token.getType()==42) {
						token = lexer.nextToken();
						if(token.getType()==21) {
							if(expr()) {
								token = lexer.nextToken();
								if(token.getType()==43) {
									token = lexer.nextToken();
									if(token.getType()==41) {
										System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
										return true;
									}	
								}	
							}
						}		
					}
				}
			}
			
			else if(token.getType()==22) {
				if(expr()) {
					if(expr()) {
						if(expr()) {
							if(token.getType()==41) {
								System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
								return true;
							}
						}
					}
				}
			}
			
			else if(token.getType()==23) {
				if(expr()) {
						if(exprplus()) {
							if(token.getType()==41) {
								System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
								return true;
							}
						}
				}
			}
			
			else if(token.getType()==24) {
				if(expr()) {
					if(exprplus()) {
						if(token.getType()==41) {
							System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
							return true;
						}
					}
			}
		}		
	}
		else if(token.getType()==32) {
			token = lexer.nextToken();
			if(name()) {
				System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
				return true;
			}
			else if(string()) {
				System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
				return true;
			}
		}
	
		else if(token.getType()==34) {
			token = lexer.nextToken();
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
		}
		else if(token.getType()==35) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
		}
		else if(token.getType()==38) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
		}
		else if(token.getType()==37) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
		}
		else if(reloperators()) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
			}
		else if(arthoperators()) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
			}
		else if(name()) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
			}
		else if(number()) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
			}
		else if(symbol()) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
			}
		else if(bool()) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
			}
		else if(string()) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
			}
		else if(character()) {
			System.out.println("Exiting expr, : "+token.getType()+" "+token.getText());
			return true;
			}
		System.out.println("False condition in expr, : "+token.getType()+" "+token.getText());
		return false;
	}
	
}

//( define ( push x )
//( set! stack ( append stack ( list x ) ) ) )
