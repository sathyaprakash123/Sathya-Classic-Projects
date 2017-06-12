
public class Renfield extends MotorBike{
	
	public void cruiser()
	{
		System.out.println("The bike stops and breaks down");
	}
	
	public void failure()
	{
		System.out.println("This is one lousy model");
		
			
	}
	
	public static void main(String args[])
	{
		
		MotorBike mb = new MotorBike();
		MotorBike bb = new Renfield();
		
		mb.cruiser();
		bb.cruiser();
		bb.failure();
				
		
	}
	

}
