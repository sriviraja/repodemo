import java.util.*;
class IteratorOnSetQ
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE"); 
 
        //Traversing list elements using Iterator
        Iterator iterator1 = list.iterator();
 
        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }





  	 //Traversing queue elements using Iterator

        Queue<String> queue = new LinkedList<>(list);
       
        Iterator iterator2 = queue.iterator();
 
        while (iterator2.hasNext())
        {
            System.out.println("0 "+iterator2.next());
        }
 
       
 
        //Traversing set elements using Iterator
	Set<String> set = new HashSet<String>(list);
       Iterator iterator3 = set.iterator();
 
        while (iterator3.hasNext())
        {
            System.out.println("1 "+iterator3.next());
        }
 
                                                                                                                                                                                                                                                                                                                                                                                                                          

        //Traversing list elements using ListIterator
        ListIterator listIterator1 = list.listIterator();
 
        while (listIterator1.hasNext())
        {
            System.out.println(listIterator1.next());
        }
 
        //Traversing queue and set elements using ListIterator is not possible

	System.out.println("final");
	LinkedList<String> q=new LinkedList<>(list);  
	
        ListIterator lt = q.listIterator(); 
	while(lt.hasNext())
		System.out.println("51 "+lt.next());   
 
        //ListIterator listIterator3 = set.listIterator(); 
	//ListIterator   listIterator4 = queue.listIterator();   
    }
}
