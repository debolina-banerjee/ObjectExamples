public class ClassCastExceptionEx {

    public static void main(String[] args){
        try{
           int result =  method1(10);
            System.out.println(result);


        }
        catch(Exception e){
            System.out.println(e.getMessage());
        };
        //method1(10/0);
    }
    public static int method1(int num){

            if(num<0){
                throw new ArithmeticException();//explicitly mentioned
            }
            return  num;
        }
}
//throw=>unchecked exception