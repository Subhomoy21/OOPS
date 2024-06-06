class  Calculator{
    public int add(int n1,int n2){
        return n1 + n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double  n1,double n2,double  n3){
        return n1+n2+n3;
    }
}

public class MethodOverLoading {
    
    public static void main(String[] args) {
         Calculator caccl = new Calculator();
         int r1 = caccl.add(3, 4);
         System.out.println(r1);
    }
}
