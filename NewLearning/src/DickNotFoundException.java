
public class DickNotFoundException extends Exception{
	
	DickNotFoundException(String a)
	{
		super(a);
		
	}

	
  public static void main(String args[]) throws DickNotFoundException 
  {
	 int a = 21, b = 20;
	 if (a > b)
	 {
		 throw new DickNotFoundException(Integer.toString(a));
		 
	 }
	  
	  
  }
	
	
	
}
