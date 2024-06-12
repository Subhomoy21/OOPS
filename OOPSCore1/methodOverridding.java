package OOPSCore1;
class key{
    public int add(int n1 , int n2){
        return n1 + n2;
    }
}
class keypad extends key {

    @Override
    public int add(int n1, int n2) {
        // TODO Auto-generated method stub
        return super.add(n1, n2);
    }
    }
// here the add method of keypad is overridding over key class method
public class methodOverridding {
    public static void main(String[] args) {
        keypad k = new keypad();
        int result = k.add(1, 2);
        System.out.println(result);
    }
}
