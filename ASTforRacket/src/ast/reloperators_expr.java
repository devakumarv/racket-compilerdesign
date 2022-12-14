package ast;

public class reloperators_expr extends expr implements ASTNode {
	 String s;
		
		public reloperators_expr(String s) {
			// TODO Auto-generated constructor stub
			this.s=s;
			
			
		}
		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println(" reloperators "+s );
		}

}
