package ast;

public class lb_and_expr_exprplus_rb_expr extends expr implements ASTNode{
	ASTNode t1, t2;
	public lb_and_expr_exprplus_rb_expr(ASTNode t1, ASTNode t2) {
		
		this.t1=t1;
		this.t2=t2;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("lb_and_expr_exprplus_rb_expr(");
        t1.print();
        System.out.print(", ");
        t2.print();
        System.out.print(")");
	}
	
}
