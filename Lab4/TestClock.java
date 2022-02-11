package Lab4;

public class TestClock {
    public static void main(String[] args) {
        Clock myClock;
        myClock = new Clock();
        Clock yourClock = new Clock(9, 59, 59);
        System.out.println(yourClock.toString());
        myClock.makeCopy(yourClock);
        System.out.println(myClock.equals(yourClock));
        Clock tempClock = yourClock.getCopy();
        System.out.println(tempClock.equals(yourClock));
        yourClock.incrementSeconds();
        System.out.println(yourClock.toString());

    }
}
