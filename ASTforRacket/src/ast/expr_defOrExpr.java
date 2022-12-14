package ast;

public class expr_defOrExpr extends defOrExpr implements ASTNode{

	ASTNode t1;
	public expr_defOrExpr(ASTNode t1) {
		
		this.t1=t1;
	
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("expr_defOrExpr(");
        t1.print();
        System.out.print(")");
	}
}
