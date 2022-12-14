import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
            ANTLRFileStream input = new ANTLRFileStream(args[0]);
            ANTLRInputStream ip = new ANTLRInputStream(input.toString());
            ASTspecLexer lex = new ASTspecLexer(ip); 
            CommonTokenStream token = new CommonTokenStream(lex);
            ASTspecParser parser = new ASTspecParser(token);
            parser.start();
       
            // parser.setErrorHandler(new CustomeErrorHandler());
            System.out.println("finished...");
        }
        catch(Exception e){
            System.out.println(e);
        }

	}

}
