package midterm;

public class Car {
    
    boolean running = false;        //is car running
    boolean lights = false;     //are the lights on
    int speed = 0;      //speed of car in mph
    double gasleft = 100;       //percentage of gas left in car
    double steering = 0;        //steering value in degrees 0 is center 180 is far right and -180 is far left
    

    //constructors
    public Car(boolean running, boolean lights, int speed, double gasleft, double steering){
        this.running = running;
        this.lights = lights;
        this.speed = speed;
        this.gasleft = gasleft;
        this.steering = steering;
    }
    public Car(){
    }

    //getters and setters
    public boolean getRunning(){
        return running;
    }
    public void setRunning(boolean running){
        this.running = running;
    }
    public boolean getLights(){
        return lights;
    }
    public void setlights(boolean lights){
        this.lights = lights;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public double getGasleft(){
        return gasleft;
    }
    public void setGaselft(double gasleft){
        this.gasleft = gasleft;
    }
    public double getSteering(){
        return steering;
    }
    public void setSteering(double steering){
        this.steering = steering;
    }

    //methods
    public String toString(){
        return "This car is running: " + running + "\nThis car has lights on: " + lights + 
        "\nThis cars speed: " + speed + "\nThis cars remaining gas: " + gasleft + "\nThis cars steering input:" + steering;
    }
    public String getDirection(){
        if (steering == 0)return "Straight";
        else if(steering < 0)return "Left";
        else return "Right";
    }
    public boolean outOfGas(){
        if(gasleft == 0){
            running = false;
            return true;
        }
        else return false;
        
    }

}

