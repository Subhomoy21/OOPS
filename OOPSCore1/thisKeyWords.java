package OOPSCore1;
class Human{
    private int age ;                             // this keyword help to maintain same variable name in instance and local variable 
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class thisKeyWords {
    public static void main(String[] args) {
    Human h1 = new Human();
    h1.setAge(50);
    h1.setName("Rupendra");
    System.out.println(h1.getName() + " is :" + h1.getAge());
    }
}
