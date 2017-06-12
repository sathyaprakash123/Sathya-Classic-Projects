
public class ExceptionHandling {

	public void error() 
	{
		
		throw new ArithmeticException("Whats up");
				
	}
	
	
	public static void main(String args[])
	{
		ExceptionHandling hg = new ExceptionHandling();
		
		try{ hg.error();}
		
		catch (ArithmeticException e)
		{
			System.out.println("Caught the fucker : " + e);
		}
		
		finally{System.out.println("Finally block, code executed anyway");}
		
	}
	
	
	
	
}
