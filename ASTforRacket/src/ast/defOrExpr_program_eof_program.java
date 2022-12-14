package ast;

public class defOrExpr_program_eof_program extends program implements ASTNode
{
	ASTNode t1, t2;
	public defOrExpr_program_eof_program(ASTNode t1, ASTNode t2) {
		
		this.t1=t1;
		this.t2=t2;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("defOrExpr_program_eof_program(");
        t1.print();
        System.out.print(", ");
        t2.print();
        System.out.print(")");
	}

}
