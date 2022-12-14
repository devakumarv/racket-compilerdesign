package ast;

public class string_expr extends expr implements ASTNode{
	 String s;
		
		public string_expr(String s) {
			// TODO Auto-generated constructor stub
			this.s=s;
			
			
		}
		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println(" string "+s );
		}

}
