public class StudentDetails {
    int studentId;
    String name;
    String city;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public StudentDetails() {
        System.out.println("From default constructor");
    }

    StudentDetails(int studentId, String name, String city) {
        this.studentId = studentId;
        this.name = name;
        this.city = city;
    }
    @Override
public String toString(){
        return "StudentId: "+studentId + " Name: "+name+" City: "+city;
}

public boolean equals(Object o){
        StudentDetails s1 = (StudentDetails) o;
    System.out.println(this.name);
    System.out.println(s1.name);
        if((s1.studentId)==(this.studentId)&&(s1.name.equals(this.name))&&(s1.city.equals(this.city))){
            return true;
        }
        else{
            return false;
        }
}
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails(1, "Debolina", "Pune");
        StudentDetails s2 = new StudentDetails(1, "Debolina", "Pune");
        StudentDetails s3 = new StudentDetails(2, "Java", "Mangalore");
        System.out.println(s1.getName());//=>toString method is getting called internally

//        System.out.println(s1.toString());//same o/p
//        System.out.println(s3);
      System.out.println(s1.hashCode());//numeric value
        System.out.println(s2.hashCode());//numeric value
//
//        boolean bn = s1.equals(s2);
//        System.out.println(bn);
//        System.out.println(s1.equals(s3));

    }
//HashCode in Hexadecimal
}
//toString() is the method which is available inside java.lang.Object class ,used to give some
//information about the class
//By default internal implementation of toString() in a class is giving the hashcode in form
//of hexadecimal implementation
//If we want to give any other information using toString() then we override the toString()
//for writing our own implementation
//toString() is not final so it can be easily overridden

//For all the objects hashcode will be assigned internally by the JVM , JVM IDENTIFIES EACH
//OBJ UNIQUELY

//ClassName@HexaDecimalValue if we did not override toString() in custom class
//toString() prints the content of object

//It is totally based on the object content and returns integer number value -hashcode
//It will return hashnumber hashcode on the basis of object-content
//Default implementation comes from Object class unless it is overridden
//Default implementation may/may-not return same hashCode number
//If two object are equals then their hashCode must be same
//If two objects have same hashCode they may /may not be equals