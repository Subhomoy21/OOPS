package OOPSCore1;
@FunctionalInterface
interface App{
    void show();
}

//  using the implements keyword 
// class Z implements App{
//     public void show(){
//         System.out.println(" I am in method of class z");
//     }
// }
public class functionalInterface {
    public static void main(String[] args) {
        // method 1 -> using the implements we can achive it!
        // App obj = new Z();
        // obj.show();

        // method 2 -> using the anonymous inner class
        App ap = new App() {
            public void show(){
                System.out.println("I am in method show using inner class");
            }
        };
        ap.show();
    }
}
