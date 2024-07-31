public class ThrowExample {
    public static void main(String[] args)throws ClassNotFoundException {
        try {
            method1();//1
        }
        catch (ClassNotFoundException e){//3
            throw e;//4
        }

    }
   public static void  method1()throws ClassNotFoundException{
        throw new ClassNotFoundException();//without throws=> unhandled exception 2
    }
}
//Throw used =>new exception
//re-throw exception
//