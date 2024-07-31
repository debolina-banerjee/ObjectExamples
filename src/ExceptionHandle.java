public class ExceptionHandle {
    public static void main(String[] args) {
        int i=10;
        try {
            System.out.println(10/2);//exception occurred here=>1
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());// / by zero
            System.out.println("Inside catch");//exception catched here
        }


        catch (Exception e){
            System.out.println(e.getMessage());// / by zero
            System.out.println("Inside catch");//exception catched here
        }
        catch (Throwable e){
            System.out.println(e.getMessage());// / by zero
            System.out.println("Inside catch");//exception catched here
        }

        finally {
            System.out.println("Inside finally");
        }

        System.out.println("hello");
    }
}


//throws can be used in case of checked exception
//In unchecked exception we can use try-catch
//catch will get executed when there will be exception
//finally will get executed in every
//We can have multiple catch statements for one try block
//We can have only one finally block for one try block
//THROWABLE is the parent class of all exceptions =>run time exception
//In multi-catch scenario child exception should come first