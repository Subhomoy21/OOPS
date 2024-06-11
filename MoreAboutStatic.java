class Employee{
    int empid;
    String name ;
    static String company = "Tcs DIgital";

    public Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }
    public void display(){
        System.out.println(empid + " " + name + " " + company );
    }
}
public class MoreAboutStatic {
    public static void main(String[] args) {
        Employee e1  = new Employee(101, "Subhomoy");
        e1.display();
        Employee e2 = new Employee(102, "Raghav");
        e2.display();
    }
}
