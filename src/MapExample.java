import java.util.HashMap;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap object1 =  new HashMap();
        object1.put("hello",123);//(k,v) same val
        object1.put(1234,"java");
        object1.put(1234,"ruby");
        object1.put("helloOne",123);//same val
        System.out.println(object1);
//Tree MAp for key single datatype , val can have diff datatype
        TreeMap object2 = new TreeMap();
        object2.put(123,"java");
        object2.put(184,12345);
        object2.put(null,12345);//smallest key will come first , sorted on basis of key
        System.out.println(object2);

    }
}
//Duplicate key  is not possible=>the value is overridden
//val same id possible =>key will be diff