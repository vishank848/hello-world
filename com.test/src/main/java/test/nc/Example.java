package test.nc;

import java.util.Set;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {

		Set set = new TreeSet();
		
		set.add(new Integer(2));
		set.add(new Integer(1));
		set.add(new Integer(700));
		set.add(new Integer(5));
		set.add(new Integer(499));
		
		System.out.println(set);

	}

}
