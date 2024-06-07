enum Status{
    Running , Failed, Pending,Success;
}
public class enumIfElse {
    public static void main(String[] args) {
        //  if esle in enum
        Status s = Status.Pending; // op - Please Wait
        if(s == Status.Running){
            System.out.println("All Good Continue");
        }
        else if(s == Status.Failed){
            System.out.println("Try Again");
        }
        else if(s == Status.Pending){
            System.out.println("Please Wait");
        }
        else{
            System.out.println("Done");
        }

        // switch in enum
        Status se = Status.Success;
        switch(se){
                case Running:
                      System.out.println("All Good Continue");
                      break;
                 case Failed:
                     System.out.println("Try Again");
                     break;
                case Pending:
                     System.out.println("Please Wait");
                     break;
                default:
                    System.out.println("Done");
                    break;
        }
    }
}
