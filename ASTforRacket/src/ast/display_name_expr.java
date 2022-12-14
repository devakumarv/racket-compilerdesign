package ast;

public class display_name_expr extends expr implements ASTNode{

     String display; ASTNode t1;
	
	public display_name_expr(String i, ASTNode t1) {
		// TODO Auto-generated constructor stub
		this.display =i;
		this.t1=t1;		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("display_name_expr(" + display + ", " );
        t1.print();   
        System.out.println(")");
	}
	
}
