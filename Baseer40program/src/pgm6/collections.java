package pgm6;
import java.util.*;
public class collections {
	public static void main(String[] args) 
    {
	  //creating array-list
      System.out.println("ArrayList");
      ArrayList<String> city=new ArrayList<String>(); 
      city.add("Hubli");
      city.add("DVG"); 
      city.add("BGM"); 
      city.add("MYS"); 
      System.out.println(city); 
      
      //creating vector
      System.out.println("\n");
      System.out.println("Vector");
      Vector<Integer> vec = new Vector();
      vec.addElement(40); 
      vec.addElement(50); 
      vec.addElement(550); 
      vec.addElement(560); 
      System.out.println(vec);
      
      //creating linked-list
      System.out.println("\n");
      System.out.println("LinkedList");
      LinkedList<String> name=new LinkedList<String>(); 
      name.add("Baseer"); 
      name.add("NK screen"); 
      name.add("NKN"); 
      
      Iterator<String> itr=name.iterator(); 
      while(itr.hasNext()){ 
      System.out.println(itr.next()); 
 
      //creating hash-set
      System.out.println("\n");
      System.out.println("HashSet");
      HashSet<Integer> set=new HashSet<Integer>(); 
      set.add(2000); 
      set.add(3000); 
      set.add(4000);
      set.add(6000);
      set.add(7000);
      System.out.println(set);
 
      //creating linked-hash-set
      System.out.println("\n");
      System.out.println("LinkedHashSet");
      LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>(); 
      set2.add(20); 
      set2.add(30); 
      set2.add(50);
      set2.add(94); 
      set2.add(78); 
      System.out.println(set2);
      } 
   } 
}

