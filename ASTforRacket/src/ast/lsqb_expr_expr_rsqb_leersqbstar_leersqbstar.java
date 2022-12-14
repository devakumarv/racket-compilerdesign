package ast;

public class lsqb_expr_expr_rsqb_leersqbstar_leersqbstar extends leersqbstar implements ASTNode  {
	ASTNode t1, t2, t3;
	public lsqb_expr_expr_rsqb_leersqbstar_leersqbstar(ASTNode t1,ASTNode t2,ASTNode t3) {
		
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
	
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("lsqb_expr_expr_rsqb_leersqbstar_leersqbstar(");
        t1.print();
        System.out.print(", ");
        t2.print();
        System.out.print(", ");
        t3.print();
        System.out.print(")");
	}

}
