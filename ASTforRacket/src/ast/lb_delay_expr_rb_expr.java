package ast;

public class lb_delay_expr_rb_expr extends expr implements ASTNode {

	ASTNode t1;
	public lb_delay_expr_rb_expr(ASTNode t1) {
		
		this.t1=t1;
	
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("lb_delay_expr_rb_expr(");
        t1.print();
        System.out.print(")");
	}
	
}
