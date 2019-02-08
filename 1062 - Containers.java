import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int C = 1;
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s.equals("end"))
				break;
			
			int l[] = new int[s.length()];
			Arrays.fill(l, 1);
			//System.out.println(l);
			int max = 0;
			for (int i = 0; i < s.length(); i++)
			{
				for (int j = i - 1; j >= 0; j--)
			       
					if (s.charAt(j) < s.charAt(i))
					    l[i] = (l[i] > l[j]+1) ? (l[i]) : (l[j]+1);
    					
			
			max=Math.max(l[i],max);
			}
			System.out.println("Case " + (C++) + ": " + max);
		}
	}
}
