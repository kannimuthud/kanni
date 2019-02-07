/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    br.readLine();
	for(int i=0;i<t;i++)
	{
	    double d=0;
	    String tree="";
	     TreeMap<String, Integer> map = new TreeMap<>(); 
           while ((tree = br.readLine()) != null) {
        if (tree.trim().length() == 0) {
          break;
        }

        if (!map.containsKey(tree)) {
          map.put(tree, 1);
        }
        else {
          map.put(tree, map.get(tree) + 1);
        }
            d++;
      }
	    for (String tr: map.keySet())
	    {
        System.out.format("%s %.4f\n", tr, map.get(tr) * 100 / d);
        }
      if (i!=t-1) {
        System.out.println();
      }
	}
	}
}
