package OOPSCore1;

public class inheritance {
    public static void main(String[] args) {
        // for inheritance we need class file not a java file 
        advCalc ad = new advCalc();
        System.out.println(ad.add(4, 5) + " " + ad.sub(9, 5) + " " + ad.mul(2, 5) + " " + ad.div(15, 3));
        veryAdvCalc ad1 = new veryAdvCalc();
        System.out.println(ad1.add(4, 5) + " " + ad1.sub(9, 5) + " " + ad1.mul(2, 5) + " " + ad1.div(15, 3) +" " +  ad1.power(2, 3));
       
    }
}
