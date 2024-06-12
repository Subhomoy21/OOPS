package OOPSCore1;
class test{
    static int a = 9;// static variable always can be class variable but never be local variable
    public void m(){
        //static int d = 20; // error 
        int h = 9;
    }
}
public class static1 {
    public static void main(String[] args) {
     //    System.out.println(a);   NOT POSSIBLE    
     System.out.println(test.a);
    }
}
