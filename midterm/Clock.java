package midterm;

public class Clock {
    private int hr; //data fields
    private int min;
    private int sec;
    
    public Clock(){ //constructors
        hr = 0;
        min = 0;
        sec = 0;
    }
    public Clock(int hr, int min, int sec){ //parameters
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    
    public void setTime(int hr, int min, int sec){ //mutator
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public int getHr() {    //acessor
        return hr;
    }
    public int getMin() {
        return min;
    }
    public int getSec() {
        return sec;
    }
    
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
    // @Override
    // public String toString() {
    //     return "Time: " + this.hr + ":" + this.min + ":" + this.sec;
    // }
}
