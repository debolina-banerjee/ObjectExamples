public class CheckedExceptionDemoOne {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        try{
            throw new ClassNotFoundException();
        }
        catch(ClassNotFoundException exceptionObject){
            exceptionObject.printStackTrace();
        }

    }
}
//handling class with try-catch instead of adding throws after the called
// and caller method signature
