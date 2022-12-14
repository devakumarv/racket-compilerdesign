package ast;

public abstract class definition implements ASTNode {
	public void print() {
		// TODO Auto-generated method stub
		if (this instanceof lb_def_name_expr_rb_definition)((lb_def_name_expr_rb_definition)this).print();
        if (this instanceof lb_def_lb_name_nameplus_rb_expr_rb_definition)((lb_def_lb_name_nameplus_rb_expr_rb_definition)this).print();
        if (this instanceof lb_defs_name_lb_namestar_rb_rb)((lb_defs_name_lb_namestar_rb_rb)this).print();
      
	}
	
	
}
