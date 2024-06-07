class X{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("Show in class A");
    }
}
class Y extends X{
        @Override   // annotation
        public void showTheDataWhichBelongsToThisClass(){
            System.out.println("Show in class B");
        }
}
public class annotation {
    public static void main(String[] args) {
        X obj1 = new X();
        obj1.showTheDataWhichBelongsToThisClass();
        Y obj2 = new Y();
        obj2.showTheDataWhichBelongsToThisClass();
        X obj3 = new Y();
        obj3.showTheDataWhichBelongsToThisClass();
    }
}
