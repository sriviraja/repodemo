import java.util.*;
class IteratorOperations 
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
       
 
        System.out.println(list);        




 	 ListIterator<String>  listIterator = list.listIterator();
 
	
        while (listIterator.hasNext())
        {
            listIterator.next();
 
            //Modifying an element returned by next()
            listIterator.set("MODiiIFIED");//break;
        }
 
        System.out.println("set:"+list); 





 	listIterator.add("viraja"); //list.add("viraja");     ---> concurrent modification exception
	System.out.println(" :"+list); 

	ListIterator<String>listIterator1=list.listIterator();
	while (listIterator1.hasNext())
        {
           
	listIterator1.add("sri");listIterator1.next();
 
           
        }
 
       System.out.println("Add:"+list); 

    
ListIterator lt=list.listIterator();


	while (lt.hasNext())
        {
            lt.next(); lt.remove();
	 
 
           
        }
 
       System.out.println("remove:"+list); 



 	List<String>l=new ArrayList<>();
	l.add("1");l.add("2");l.add("3");l.add("4");l.add("5");
	ListIterator  lt5=l.listIterator(1);
	while(lt5.hasNext())
	{
		System.out.println(lt5.next());
	}
	 
 
        Iterator iterator = list.iterator();
 
        while (iterator.hasNext())
        {
           iterator.next(); iterator.remove();
            
        }
 
        System.out.println(list);     
    }
}

