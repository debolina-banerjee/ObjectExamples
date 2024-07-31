
class Parent {
    public Parent(){
        super();
        System.out.println("Inside Parent class");
    }
}
class Child extends Parent{
    public Child(){
        this("Debolina");
        System.out.println("Inside Child class");
    }
    public Child(String name){
        super();
        System.out.println("Inside parameterized Child class");
    }
}
public class TestException extends Child {

    public TestException(){
        this("Java");//compiler keeps this for default constructor only

        System.out.println("Inside default constructor Test Exception");
    }
    public TestException(String name){

       // super();//compiler keeps this for default constructor only
        System.out.println("Inside parameterized constructor Test Exception");
    }

    public static void main(String[] args) {
        TestException obj1= new TestException();

    }
}
//Object class constructor is the last execution statement in case of constructor chaining
//Super is the keyword which will be used to call parent class constructor
//this keyword is used to call same class constructor or method
//. =>method , ()=>constructor
//If we break constructor chain will give compile time error