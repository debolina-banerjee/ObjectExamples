public class TryCatchPracticeOne {

    public static void main(String[] args) {
        System.out.println("Before exception");

        try{
            int arr[]= new int[-5];
        }
        catch(NumberFormatException e){
            System.out.println("Error"+e);
        }
        catch(Exception e){
            System.out.println("Error"+e);
        }
        System.out.println("After exception");
    }
}
