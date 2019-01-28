/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG {
	public static void main (String[] args) throws IOException 
	{
	   Scanner kan=new Scanner(System.in);
	   int f=0;
		while(kan!= null)
		{
		    f++;
		    int k=kan.nextInt();
		    int a[]=new int[k];
		    if(k==0)
		    {
		        break;
		    }
		    int c=0;
		    for(int i=0;i<k;i++)
		    {
		        a[i]=kan.nextInt();
		        c=c+a[i];
		    }
		    int h=c/k;
		    int s=0;
		   // System.out.println(h);
		    for(int i=0;i<k;i++)
		    {
		        if(a[i]>h)
		        {
		          s=s+(a[i]-h);  
		        }
		    }
		    System.out.println("Set #"+f);
		    System.out.println("The minimum number of moves is "+s+".");
		    System.out.println();
		}
	}
}
