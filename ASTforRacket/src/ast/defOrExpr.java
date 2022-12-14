package ast;

public abstract class defOrExpr implements ASTNode{
	public void print() {
		// TODO Auto-generated method stub
		if (this instanceof definition_defOrExpr)((definition_defOrExpr)this).print();
        if (this instanceof expr_defOrExpr)((expr_defOrExpr)this).print();
      
	}
}
