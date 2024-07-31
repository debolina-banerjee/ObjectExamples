public class NullPointerExceptionEx {

    public static void main(String[] args) {
//        String val =null;
//        System.out.println(val.charAt(0));

        String ptr = null;
        try{
            if("java".equals(ptr)){
                System.out.println("same");
            }
            else{
                System.out.println("not same");
            }
        }
        catch(NullPointerException e){
            System.out.println("Caught NullPointer exception");

        }
    }
}
