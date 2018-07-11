import java.util.*;
public class Generic 
{
    public static void main(String[] args)
    {
       /* ArrayList<Object> list = new ArrayList<Object>();
 
        list.add("JAVA");
 
        list.add(123);
 
        for (Object object : list)
        {
           
 
            //String str = (String) object;        
            System.out.println(object);
        }
    }
} */

 /*ArrayList<Object> list = new ArrayList<>();
 
        list.add("JAVA");
 
        list.add(123);
 
        for (Object object : list)
        {
           
 
            //String str = (String) object;        
            System.out.println(object);
        }
   }
}*/



 
      /*  ArrayList<String> list = new ArrayList<String>();
 
        list.add("JAVA");
 
    //    list.add(123);       Compile time error
 
        for (Object str : list)
        {
            //No type casting needed. ClasscastException Never occurs
 
            System.out.println(str);
        }
    }
}
 */
/*class Emp1
{
	int id=10;
	float m=5.2f;
	public String toString()
	{
		System.out.println(id +" "+m);//return "a";
		return "";
	}
}


		List <Object> l=new ArrayList<>();
		l.add(1);
		l.add("2");
		l.add(3.32);
		l.add(new Float(25.1));
		l.add(new String("hi"));
		l.add(new Emp1());
		System.out.print(l+" ");
		 for (Object str : l)
			System.out.println(str); 
        
	}
}*/


//Passing user defined types to collections
class Emp
{
	int id ;
	String name;
	Emp(int a,String b)
	{
		id=a;
		name=b;
	}
	public String toString()
	{
		System.out.println(id+" "+name);
		return ""; 
	}
}




Vector<Emp>e=new Vector<>();
e.add(new Emp(10,"me"));
//e.add(30);
for(Emp s:e)
	System.out.println(s);
}
}

