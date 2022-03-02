package pgm7;
import java.util.*;
public class map {
	public static void main(String[] args) {
		// map
		//Hashmap
		HashMap<Integer,String> HM=new HashMap<Integer,String>(); 
		HM.put(1,"Bhanu"); 
		HM.put(2,"Latha"); 
		HM.put(3,"Deepa"); 
	 
		System.out.println("\nThe elements of Hashmap are "); 
		for(Map.Entry m:HM.entrySet()){ 
		System.out.println(m.getKey()+" "+m.getValue()); 
	 }
	 
		//HashTable
	 
		 Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
		 
		 ht.put(4,"chandani"); 
		 ht.put(5,"candu"); 
		 ht.put(6,"chandana"); 
		 ht.put(7,"channamma"); 
		 System.out.println("\nThe elements of HashTable are "); 
		 for(Map.Entry n:ht.entrySet()){ 
		 System.out.println(n.getKey()+" "+n.getValue()); 
	 }
	 
	 
		 //TreeMap
	 
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
		 map.put(8,"Neha"); 
		 map.put(9,"priyanka"); 
		 map.put(10,"Aliya"); 
	 
		 System.out.println("\nThe elements of TreeMap are "); 
		 for(Map. Entry l:map.entrySet()){ 
		 System.out.println(l.getKey()+" "+l.getValue()); 
	 } 
	 
	 } 
}
