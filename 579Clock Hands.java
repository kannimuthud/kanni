/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner kan=new Scanner(System.in);
		while(kan.hasNext())
		{
		    String s1=kan.nextLine();
		    
		    String []str= s1.split(":");
		    int h=Integer.valueOf(str[0]);
		    int m=Integer.valueOf(str[1]);
		    if (h <0 || m < 0 || h >12 || m > 60|| h==0) 
        {
            break;
        }
		    if(h==12)
		    {
		        h=0;
		        
		    }
		    if(m==60)
		    {
		        m=0;
		    }
		    double hour_angle = 0.5 * (h*60 + m); 
            double minute_angle = 6*m; 
             double angle = Math.abs(hour_angle - minute_angle); 
            angle=Math.min(360-angle, angle);
            System.out.format("%.3f",angle);
            System.out.println();
		    
		}
	}
}
