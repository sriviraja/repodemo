import java.util.*;
class Iterator1  
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
       
 
       Iterator iterator = list.iterator();
 
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        } 
 
        

 
        //  forward direction using ListIterator
 
        ListIterator listIterator = list.listIterator(3);
 	int i=0;                                                                                     
        while (listIterator.hasNext())
        {
            System.out.println(i++ +"No "+listIterator.next()); 
        } 

	
	while (listIterator.hasPrevious())
        {
            //Getting index of previous element
 
            System.out.println(listIterator.previousIndex()+" : "+listIterator.previous());
        }
 
         ListIterator lt3=list.listIterator(list.size());
 
        //  backward direction using ListIterator
 
       while (lt3.hasPrevious())
        {
            System.out.println(i--+"oh "+lt3.previous());
        }
 
        
   }
}
