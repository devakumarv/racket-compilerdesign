package ast;

public abstract class exprplus implements ASTNode {
	public void print() {
		// TODO Auto-generated method stub
		if (this instanceof expr_exprplus_exprplus)((expr_exprplus_exprplus)this).print();
        if (this instanceof expr_exprplus)((expr_exprplus)this).print();
      
	}
}
