@FunctionalInterface
interface Task2{
    int add(int a, int b);
}
public class lambdaWithReturn {
    public static void main(String[] args) {
        Task2 obj = new Task2() {
            public int add(int a, int b){
                return a + b;
            }
        };
        System.out.println(obj.add(5, 4));
    }
}
