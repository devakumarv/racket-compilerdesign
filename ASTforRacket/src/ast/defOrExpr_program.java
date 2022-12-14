package ast;

public class defOrExpr_program extends program implements ASTNode
{
	ASTNode t1;
	public defOrExpr_program(ASTNode t1) {
		
		this.t1=t1;
	
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("defOrExpr_program(");
        t1.print();
        System.out.print(")");
	}

}
