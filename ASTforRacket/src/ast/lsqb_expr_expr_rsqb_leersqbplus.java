package ast;

public class lsqb_expr_expr_rsqb_leersqbplus extends leersqbplus implements ASTNode {

	ASTNode t1, t2;
	public lsqb_expr_expr_rsqb_leersqbplus(ASTNode t1, ASTNode t2) {
		
		this.t1=t1;
		this.t2=t2;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("lsqb_expr_expr_rsqb_leersqbplus(");
        t1.print();
        System.out.print(", ");
        t2.print();
        System.out.print(")");
	}
	
}
