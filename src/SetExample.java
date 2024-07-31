import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet object1= new HashSet();
        object1.add("hello");
        object1.add(123);
        object1.add(123);
        object1.add("hello");
        System.out.println(object1.size());
        System.out.println(object1);
        TreeSet object2 = new TreeSet();
        //Arranged in ascending order, and accepts only singular datatype due to sorting
        //duplicates are not allowed
        object2.add(123);
        object2.add(124);
        object2.add(10);
        System.out.println(object2);

        TreeSet object3 = new TreeSet();
        object3.add("java");
        object3.add("hello");
        object3.add("java");
        object3.add("hello");
        System.out.println(object3);

    }

}
//we cannot have duplicate elements in Set