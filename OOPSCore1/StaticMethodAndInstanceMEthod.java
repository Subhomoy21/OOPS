package OOPSCore1;
class Demo1{
    // here we are showing that how static is playing the important role
     public void display(){
        // here it is a instance method
        System.out.println(1);
    }
}
class DemoForStatic{
    static void display1(){
        System.out.println(2);
    }
}
public class StaticMethodAndInstanceMEthod {
    public static void main(String[] args) {
        // now for the execution we need to make object of class demo
        Demo1 d = new Demo1();
        d.display();
        // for static method we donot need to intialise object
        DemoForStatic.display1();
    }
}
