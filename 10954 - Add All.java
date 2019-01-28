/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner kan=new Scanner(System.in);
	while(kan.hasNext())
	{
		int a=kan.nextInt();
		if(a==0)
		{
			break;
		}
		int cost,total=0;
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		 for(int i=0;i<a;i++)
		 {
		 	pq.add(kan.nextInt());
		 }
		
			while(pq.size() != 1){
                cost  = pq.poll() + pq.poll();
                total += cost;
                pq.add(cost);
            }
			
			System.out.println(total);
	}
	}
	}
