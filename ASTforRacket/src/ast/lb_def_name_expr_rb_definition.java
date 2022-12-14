package ast;

public class lb_def_name_expr_rb_definition extends definition implements ASTNode {

	ASTNode t1, t2;
	public lb_def_name_expr_rb_definition(ASTNode t1, ASTNode t2) {
		
		this.t1=t1;
		this.t2=t2;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("lb_def_name_expr_rb_definition(");
        t1.print();
        System.out.print(", ");
        t2.print();
        System.out.print(")");
	}
}
