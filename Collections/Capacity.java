import java.util.*;
public class Capacity
{
    public static void main(String[] args)
    {
         
 	
	Vector<Character> vector = new Vector<>(3);
        System.out.println(vector.capacity());       
 
        vector.add('a');
 
        vector.add('?');
 
        vector.add('3');
 
        vector.add('.' );
        System.out.println(vector.capacity());     




	List<Integer>l=new ArrayList<>(3);
	System.out.println(l.size());   
	l.add(10);
	l.add(10);
	l.add(10);l.add(10);
	l.add(10);System.out.println(l.size()); 

	
    }
}
