 class A{
        public  void show1(){
            System.out.println("We are in show A");
        }
 }
 class B extends A{
          public void show2(){
            System.out.println("We are in show B");
          }
 }
public class upcastingDowncasting {
    public static void main(String[] args) {
      //   A obj = new B();  dynamic dispatch
      A obj = (A) new  B(); // upcasting
      obj.show1();

      B obj1 = (B) obj; // downcasting
      obj1.show2();
    }
}
