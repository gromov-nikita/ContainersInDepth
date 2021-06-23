import countries.Countries;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
Exercise 7: (4) Create both an ArrayList and a LinkedList, and fill each using the
Countries.names( ) generator. Print each list using an ordinary Iterator, then insert one
list into the other by using a Listlterator, inserting at every other location. Now perform the
insertion starting at the end of the first list and moving backward.
 */
public class Runner {
    public static void main(String args[]) {
        ArrayList<String> arr = (ArrayList<String>)Countries.names(10);
        LinkedList<String> link = new LinkedList<>(Countries.names(10));
        Iterator itArr = arr.iterator();
        Iterator itLink = link.iterator();
        System.out.println("Array:");
        while (itArr.hasNext()) {
            System.out.println(itArr.next());
        }
        System.out.println();
        System.out.println("Link:");
        while (itLink.hasNext()) {
            System.out.println(itLink.next());
        }
        ListIterator listItArr = arr.listIterator();
        ListIterator listItLink = link.listIterator();
        ListIterator listItArrBack = arr.listIterator(9);
        while(listItLink.hasNext()) {
            listItArrBack.add(listItLink.next());
            listItArrBack.previous();
        }
        System.out.println("Array");
        System.out.println(arr.toString());
    }
}
