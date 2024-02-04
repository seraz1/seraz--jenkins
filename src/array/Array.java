package array;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {

		ArrayList<String> bikes = new ArrayList<String>();
		
		  bikes.add("30");
	      bikes.add("40");
	      bikes.add("50");
	      bikes.add("60");
	      bikes.add("70");
	      bikes.add("80");
	      bikes.add("90");
	    //acess to item
    System.out.println(bikes);
    
       //to change value
    
       System.out.println("bikes.get(3)");
       bikes.set(3,"60");
       System.out.println(bikes.get(3));
    
        //to delete
       bikes.remove(4);
       System.out.println(bikes);
       
        //array list size
       System.out.println(bikes.size());
       for (int i =0; i<bikes.size(); i++){
      	 System.out.println(bikes.get(i));
       }

	}

}
