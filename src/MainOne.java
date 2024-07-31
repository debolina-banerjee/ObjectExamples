class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

 class Person implements Cloneable {
    String name;//deep-copy
    Address address;//shallow copy

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return name + " lives in " + address.city;
    }
}

public class MainOne {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person person1 = new Person("John", address);
        Person person2 = (Person) person1.clone();
        Person person3 = (Person) person1.clone();

        System.out.println(person1); // John lives in New York
        System.out.println(person2); // John lives in New York
        System.out.println(person3);//John lives in New york

        person2.name = "Jane";//deep copy affects the current object
        person2.address.city = "San Francisco";//shallow copy impacted in all objects


        System.out.println(person1); // John lives in San Francisco
        System.out.println(person2); // Jane lives in San Francisco
        System.out.println(person3);//John lives in San Francisco
    }
}
//In address class we are not implementing Cloneable Interface then it will not participate
//in Cloning operation , so it is Shallow-copy
//Address class is used as a field inside Person so it is called Derived Data-type or Custom data-type
//