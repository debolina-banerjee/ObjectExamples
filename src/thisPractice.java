public class thisPractice {
    int id;
    String employeeName;
    int salary;

    //Parameterized constructor
    thisPractice(int id , String employeeName , int salary){
        this.id=id;
        this.employeeName=employeeName;
        this.salary = salary;

        this.display();


    }
    //Flow starts from default constructor
    //Invoking current class constructor with argument=>the flow goes upwards
    thisPractice(){
        this(1,"Debolina",200);
    }
    void display(){
        System.out.println("Id: " +id);
        System.out.println("Name: "+employeeName);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        thisPractice object1 = new thisPractice();//invoke default constructor
    }

}

//this keyword refers to current class object
//by using this keyword we can call or invoke current class instance variables,instance methods and
//constructors
//Flow starts from main method =>invoking empty class constructor
//In empty class constructor we have this() which will in turn invoke parameterized constructor
//so as to initialize instance variables





