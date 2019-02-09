import java.io.*;
import java.util.*;
class  Main
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a[] =new int[3];
            PriorityQueue<Integer> g =new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer>b =new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<3;j++)
                a[j]=in.nextInt();
            for(int x=0;x<a[1];x++)
                g.add(in.nextInt());
            for(int y=0;y<a[2];y++)
                b.add(in.nextInt());
            while(true)
            {
                if(g.isEmpty() && b.isEmpty())
                {
                    System.out.println("green and blue died");
                    break;
                }
                else if(g.isEmpty())
                {
                    System.out.println("blue wins");
                    while(!b.isEmpty())
                        System.out.println(b.poll());
                    break;
                    
                }
                else if(b.isEmpty())
                {
                    System.out.println("green wins");
                    while(!g.isEmpty())
                        System.out.println(g.poll());
                    break;
                }
                else
                {
                    int c=0;
                    ArrayList<Integer> m=new ArrayList<>();
                    ArrayList<Integer> n=new ArrayList<>();
                    while(!g.isEmpty() &&  !b.isEmpty() && c<a[0])
                    {
                        int g1=g.poll();
                        int h=b.poll();
                        if(g1>h)
                            m.add(g1-h);
                        else if(h>g1)
                            n.add(h-g1);
                        c++;
                    }
                    g.addAll(m);
                    b.addAll(n);
                        
                    }
                }
                if(i+1<t)
                    System.out.println();
            }
        }
    }
