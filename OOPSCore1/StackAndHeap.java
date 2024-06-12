package OOPSCore1;
class  Calculator{
    int num = 5;
    public int add(int n1,int n2,int n3){
        System.out.println(num);
        return n1+ n2+n3;
    }
}
public class StackAndHeap {
    
    public static void main(String[] args) {
        int  data = 10;
        Calculator obj = new Calculator(); // obj is not an object its a variable
        Calculator obj1 = new Calculator();
        int r1 = obj.add(4, 5, 6);
     //   System.out.println(r1);
     System.out.println(obj.num);
     System.out.println(obj1.num);
    }
}
