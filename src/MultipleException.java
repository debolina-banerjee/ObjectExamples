public class MultipleException {
    public static void main(String[] args) {
        try {
            method1("dummy");
        }
        catch(ClassNotFoundException|InterruptedException e){

        }
        catch(Exception e){

        }
    }
    public static void method1(String name)throws ClassNotFoundException,InterruptedException{
            if(name.equals("dummy")){
                throw new ClassNotFoundException();
            }
            else if (name.equals("interrupted")){
                throw new InterruptedException();
            }
    }
}
