public class CheckedExceptionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }
    public static void method1()throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}
//Error=>unreported exception java.lang.ClassNotFoundException
//Problem can be handled with throws
//throws is placed after the method signature and caller method signature
// throws tells the caller that the method might
//or might not throw exception
//the caller has to handle it