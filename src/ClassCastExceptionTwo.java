public class ClassCastExceptionTwo {

    public static void main(String[] args) {
//            Object val=0;
//        System.out.println(String(val));
//        Object obj = new String ("hello");
//        System.out.println(Integer(obj));
        try{
            Object o = new Object();
            String S = (String) o;
        }
        catch(ClassCastException e ){
            System.out.println(e);
        }
        catch(Exception ex){
            System.out.println(ex);
        }


    }
}
//ClassCastException => Type casting child type to parent type