package OOPSCore1;
class Moblie{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + ":" + price + " :"  + name);
    }
}
public class staticVariable {
    public static void main(String[] args) {
        Moblie m1 = new Moblie();
        m1.brand = "Samsung";
        m1.price = 1500;
        Moblie.name = "phone";

        Moblie m2 = new Moblie();
        m2.brand = "Apple";
        m2.price = 1400;
        Moblie.name = "phone";

        Moblie.name = "smartphone";

        m1.show();
        m2.show();
    }
}
