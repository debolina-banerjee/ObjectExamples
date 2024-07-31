
public class DivisionThrowsExample {
    public static int divideNumbers(int dividend, int divisor)throws ArithmeticException{
        if(divisor==0){//2
            throw new ArithmeticException("Cannot divide the given number by zero");//3
            //creating new exception object
        }

        return dividend/divisor;
    }

    public static void main(String[] args) {
        try{
            divideNumbers(5,0);}
        catch(ArithmeticException e){
            System.out.println(e);
        }


        System.out.println("Hello");


    }
}
