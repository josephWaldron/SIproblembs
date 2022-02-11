package Lab4;

public class Clock {
    private int hr;
    private int min;
    private int sec;
    //constructors
    public Clock(){
        super();
    }
    public Clock(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    //getters and setters
    public void setTime(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public void setHr(int hr) {
        this.hr = hr;
    }
    public int getHr() {
        return hr;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMin() {
        return min;
    }
    public void setSec(int sec) {
        this.sec = sec;
    }
    public int getSec() {
        return sec;
    }
    //methods
    public void incrementHours(){
        this.hr += 1;
        if(hr > 23){
            hr = 0;
        }
    }
    public void incrementMinutes(){
        this.min += 1;
        if(min > 59){
            min = 0;
            incrementHours();
        }
    }
    public void incrementSeconds(){
        this.sec += 1;
        if(sec > 59){
            sec = 0;
            incrementMinutes();
        }
    }
    public boolean equals(Clock otherClock){
        return(this.sec == otherClock.sec && this.min == otherClock.min && this.hr == otherClock.hr);
    }
    public void makeCopy(Clock otherClock){
        this.hr = otherClock.hr;
        this.min = otherClock.min;
        this.sec = otherClock.sec;
    }
    public Clock getCopy(){
        return new Clock(this.hr, this.min, this.sec);
    }
    @Override
    public String toString() {
        return "Time: " + this.hr + ":" + this.min + ":" + this.sec;
    }
}
