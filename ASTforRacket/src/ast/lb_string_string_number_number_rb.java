package ast;

public class lb_string_string_number_number_rb extends pkg implements ASTNode{
	ASTNode t1,t2,t3,t4;
	public lb_string_string_number_number_rb(ASTNode t1,ASTNode t2,ASTNode t3,ASTNode t4) {
		
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
		this.t4=t4;
	
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("lb_string_string_number_number_rb(");
        t1.print();
        System.out.print(")");
	}
	
}
