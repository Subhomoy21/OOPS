package OOPSCore1;
class Calculator{
  
    public int add(int num1,int num2)
    {
        int r = num1+ num2;
        return r;
    }
}
public class Demo {
    public static void main(String[] args) {
        Calculator cal  = new Calculator();
        int result = cal.add(5, 4);
        System.out.println("The sum of the two number are:" + result);
    }
}