package ast;

public class name_nameplus_nameplus extends nameplus implements ASTNode
{
	ASTNode t1, t2;
	public name_nameplus_nameplus(ASTNode t1, ASTNode t2) {
		
		this.t1=t1;
		this.t2=t2;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("namenameplusnameplus(");
        t1.print();
        System.out.print(", ");
        t2.print();
        System.out.print(")");
	}

}