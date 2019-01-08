import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

public static void main(String args[]){
        Scanner kan = new Scanner(System.in); 
        while(kan.hasNext())
        {
            int n=kan.nextInt();
            if(n==0)
            {
                break;
            }
            System.out.println("Printing order for "+n+" pages:");
            int y=1,z=1;
            if(n%4==0)
            {
                for(int i=1,j=n;i<j;i++,j--)
                { 
                    if(i%2!=0)
                    {   
                        System.out.println("Sheet "+(y)+","+" "+"front:"+" "+j+","+" "+i);
                        y++;
                        
                    }
                    else
                    {
                        System.out.println("Sheet "+(z)+","+" "+"back :"+" "+i+","+" "+j);
                    z++;
                    }
                }
            }
           if(n<4)
            {
               if(n==1)
               {
                   //System.out.println("Printing order for 1 pages:");
                   System.out.println("Sheet 1, front: Blank, 1");
               }
               if(n==2)
               {
                 // System.out.println("Printing order for 2 pages:"); 
                  System.out.println("Sheet 1, front: Blank, 1");
                  System.out.println("Sheet 1, back : 2, Blank");
               }
               if(n==3)
               {
                 // System.out.println("Printing order for 2 pages:"); 
                  System.out.println("Sheet 1, front: Blank, 1");
                  System.out.println("Sheet 1, back : 2, 3");
               }
            }
            else if(n%2==0 && n%4!=0)
           {
               System.out.println("Sheet 1, front: Blank, 1");
               System.out.println("Sheet 1, back : 2, Blank");
              for(int i=3,j=n;i<j;i++,j--)
                { 
                    if(i%2!=0)
                    {   
                        System.out.println("Sheet "+(y+1)+","+" "+"front:"+" "+j+","+" "+i);
                        y++;
                        
                    }
                    else
                    {
                        System.out.println("Sheet "+(z+1)+","+" "+"back :"+" "+i+","+" "+j);
                    z++;
                    }
                } 
           }
           else if(n%4==3)
           {
               System.out.println("Sheet 1, front: Blank, 1");
               //System.out.println("Sheet 1, back : 2, Blank");
               int er=1,z1=1;
              for(int i=2,j=n;i<j;i++,j--)
                { 
                    if(i%2!=0)
                    {   
                        System.out.println("Sheet "+(z1+1)+","+" "+"front:"+" "+j+","+" "+i);
                        z1++;
                        
                    }
                    else
                    {
                        System.out.println("Sheet "+(er)+","+" "+"back :"+" "+i+","+" "+j);
                    er++;
                    }
                } 
           }
           else if(n%4==1)
           {
               System.out.println("Sheet 1, front: Blank, 1");
               System.out.println("Sheet 1, back : 2, Blank");
            System.out.println("Sheet 2, front: Blank, 3");
               int er=1,z1=1;
              for(int i=4,j=n;i<j;i++,j--)
                { 
                    if(i%2!=0)
                    {   
                        System.out.println("Sheet "+(z1+2)+","+" "+"front:"+" "+j+","+" "+i);
                        z1++;
                        
                    }
                    else
                    {
                        System.out.println("Sheet "+(er+1)+","+" "+"back :"+" "+i+","+" "+j);
                    er++;
                    }
                } 
           }
        }
    }
}
