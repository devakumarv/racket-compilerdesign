package ast;

public class lb_expr_expr_rb_leerbplus_leerbplus extends leerbplus implements ASTNode {
	ASTNode t1, t2,t3;
	public lb_expr_expr_rb_leerbplus_leerbplus(ASTNode t1, ASTNode t2,ASTNode t3) {
		
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("lb_expr_expr_rb_leerbplus_leerbplus(");
        t1.print();
        System.out.print(", ");
        t2.print();
        System.out.print(", ");
        t3.print();
        System.out.print(")");
	}
}
