import java.io.*;
import java.util.*;
import java.lang.*;
class GFG {
	public static void main (String[] args) {
        Scanner kan=new Scanner(System.in);
        while(kan.hasNext())
        {
            String s=kan.nextLine();
            if(s.equals("#"))
            {
                break;
            }
            String k=(ne(s));
            if(k.equals("11"))
            {
                System.out.println("No Successor");
            }
            else{
                System.out.println(k);
            }
        }
	}
	public static String ne(String sa)
	{
	  char[] array = sa.toCharArray();
    int i = array.length - 1;
    while (i > 0 && array[i - 1] >= array[i]) {
        i--;
    }

    if (i <= 0) {
       return "11";
    }

    int j = array.length - 1;

    while (array[j] <= array[i - 1]) {
        j--;
    }

    char temp = array[i - 1];
    array[i - 1] = array[j];
    array[j] = temp;

    j = array.length - 1;

    while (i < j) {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
    }
    String arr = new String(array);
    return arr;
}

}
