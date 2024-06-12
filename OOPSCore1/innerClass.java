package OOPSCore1;
class AB{   // we  could never use static keywords in outer class
   int age;
      public void show(){
        System.out.println("In show");
      }
      class BA{
        public void config(){
            System.out.println("In config");
        }
      }
}

public class innerClass {
    public static void main(String[] args) {
        AB obj = new AB();
        obj.show();
        AB.BA obj1 = obj.new BA(); // how inner class calls new obj
        obj1.config();
    }
}
