class child{
    //default child constructor
    public child(){
        this("Debolina");
        System.out.println("Inside default constructor from child");

    }
    //parameterized child constructor
    public child(String name){
        super();
        System.out.println("From parameterized constructor from child");

    }
}

public class NewChaining extends child{

    //default constructor
    public NewChaining(){
        this("Java");

        System.out.println("From default constructor NewChaining");
    }

    //parameterized constructor
    public NewChaining(String name){
        super();
        System.out.println("From parameterized constructor NewChaining");

    }
    public static void main(String[] args) {
        NewChaining object1 =  new NewChaining();

    }

}
