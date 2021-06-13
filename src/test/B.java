package test;

import java.util.Hashtable;



public class B {

	public static void main(String[] args) {
	
		Hashtable obj = new Hashtable();
		obj.put("A", new Integer(3)) ;
		obj.put("B", new Integer(2)) ;
		obj.put("C", new Integer(8)) ;
		
		obj.remove(new String("A"));
		System.out.println(obj);
	
		
	}
}
