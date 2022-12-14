package ast;

public class expr_exprplus extends exprplus implements ASTNode {
	ASTNode t1;
	public expr_exprplus(ASTNode t1) {
		
		this.t1=t1;
	
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("expr_exprplus(");
        t1.print();
        System.out.print(")");
	}

}
