interface example{
    int age = 24;         // in interface every variable are final and static by default
    String name  = "Mumbai";
     void show();
     void config();  //  by default in interface every method is public and abstract
}
interface example2{
    void run();
}
class notExample implements example , example2{
      public void show(){
        System.out.println("In show");
      }
      public void config(){
        System.out.println("In config");
      }
      public void run(){
        System.out.println("I am in Run");
      }
}

public class multipleInterfaces {
    public static void main(String[] args) {
        example ex = new notExample();
        ex.show();
        ex.config();
        // example2 ex1 = new notExample();
        // ex1.run();
    }
}
