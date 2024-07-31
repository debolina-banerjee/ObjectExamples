public class MyClass implements Cloneable{
    String name;
    int id;
    //initializing class variables use constructor
    MyClass (String name , int id){
        this.name = name;
        this.id=id;
    }
    void display(){
        System.out.println("id: "+id);
        System.out.println("Name: "+name);
    }

    public static void main(String[] args)throws CloneNotSupportedException {
        MyClass obj1= new MyClass("Debolina",1);
        obj1.display();
        //obj1.clone();//using subclass object invoking super class method
        //Clone object1 and assign it to new reference
        //assign duplicate new copy of obj1 to obj2 reference
        MyClass obj2 =(MyClass) obj1.clone();//cloning all the objects in the form of Object Class
        obj2.display();
        obj1.name="Java";//changing initial main object,copy obj2 will not be changed
        //need typecasting to MyClass
        //obj2.name="Java";//obj1 and obj2 are separate copies
        obj1.display();
        obj2.display();

//        obj1.display();
//
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
    }

}
//Marker Interface =>don't have any methods but it will provide some unique id =>uuid//uuid wil be used by compiler to understand cloneable operations
//Cloneable Operation is used to create a copy of object by using clone method
//clone() will return Object type
//Every class contains Object class method
//.clone() called=>return type Object but we are creating clone of our class so we
//doing typecasting in our class
//No change in original object in case of DEEP copy even if we make changes in the copied object
//Shallow Copy=>changes the content of the original object