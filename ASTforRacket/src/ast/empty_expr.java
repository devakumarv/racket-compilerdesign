package ast;

public class empty_expr extends expr implements ASTNode{
	
   String s;
	
	public empty_expr(String s) {
		// TODO Auto-generated constructor stub
		this.s=s;
		
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" empty "+s );
	}
}
