import java.awt.*;
import java.util.*;
import java.util.List;

/*
Exercise 30: (3) Compare the performance of Collections.sort( ) between an
ArrayList and a LinkedList.
 */
public class Runner {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> arr = new ArrayList<>();
        List<Integer> link = new LinkedList<>();
        int i = 0;
        int value;
        while(i < 1000000) {
            value = r.nextInt(100000);
            arr.add(value);
            link.add(value);
            i++;
        }
        long timeArr1, timeArr2, timeLink1, timeLink2;
        timeArr1 = System.currentTimeMillis();
        Collections.sort(arr);
        timeArr2 = System.currentTimeMillis();
        timeLink1 = System.currentTimeMillis();
        Collections.sort(link);
        timeLink2 = System.currentTimeMillis();
        System.out.println("Arr: " + (timeArr2-timeArr1));
        System.out.println("Link: " + (timeLink2-timeLink1));
    }
}
