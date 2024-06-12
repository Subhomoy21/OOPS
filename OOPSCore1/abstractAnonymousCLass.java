package OOPSCore1;

abstract class Ab{
    public abstract void show();
    public abstract void config();
}
public class abstractAnonymousCLass {
    public static void main(String[] args) {
        //Ab obj = new Ab(); // error because abstract keyword never instantiate obj 
        // instead of this we can use concept of anonymous inner class
        Ab obj = new Ab() {
            public void show(){
                System.out.println("In  new show");
            }
            public void config(){
                System.out.println("In new config");
            }
        };
        obj.show();
        obj.config();
    }
}
