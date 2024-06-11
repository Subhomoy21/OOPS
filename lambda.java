
@FunctionalInterface
interface Task{
    //void show();
    // what if the show method  excepts a value  like that
    void show(int i);
}
public class lambda {
    public static void main(String[] args) {
        // Task obj = new Task() {
        //     public void show(){
        //         System.out.println("Hello In show");
        //     }
        // };

        // without argument:
        // Task obj =() -> // lambda expression
        //     {
        //      System.out.println("Hello In show");    // if we have only one statement there is  no need of curly brackets
        //    } ;

        // with argument
        Task obj = ( i) ->{
                System.out.println("Hello I am in Show ............." + i);
            };
            obj.show(5);
    }
}
