import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String args[]) {
        //String | Integer | Float | Boolean
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add
        list.add(0);
        list.add(6);
        list.add(5);

        System.out.println(list);
        // get element
        int el = list.get(2); //(index)
        System.out.println(el);

        //add element in btw arraylist
        list.add(1,2); //(index, element)
        System.out.println(list);

        //set, replace element
        list.set(0,10); //(index, new element)
        System.out.println(list);

        //remove
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));

        //size of the list
        int size = list.size();
        System.out.println(size);

        //loops 
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
