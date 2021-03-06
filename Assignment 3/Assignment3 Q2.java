import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetComparision {
 
    public static void main(String args[]){            
        HashSet<String> fruitsStore = new HashSet<String>();
        LinkedHashSet<String> fruitMarket = new LinkedHashSet<String>();
     
        for(String fruit: Arrays.asList("mango", "apple", "banana")){
            fruitsStore.add(fruit);
            fruitMarket.add(fruit);
        }
       
        System.out.println("Ordering in HashSet :" + fruitsStore);

        System.out.println("Order of element in LinkedHashSet :" + fruitMarket);
}
}