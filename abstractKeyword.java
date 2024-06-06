 abstract class Car{ // The abstract method drive in type Car can only be defined by an abstract class
        public abstract void drive();  //Abstract methods do not specify a body
           
        public void playMusic(){
            System.out.println("Playing music in car");
        }

}
class  Tesla extends  Car{
    public  void drive(){
        System.out.println("drive in  tesla");
    }
}
public class abstractKeyword {
    public static void main(String[] args) {  // we can't create object of an abstract class
        // Car  c = new Car();
        // c.drive();
        // c.playMusic();
        Car cd  = new Tesla();   // but we create refrence of abstract class!
        cd.drive();
        cd.playMusic();
        
    }
}
