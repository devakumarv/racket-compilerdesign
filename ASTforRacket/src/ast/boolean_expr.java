package ast;

public class boolean_expr extends expr implements ASTNode{

	    String s;
		
		public boolean_expr(String s) {
			// TODO Auto-generated constructor stub
			this.s=s;
			
			
		}
		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println(" boolean "+s );
		}
}
