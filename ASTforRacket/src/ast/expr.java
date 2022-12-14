package ast;

public abstract class expr implements ASTNode {
	
	public void print() {
		// TODO Auto-generated method stub
		if (this instanceof lb_begin_exprplus_rb_expr)((lb_begin_exprplus_rb_expr)this).print();
		
        if (this instanceof lb_begin0_exprplus_rb_expr)((lb_begin0_exprplus_rb_expr)this).print();
        
        if (this instanceof lb_setnq_name_expr_rb_expr)((lb_setnq_name_expr_rb_expr)this).print();
        
        if (this instanceof lb_delay_expr_rb_expr)((lb_delay_expr_rb_expr)this).print();
        
        if (this instanceof lb_car_expr_rb_expr)((lb_car_expr_rb_expr)this).print();
        
        if (this instanceof lb_cdr_expr_rb_expr)((lb_cdr_expr_rb_expr)this).print();
        
        if (this instanceof lb_combinations_expr_rb_expr)((lb_combinations_expr_rb_expr)this).print();
        
        if (this instanceof lb_list_expr_rb_expr)((lb_list_expr_rb_expr)this).print();
        
        if (this instanceof lb_reverse_expr_rb_expr)((lb_reverse_expr_rb_expr)this).print();
        
        if (this instanceof lb_append_name_expr_rb_expr)((lb_append_name_expr_rb_expr)this).print();
        
        if (this instanceof lb_lambda_lb_namestar_rb_expr_rb_expr)((lb_lambda_lb_namestar_rb_expr_rb_expr)this).print();
        
        if (this instanceof lb_lambdasym_lb_namestar_rb_expr_rb_expr)((lb_lambdasym_lb_namestar_rb_expr_rb_expr)this).print();
        
        if (this instanceof lb_local_lsqb_definitionstar_rsqb_expr_rb_expr)((lb_local_lsqb_definitionstar_rsqb_expr_rb_expr)this).print();
        
        if (this instanceof lb_letrec_lb_definitionstar_rsqb_expr_rb_expr)((lb_letrec_lb_definitionstar_rsqb_expr_rb_expr)this).print();
        
        if (this instanceof lb_shared_lb_lner_rb_expr_rb_expr)((lb_shared_lb_lner_rb_expr_rb_expr)this).print();
        
        if (this instanceof lb_let_lb_lner_rb_expr_rb_expr)((lb_let_lb_lner_rb_expr_rb_expr)this).print();
        
        if (this instanceof lb_letstar_lb_lner_rb_expr_rb_expr)((lb_letstar_lb_lner_rb_expr_rb_expr)this).print();
        
        if (this instanceof lb_recur_name_lb_lner_rb_expr_rb_expr)((lb_recur_name_lb_lner_rb_expr_rb_expr)this).print();
        
        if (this instanceof lb_name_exprplus_rb_expr)((lb_name_exprplus_rb_expr)this).print();
        
        if (this instanceof lb_cond_leerbplus_rb_expr)((lb_cond_leerbplus_rb_expr)this).print();
        
        if (this instanceof lb_cond_leersqbplus_rb_expr)((lb_cond_leersqbplus_rb_expr)this).print();
        
        if (this instanceof lb_cond_leersqbstar_lsqb_else_expr_rsqb_rb_expr)((lb_cond_leersqbstar_lsqb_else_expr_rsqb_rb_expr)this).print();
        
        if (this instanceof lb_if_expr_expr_expr_rb_expr)((lb_if_expr_expr_expr_rb_expr)this).print();
        
        if (this instanceof lb_and_expr_exprplus_rb_expr)((lb_and_expr_exprplus_rb_expr)this).print();
        
        if (this instanceof lb_or_expr_exprplus_rb_expr)((lb_or_expr_exprplus_rb_expr)this).print();
        
        if (this instanceof display_name_expr)((display_name_expr)this).print();
        
        if (this instanceof display_string_expr)((display_string_expr)this).print();
        
        if (this instanceof newline_expr)((newline_expr)this).print();
        
        if (this instanceof empty_expr)((empty_expr)this).print();
        
        if (this instanceof quotesx_expr)((quotesx_expr)this).print();
        
        if (this instanceof qsmark_expr)((qsmark_expr)this).print();
        
        if (this instanceof characterquoted_expr)((characterquoted_expr)this).print();
        
        
	}

}

