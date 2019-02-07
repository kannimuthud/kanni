/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
import java.lang.*;
class kanni1 {
	public static void main (String[] args)throws IOException {
	    Scanner kan=new Scanner(System.in);
int c=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
				while (!(s=br.readLine()).equals("0")) {
			int T=Integer.parseInt(s); 
			c=0;
			int sum=0;
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for (int i=0;i<T;i++ )
        {    
    	String strInput = br.readLine(); 
        StringTokenizer st = new StringTokenizer( strInput );
				int r=Integer.parseInt(st.nextToken());
				for(int j=0;j<r;j++)
					{
                       int t=Integer.parseInt(st.nextToken());

                        ar.add(t);
        			}
        			int s1=kanni(ar,c);
        			sum=sum+s1;
        }System.out.println(sum);
				
	}
  }            
  public static int  kanni(ArrayList<Integer> array,int c)
  {
  Collections.sort(array);
                    int h=c;
                 int y=array.get(0);
			    int y1=array.get(array.size()-1);
				int u=y1-y;
				h=h+u;
				array.remove(0);
				array.remove(array.size()-1);
        
        return h;
		 }
	
}
