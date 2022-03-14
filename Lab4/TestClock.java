package Lab4;

public class TestClock {
    public static void main(String[] args) {
        Clock myClock = new Clock(14, 12, 0);
        myClock.setTime(15, 58, 32);
        for (int i = 0; i < 5; i++) { 
            myClock.incrementMinutes();
        }
        System.out.println(myClock.toString());
        Clock yourClock = new Clock(9, 59, 59);
        // System.out.println(yourClock.toString());
        // myClock.makeCopy(yourClock);
        // System.out.println(myClock.equals(yourClock));
        // Clock tempClock = yourClock.getCopy();
        // System.out.println(tempClock.equals(yourClock));
        
        // yourClock.incrementSeconds();
        // System.out.println(yourClock.toString());

        // Clock joeClock = new Clock(9, 22, 00);
        // for (int i = 0; i < 5; i++) {
        //     joeClock.incrementHours();
        // }
        // System.out.println(joeClock.toString());
        // System.out.println(Clock.whatSound());
    }
}
