package ast;

public class lsqb_name_expr_rsqb_lner_lner extends lner implements ASTNode {
	
	ASTNode t1,t2,t3;
	public lsqb_name_expr_rsqb_lner_lner(ASTNode t1,ASTNode t2,ASTNode t3) {
		
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
	
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("lsqb_name_expr_rsqb_lner_lner(");
        t1.print();
        System.out.print(")");
	}

}
