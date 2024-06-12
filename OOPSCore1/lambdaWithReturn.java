package OOPSCore1;
@FunctionalInterface
interface Task2{
    int add(int a, int b);
}
public class lambdaWithReturn {
    public static void main(String[] args) {
        Task2 obj = (a,  b) ->
           {
                return a + b;
            };
        System.out.println(obj.add(5, 4));
    }
}
