package ast;

public abstract class program implements ASTNode{
	public void print() {
		// TODO Auto-generated method stub
		if (this instanceof defOrExpr_program_eof_program)((defOrExpr_program_eof_program)this).print();
        if (this instanceof defOrExpr_program)((defOrExpr_program)this).print();
     
	}
}