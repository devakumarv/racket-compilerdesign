package ast;

public class quotesx_expr extends expr implements ASTNode {
    String s;
	
	public quotesx_expr(String s) {
		// TODO Auto-generated constructor stub
		this.s=s;
		
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" ’() "+s );
	}
	
}
