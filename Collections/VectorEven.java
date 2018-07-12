import java.util.*;
class VectorEven
{
	public static void main(String [] args)
	{
		Vector<Integer>v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(156);
		v.add(21);
		v.add(5);
		Enumeration<Integer> en = v.elements();
		 while (en.hasMoreElements())
        	{
			int a=en.nextElement();
			if(a%2==0)
            			System.out.println(a);
       		}
 
	}
}
