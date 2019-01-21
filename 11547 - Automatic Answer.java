/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner kan=new Scanner(System.in);
		int t=kan.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=kan.nextInt();
		    int l=Math.abs(((((((n*567)/9)+ 7492)*235)/47)-498));
		    String str = Integer.toString(l);
		      //System.out.println(str);
		    int u=str.length();
		  System.out.println(str.charAt(u-2));
		}
	}
}
