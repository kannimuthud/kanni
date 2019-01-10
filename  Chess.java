/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
	Scanner kan=new Scanner(System.in);
	int t=kan.nextInt();
        for(int i=0;i<t;i++)
        {
            char c=kan.next().charAt(0);
            int r=kan.nextInt();
            int m=kan.nextInt();
            if(c=='r' || c=='Q')
            {
                System.out.println(Math.min(r,m));
            }
            if(c=='k')
            {
               System.out.println(((r*m)+1)/2); 
            }
            if(c=='K')
            {
                System.out.println(((r+1)/2)*((m+1)/2));
            }
            
        }
	{
	    
	}
	}
}
