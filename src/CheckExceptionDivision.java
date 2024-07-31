public class CheckExceptionDivision {
    public static int divideNumbers(int dividend, int divisor){
        if(divisor==0){//2
            throw new ArithmeticException("Cannot divide the given number by zero");//3
            //creating new exception object
        }

        return dividend/divisor;
    }

    public static void main(String[] args) {
        try{
            //taking risks
            int result= divideNumbers(5,2);//1
            System.out.println("Result"+result);
        }
        catch(ArithmeticException e){//4
            System.out.println("Error message:"+e.getMessage());//5
            e.printStackTrace();
        }

    }
}
