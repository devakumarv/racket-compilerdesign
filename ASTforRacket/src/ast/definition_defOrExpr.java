package ast;

public class definition_defOrExpr extends defOrExpr implements ASTNode{

	ASTNode t1;
	public definition_defOrExpr(ASTNode t1) {
		
		this.t1=t1;
	
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("definition_defOrExpr(");
        t1.print();
        System.out.print(")");
	}
}
