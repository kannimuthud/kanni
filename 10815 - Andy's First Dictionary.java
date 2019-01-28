import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
	public static void main (String[] args)throws java.lang.Exception {
	   Scanner kan=new Scanner(System.in);
	    LinkedHashSet<String> al = new LinkedHashSet<String>(); 
	   while(kan.hasNext())
	   {
	     String y = kan.next(); 
	     y=y.replaceAll("[0-9]"," ").toLowerCase();
	     String str[]=y.split("[\\p{Punct}\\s]+");
	     for(int i=0;i<str.length;i++)
                al.add(str[i]);
	   }
        List<String> list = new ArrayList<String>(al); 
        Collections.sort(list); 
       for (int i=0; i<list.size(); i++) 
            if(i==0)
            {
                
            }
            else{
            System.out.println(list.get(i));}
	}
}
