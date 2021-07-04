import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountedString {
    private static List<String> created =
            new ArrayList<String>();
    private String s;
    private static int id = 0;
    public CountedString(String str) {
        s = str;
        created.add(s);
        id++;
        // id is the total number of instances
        // of this string in use by CountedString:

    }
    public String toString() {
        return "String: " + s + " id: " + id +
                " hashCode(): " + hashCode();
    }
    public int hashCode() {
        // The very simple approach:
        // return s.hashCode() * id;
        // Using Joshua Bloch’s recipe:
        int result = 17;
        result = 37 * result + s.hashCode();
        //result = 37 * result + id;
        return result;
    }
    public boolean equals(Object o) {
        if(o == null) {
            throw new IllegalArgumentException();
        }
        return o instanceof CountedString &&
                s.equals(((CountedString)o).s) &&
                id == ((CountedString)o).id;
    }
    public static void main(String[] args) {
        Map<CountedString,Integer> map =
                new HashMap<CountedString,Integer>();
        CountedString[] cs = new CountedString[5];
        for(int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi");
            map.put(cs[i], i); // Autobox int -> Integer
        }
        System.out.println(map);
        for(CountedString cstring : cs) {
            System.out.println("Looking up " + cstring);
            System.out.println(map.get(cstring));
        }
    }
}