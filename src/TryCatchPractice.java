public class TryCatchPractice {
    public static void main(String[] args) {
        System.out.println("Before Exception");

        try{
            int a =Integer.parseInt("abc");//one operation at a time

        }
        catch(NumberFormatException e ){//passing and stating the type of exception that is
            //likely to occur
            System.out.println("Error"+e);
        }
        catch(ArithmeticException e){//not relevant
            System.out.println("Error"+e);

        }
        finally{
            System.out.println("Hello");
        }
        try{
            int b=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Hello");
        }
//        finally{
//            System.out.println("Hello again..");//'finally' without 'try'
//        }


        System.out.println("After exception");
    }
}
//Inside try block there will be only on operation at a time
//Multiple try-catch blocks can be there