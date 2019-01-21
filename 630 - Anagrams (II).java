/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
	public static void main (String[] args) {
		Scanner kan=new Scanner(System.in);
	Integer t = kan.nextInt();
	int kl=0;
	if(t==1)
	{
	 kl=1;   
	}
	int i=0;
	 while (t>0)
		{
		    t--;
		    int n=kan.nextInt()+1;
		    ArrayList<String> al=new ArrayList<String>();
		    String ar[]=new String[n];
		    for(int j=0;j<n;j++)
		    {
		        ar[j]=kan.nextLine();
		    }
		    String str1[]=new String[n];
		    for(int j=0;j<n;j++)
		    {
		         str1[j]=ar[j].replaceAll("\\s+","");
		     char te[] = str1[j].toCharArray(); 
             Arrays.sort(te);
            str1[j] = new String(te);
		    }String s;
		   while(!(s=kan.next()).equals("END"))
		    al.add(s);
		    String[] str=al.toArray(new String[al.size()]);
		    int y=al.size();
		    String str11[]=new String[y];
		    for(int j=0;j<y;j++)
		    {
		         str11[j]=str[j].replaceAll("\\s+","");
		     char te1[] = str11[j].toCharArray(); 
             Arrays.sort(te1);
            str11[j] = new String(te1);
		    }
		    for(i=0;i<y;i++)
		    {
		       System.out.println("Anagrams for: "+str[i]);
		       int oi=1;
		       for(int j=0;j<n;j++)
		       {
		           if(str11[i].equals(str1[j]))
		           {
		               System.out.println("  "+(oi)+") "+ar[j]);
		               oi++;
		           }
		           
		       }
		       if(oi==1)
		           {
		             System.out.println("No anagrams for: "+str[i]);  
		           }
		    }
		    if(kl==1 || t==0)
		    {}
		    else{
		    System.out.println();
		    }
		}
	}
}
