package ast;

public class definition_definitionstar_definitionstar extends definitionstar implements ASTNode {
	
	ASTNode t1, t2;
	public definition_definitionstar_definitionstar(ASTNode t1, ASTNode t2) {
		
		this.t1=t1;
		this.t2=t2;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("definition_definitionstar_definitionstar(");
        t1.print();
        System.out.print(", ");
        t2.print();
        System.out.print(")");
	}

}
