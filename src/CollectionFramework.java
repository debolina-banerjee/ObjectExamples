import java.util.ArrayList;

public class CollectionFramework {
    public static void main(String[] args) {
        ArrayList object1 = new ArrayList();
        object1.add("abc");//0th index
        object1.add(123);
        object1.add(true);
        object1.add(12.50);//3rd index

        System.out.println(object1);
        System.out.println(object1.get(10));
    }
}
//ArrayList is growable in nature and default size of arrayList is 10 and it will increment the sieze
//by 50%
//List internal implementation is Array
//As ArrayList maintain index so it will be helpful for searching operations
//ArrayList implements random access interface which will make sure to return every element with the
//same speed
//ArrayList is not thread-safe
