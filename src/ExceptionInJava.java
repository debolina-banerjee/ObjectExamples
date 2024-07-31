import java.io.IOException;

public class ExceptionInJava {
    public static void main(String[] args) throws IOException {
        int i=10;
//        System.out.println(10/0);
        System.out.println("Hello");
        ExceptionInJava object1 = new ExceptionInJava();
        object1=null;
        System.out.println(object1.toString());
        readFile("hello");
    }
    public static void processFile(String fileName) throws IOException {

            readFile(fileName);


    }
    public static void readFile(String fileName) throws IOException {
        // code that might throw IOException
    }


}
//Throwable is the parent of all the exceptions
//checked exception=>compile time error(checked before running)
//unchecked exception=> compiler not able to recognize , run time exception will occur
//calling any method/property at null , it will create null pointer exception
//unchecked exception ->nullpointer , arithmetic exception , numberFormat
//checked exception =>IO Exception , SqlException