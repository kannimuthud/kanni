import java.util.*;
import java.io.*;
import java.lang.*;
class kanni {
	public static void main (String[] args) {
	                Scanner kan=new Scanner(System.in);
                    
					while(kan.hasNext())
					{
					    Set<Integer> a=new HashSet<Integer>();
								 int n=kan.nextInt();
								int n1=kan.nextInt();	
								if(n==0  || n1==0)
                                {
                                    break;
                                    
                                }
	                           int c=0;
								for(int i=0;i<n;i++)
								{
								a.add(kan.nextInt());
								}
								for(int i=0;i<n1;i++)
								{
								if(a.contains(kan.nextInt()))
        							{
        						c++;
                                    }
								}
								
                                System.out.println(c);
                                c=0;
                                a.clear();
					}
	}
}
