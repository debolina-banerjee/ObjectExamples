public class HashCodeAndEquals {
    public static void main(String[] args) {
        Student obj1 =  new Student("Debolina",1);
        Student obj2 = new Student("Debolina",1);

        if(obj1.equals(obj2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        System.out.println("Hashcode of Object1: "+obj1.hashCode());
        System.out.println("Hashcode of object2: "+obj2.hashCode());
    }
}
//False =>not overridden equals()
//Content is same why did equals return False?