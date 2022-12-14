package ast;

public class expr_exprplus_exprplus extends exprplus implements ASTNode{
	
	ASTNode t1, t2;
	public expr_exprplus_exprplus(ASTNode t1, ASTNode t2) {
		
		this.t1=t1;
		this.t2=t2;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("expr_exprplus_exprplus(");
        t1.print();
        System.out.print(", ");
        t2.print();
        System.out.print(")");
	}
}
