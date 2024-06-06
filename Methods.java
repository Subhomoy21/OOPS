
class Computer{
    public void playMusic(){
        System.out.println("music playing");
    }
    public int MsWord(int open , int close){
            if(open == close){
                System.out.println("Computer is running perfectly");
            }
    return 0;
    }
        public String getMePen(int cost){
            if(cost >=10)
            return "Pen";
            
            return "Nothing";
        }
}
public class Methods {
     
    public static void main(String[] args) {
        
        Computer comp = new Computer();
        comp.playMusic();
        int a = comp.MsWord(4, 4);
        System.out.println(a);
        String b = comp.getMePen(15);
        System.out.println(b);
    }

}
