import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
	public static void main (String[] args) {
	   Scanner kan=new Scanner(System.in);
	   ArrayList<Integer> li = new ArrayList<Integer>();
	   LinkedHashSet<Integer> link =  
                           new LinkedHashSet<Integer>(); 
	   while(kan.hasNextInt())
	   {
	     int y=kan.nextInt();  
        li.add(y); 
        link.add(y);
	   }
	   Object[] ar = link.toArray();
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]+" "+Collections.frequency(li,ar[i]));
        }
	}
}
