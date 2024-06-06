class Student{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(22);
        s.setName("Subhomoy Das");
        System.out.println(s.getName() + "  age is : " + s.getAge());
    }
}
