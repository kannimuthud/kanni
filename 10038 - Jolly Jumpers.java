import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner ip=new Scanner(System.in);
	     while(ip.hasNext())
	     {
	          int n=ip.nextInt();
	         int a[]=new int[n];
	         for(int i=0;i<n;i++)
	         {
	             a[i]=ip.nextInt();
	         }
	         int f=0,f1=0;
	                for(int k=1;k<=n-1;k++)
	                {
	                          f=0;
	                       
	                       for(int j=0;j<n-1;j++)
	                       {
	                           int d=Math.abs(a[j]-a[j+1]);
	                            if(k==d)
	                            {
	                                f=1;
	                                break;
	                            }
	                       }
	                       
	                       if(f!=1)
	                       {
	                           f1=1;
	                           break;
	                       }
	               }
	               if(f1==0)
	               System.out.println("Jolly");
	               else
	               System.out.println("Not jolly");
	     }
	}
}


