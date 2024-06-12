package OOPSCore1;
//  final class A{    because of final we cant inherit A 

class A{ 
//     final public void show(){    // here after using final class B method cant overrid the class A method show
//         System.out.println("in Show A");
//    }
   public void add(int a, int b){
    System.out.println(a+b);
   }
}
class B extends A{
    public void show (){
        System.out.println(" in show B");
    }
}
public class finalInJava {
    public static void main(String[] args) {
    //     int num = 9;
    //     num = 8;
    //     System.out.println(num);
    //     // after the final keyword
    //     final int n = 4;
    //  //   n = 8; // The final local variable n cannot be assigned. It must be blank and not using a compound assignment(error)
    //     System.out.println(n);
    B obj = new B();
    obj.show(); // here the class B method is overridding and print in show msg !
    }
}
