package ast;

public class symbol_expr extends expr implements ASTNode{
	 String s;
		
		public symbol_expr(String s) {
			// TODO Auto-generated constructor stub
			this.s=s;
			
			
		}
		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println("symbol "+s );
		}
}
