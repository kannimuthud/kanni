import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

public static void main(String args[]){
        Scanner kan = new Scanner(System.in); 
        int N , d , m , y ;
        while(kan.hasNext()){
            N = kan.nextInt();
            d = kan.nextInt();
            m = kan.nextInt();
            y = kan.nextInt();
            if( N ==0)
            	break;
            GregorianCalendar date = new GregorianCalendar( y , m-1  ,d );
            date.add(Calendar.DATE,N);
            System.out.println( date.get(Calendar.DATE) + " " + (date.get(Calendar.MONTH)+1) + " " + date.get(Calendar.YEAR) );
        }
        kan.close();
    }
}
