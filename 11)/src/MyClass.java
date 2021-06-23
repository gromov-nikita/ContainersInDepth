import java.util.Random;

public class MyClass implements Comparable {
    private Integer value;
    public MyClass() {
        value = new Random().nextInt(100);
    }
    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }
    @Override
    public int compareTo(Object o) {
        return this.getValue() - ((MyClass)o).getValue();
    }
}
