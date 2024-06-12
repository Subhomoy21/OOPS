package OOPSCore1;
class counter{
    int count = 0;

    public counter() {
        count++;
        System.out.println(count);
    }
}

class HowStaticsEffectsCounter{
    static int count = 0;

    public HowStaticsEffectsCounter(){
        count++;
        System.out.println(count);
    }
}

public class staticCounter {
    public static void main(String[] args) {
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();

        // now observe the output of the howStaticEffectCounter
        HowStaticsEffectsCounter sc1 = new HowStaticsEffectsCounter();
        HowStaticsEffectsCounter sc2 = new HowStaticsEffectsCounter();
        HowStaticsEffectsCounter sc3 = new HowStaticsEffectsCounter();
    }
}
