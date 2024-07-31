public class CloneExample implements Cloneable {

    String name;
    int id;

    CloneExample(String name,int id){
        this.name = name;
        this.id= id;
    }

    void print(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
    }

    public static void main(String[] args)throws CloneNotSupportedException  {
        CloneExample obj1=  new CloneExample("Java",1);
        obj1.print();// 1 Java

        CloneExample obj2=(CloneExample) obj1.clone();//type-casted to subclass/child class
        obj1.name="Debolina";
        obj1.print();// 1 Debolina
        obj2.print();// 1 Java ===>change in obj1 . but no impact in obj2

    }


}
