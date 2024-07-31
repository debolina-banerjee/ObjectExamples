public class CheckVowelException extends Throwable {

    public static void checkException(String str){
        try {
            for(int i=0;i<str.length();i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    throw new IllegalArgumentException("No vowels are allowed");

                }
//                else{
//                    System.out.println("Given string contains " + str.charAt(i) + " at the index " + i);
//
//            }
        }

        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String str="Java";
        checkException(str);
    }
}
