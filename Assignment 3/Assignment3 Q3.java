import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
 
public class ArrayListExample 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
         
        ListIterator<String> listItr = alphabets.listIterator();
         
        System.out.println("Backward Direction");
         
        while(listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
    }
}