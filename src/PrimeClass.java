public class PrimeClass {

    public static void main(String[] args) {
        try {
            method1();
        }
        catch(MyCustomException e){
            e.printStackTrace();
//            System.out.println(e.printStackTrace());
        }
        System.out.println("Hello");

    }
        public static void method1()throws MyCustomException{
            throw new MyCustomException("some issue here");//look for MyCustomException class
            //class with a para -constructor
        }
}
//throws after main-method
//In the first case, you are handling the exception. Whether the program terminates, or not,
// is completely up to you (and how you are handling it). In the second case, where the exception
// is thrown by the main() method, then that exception is handled by the default exception handler,
// which by default, prints out the exception (along the a stacktrace) and terminates.