package OOPSCore1;
import java.util.Arrays;

enum Status{
      Running , Failed , Pending, Success;   // named constant
//  [0         ,1             , 2                ,3]
}
public class enum1 {
    public static void main(String[] args) {
          int i = 7;
          Status s = Status.Failed;
          System.out.println(s);
          System.out.println(s.ordinal());

          // want to fetch all status
          Status ss[] = Status.values();
        //   for(Status it : ss){
        //     System.out.println(it);
        //   }
        System.out.println(Arrays.toString(ss));

    }
}
