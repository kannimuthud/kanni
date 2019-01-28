/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG {
	public static void main (String[] args) throws IOException 
	{
	   InputStreamReader s=new InputStreamReader(System.in);
		BufferedReader kan = new BufferedReader(s);
		int t=Integer.parseInt(kan.readLine());
		for(int i=0;i<t;i++)
		{
		    int n=Integer.parseInt(kan.readLine());
		    int k=Integer.parseInt(kan.readLine());
		    int a[]=new int[k];
		    for(int i1=0;i1<k;i1++)
		    {
		        a[i1]=Integer.parseInt(kan.readLine());
		    }
		    int c=0;
		    for(int j=0;j<=n;j++)
		    {
		        if(j%7!=0 && j%7!=6)
		        {
		            for(int y=0;y<k;y++)
		            {
		                if(j%a[y]==0)
		                {
		                    c++;
		                    break;
		                }
		            }
		        }
		    }
		    System.out.println(c);
		}
	}
}
