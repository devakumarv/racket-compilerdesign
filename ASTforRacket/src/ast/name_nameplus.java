package ast;

public class name_nameplus extends nameplus implements ASTNode{

    String s;
	
	public name_nameplus(String s) {
		// TODO Auto-generated constructor stub
		this.s=s;
		
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("name "+s );
	}
}
