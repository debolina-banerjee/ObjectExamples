public class ExceptionPractice {
    public static void main(String[] args) {
        System.out.println("Before exception");

        //int a =10/0;//Arithmetic Exception
        //int arr[]= new int[-5];//Negative Array size exception
        int a = Integer.parseInt("abc");//Number format exception

        System.out.println("After exception");
    }
}
