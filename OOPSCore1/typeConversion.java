package OOPSCore1;
public class typeConversion {
    public static void main(String[] args) {
        // byte b = 127;
        // int a = b;
        // System.out.println(a);
        int a = 12;
        byte k =(byte) a;  // type casting
        System.out.println(k);
        // what if a = 257  more than the range ;
        int a1 = 257;
        byte t = (byte) a1;
        System.out.println(t); // 1
        // t = 1 how ? -> 257 % 256;

        float f = 5.6f;
        int g = (int) f;
        System.out.println(g);

        // type promotion
        byte x = 10;
        byte y = 30;
        int result = x*y;
        System.out.println(result);
    }
}
