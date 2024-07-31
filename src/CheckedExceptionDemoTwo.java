public class CheckedExceptionDemoTwo {
    public static void main(String[] args) {
        try {
            method1();
        }
        catch(ClassNotFoundException e){

        }
    }
    public static void method1()throws ClassNotFoundException{//msg to caller
        throw new ClassNotFoundException();

    }
}
//handling class with try-catch instead of adding throws after the called and caller method signature
//throw=>Used to throw a new exception or to rethrow the exception