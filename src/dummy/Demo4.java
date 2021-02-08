package dummy;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo4 {

	public static void main(String[] args) {
		ArrayList<Object>obj=new ArrayList<Object>();
		obj.add("Admin");
		obj.add(45656);
		obj.add(434.5454);
		obj.add('c');
		obj.add("India");
		
		Iterator<Object> x=obj.iterator();
		
		while (x.hasNext()) {
			System.out.println(x.next());
		}

	}

}
