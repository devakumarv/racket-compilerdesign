package ast;

public class characterquoted_expr extends expr implements ASTNode{

String s;
	
	public characterquoted_expr(String s) {
		// TODO Auto-generated constructor stub
		this.s=s;
		
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" \\u0027' '() "+s );
	}
	
}
