public class User {//2
    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 120) {//5
            throw new IllegalArgumentException("Age must be between 0 and 120. Provided age: " + age);
            //string msg as a parameter, this message is catching block using getMessage()
        }//6
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User user = new User();//1 3

        try {
            user.setAge(130); // 4 This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {//7
            System.out.println("Caught an exception: " + e.getMessage());//8
        }

        try {
            user.setAge(25); // This will set the age successfully
            System.out.println("User age set to: " + user.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
