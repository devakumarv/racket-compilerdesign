package ast;

public class arthoperators_expr extends expr implements ASTNode {
	 String s;
		
		public arthoperators_expr(String s) {
			// TODO Auto-generated constructor stub
			this.s=s;
			
			
		}
		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println(" arthoperators "+s );
		}
}
