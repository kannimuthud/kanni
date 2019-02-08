import java.io.*;
import java.util.*;

class Main {

	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s11;
		while ((s11=br.readLine())!=null) {
			int t=Integer.parseInt(s11);
			Stack<Integer> s=new Stack<>(); boolean s1=true;
			Queue<Integer> q=new LinkedList<>(); boolean q1=true;
			PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); boolean pq1=true;
			
			for (int i=0;i<t;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				String op=st.nextToken();
				int value=Integer.parseInt(st.nextToken());
				if (op.equals("1")) {
					if (s1) s.push(value);
					if (q1) q.offer(value);
					if (pq1) pq.offer(value);
				} else if (op.equals("2")) {
					if (s1 && (s.size()==0 || !s.pop().equals(value))) s1=false;
					if (q1&& (q.size()==0 || !q.poll().equals(value))) q1=false;
					if (pq1 && (pq.size()==0 || !pq.poll().equals(value))) pq1=false;
				}
			}
			
			if (!s1 && !q1 && !pq1) System.out.println("impossible");
			else if ((s1 && q1) || (s1 && pq1) || (q1 && pq1)) System.out.println("not sure");
			else if (s1) System.out.println("stack");
			else if (q1) System.out.println("queue");
			else if (pq1) System.out.println("priority queue");
		}
	}
}
