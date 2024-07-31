import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v1= new Vector();
        v1.add("abc");
        v1.add(123);
        v1.add(12.28);
        v1.add(true);
        System.out.println(v1);
        System.out.println(v1.get(0));
    }
}
//Vector is thread-safe collection object