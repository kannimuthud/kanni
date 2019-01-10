/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
	Scanner kan=new Scanner(System.in);
	while(kan.hasNextInt())
	{
	    int r=kan.nextInt();
	    int m=kan.nextInt();
	    if(r==0  || m==0)
	    {
	        break;
	        
	    }
	    int min=Math.min(r,m);
	    int max=Math.max(r,m);
	    if(min==1)
	    {
	        System.out.print(max);
	        System.out.println(" knights may be placed on a "+r+" row "+m+" column board.");
	    }
	    else if(min==2)
	    {
	        System.out.print(4*(max/4)+2*Math.min(2,max%4));
	        System.out.println(" knights may be placed on a "+r+" row "+m+" column board.");
	    }
	    else if(r>=3 ||m>=3)
	    {
	        System.out.print(((r*m)+1)/2);
	        System.out.println(" knights may be placed on a "+r+" row "+m+" column board.");
	    }
	}
	}
}
