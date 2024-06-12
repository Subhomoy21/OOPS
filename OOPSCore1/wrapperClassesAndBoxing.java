package OOPSCore1;
public class wrapperClassesAndBoxing {
    public static void main(String[] args) {
        int n = 7;
        Integer num1 = new Integer(n); // boxing -> taking a primitive value and storing that in a primitive object
        System.out.println(num1);
         
        //autoboxing  - > when you store a primitive type in object automatically
        int num = 8;
        Integer t = num; 
        System.out.println(t);

        // unboxing - > converting the object type to primtive type
        int a = 5;
        Integer b = a;
        int res = b.intValue(); 
        System.out.println(res);

        // auto - unboxing 
      int ans1 = 2;
      Integer fans = ans1;
      int ans3 = fans;
      System.out.println(ans3);

      // one more thing about wrapper class
      String s = "12";
      int res1 = Integer.parseInt(s);
      System.out.println(res1 * 2);

    }
}
