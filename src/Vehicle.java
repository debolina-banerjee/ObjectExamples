public class Vehicle {
    int engine =1;
    int wheels;

    Vehicle(int wheels){
        this.wheels=wheels;
    }
    void numberOfEngines(){
        System.out.println("engines"+engine);
    }
    void numberOfWheels(){
        System.out.println("wheels"+wheels);
    }



}
class Bike extends Vehicle{
  //From Bike class constructor calling immediate parent class constructor
    //call superclass constructor and instance method from subclass
    //
    Bike(int wheels){
        super(wheels);
    }
    void displayBike(){
        System.out.println(super.engine);//o/p=>1
        //super.numberOfEngines();//1
        super.numberOfWheels();
    }

    public static void main(String[] args) {
        Bike object1= new Bike(2);
        object1.displayBike();
    }
}