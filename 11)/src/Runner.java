import java.util.Iterator;
import java.util.PriorityQueue;

/*
Exercise 11: (2) Create a class that contains an Integer that is initialized to a value
between o and 100 using java.util.Random. Implement Comparable using this Integer
field. Fill a PriorityQueue with objects of your class, and extract the values using poll( ) to
show that it produces the expected order
 */
public class Runner {
    public static void main(String[] args) {
        PriorityQueue<MyClass> queue = new PriorityQueue<>();
        for(int i = 0; i < 100; i++) {
            queue.add(new MyClass());
        }
        for(int i = 0; i < queue.size(); i++){
            System.out.println(queue.poll().getValue());
        }
    }
}
