package arpit;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ll = new ArrayList<>();
System.out.println(ll);
System.out.println(ll.size());
ll.add(10);
ll.add(20);
ll.add(30);
ll.add(40);
ll.add(50);
ll.add(60);
System.out.println(ll);
ll.add(3, -6);
System.out.println(ll);
System.out.println(ll.size());

System.out.println(ll.get(3));  //get method direct index per update klrega

ll.set(4, 45);
System.out.println(ll);//set method INDEX KI VALUE ko update karta ha

ll.remove(ll.remove(1));//20 remove kr diya 1st index se 
System.out.println(ll);

	}

}
