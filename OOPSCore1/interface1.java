package OOPSCore1;
/**
 * Innerinterface1
 */
 interface example{
        int age = 24;         // in interface every variable are final and static by default
        String name  = "Mumbai";
         void show();
         void config();  //  by default in interface every method is public and abstract
}
class notExample implements example{
          public void show(){
            System.out.println("In show");
          }
          public void config(){
            System.out.println("In config");
          }
}
public class interface1 {
    public static void main(String[] args) {
        // example ex = new example();   //Cannot instantiate the type example
            example ex2 = new notExample();
            ex2.show();
            ex2.config();
            // because the variable is static so we can access the variable without creating its object
            // eg
            System.out.println(example.age);
            System.out.println(example.name);
    }
}
