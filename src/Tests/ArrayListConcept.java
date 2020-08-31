package Tests;

import java.util.ArrayList;

public class ArrayListConcept {
	
	public static void main(String[] args)
	{
	ArrayList al = new ArrayList();
	al.add(1000);
	al.add(2000);
	al.add(12.11);
	al.add("AD");
	int s = al.size();
	
	
	for (int i=0;i<s;i++) {
		System.out.println(al.get(i));
	}
	System.out.println("****");
	
	//to limit to specific data type
	ArrayList<String> l1 = new ArrayList();
	l1.add("AD");
	l1.add("TD");
	l1.add("SD");
	int s1 = l1.size();
	//for (int i=0;i<s1;i++) {
		//System.out.println(l1.get(i));
	//}
	//you can use for-each loop as well, other than above one
		for (String i : l1) {
			System.out.println(i);
		}
	}
	
}

