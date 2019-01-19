import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        Scanner kan = new Scanner(System.in);
        int te=1;
        while(true){
        	int b=kan.nextInt();
        	if(b==0)
        		break;
        	System.out.println("Output for data set "+(te++)+", "+b+" bytes:");
        	int t=0;
        	int i=1;
        	for(;b!=0;i++)
        	{
        		int c=kan.nextInt();
        		t+=c;
        		b-=c;
        		if(i%5==0){
        			if(t==0)
        				System.out.println("   Time remaining: stalled");
        			else
        				System.out.println("   Time remaining: "+(int)Math.ceil(b*5.0/t)+" seconds");
        			t=0;
        		}
        	}
        	System.out.println("Total time: "+(i-1)+" seconds\n");
        }
        
    }
}
