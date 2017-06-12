import java.util.ArrayList;
import java.util.Iterator;



public class CollectionTest {

	public static void main(String args[])
	{
		
		Student a1 = new Student("sathya", 36, "male");
		Student a2 = new Student("barack", 55, "male");
		Student a3 = new Student("clinton", 60, "female");	
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		
		Iterator xl = al.iterator();
		
		while (xl.hasNext())
		{
			Student st = (Student) xl.next();
			System.out.println(st.name + st.age + st.sex);
			
		}
		
	}
	
	
}
