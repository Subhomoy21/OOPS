package OOPSCore1;
class Machine{
    private int id;
    private String name;

    public Machine(){  // default constructor
        id = 2;
        name = "Teratonics";
    }
    public Machine ( int id , String name) { // parameterized  constructor
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
}
public class constructor {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        System.out.println(m1.getId() + " : " + m1.getName());
        Machine m2 = new Machine(45,"Zebronics");
        System.out.println(m2.getId() + " : " + m2.getName());
    }
}
