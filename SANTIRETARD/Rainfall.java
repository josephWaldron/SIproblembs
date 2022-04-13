package SANTIRETARD;

public class Rainfall {
    //data types
    public String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Agu", "Sep", "Oct", "Nov", "Dec"};
    public double rainFall[] = new double[12];
    //constructors
    public Rainfall(double rainFall[]){
        this.rainFall = rainFall;
    }
    //methods
    public double totalRainfall(){
        double total = 0.0;
        for (int i = 0; i < rainFall.length; i++) {//adds together all values in rainFall array
           total += rainFall[i]; 
        }
        return total;
    }
    public double averageRainfall(){
        return totalRainfall() / 12;
    }
    public String mostRainfall(){
        double most = rainFall[0];
        int mostIndex = 0;
        for (int i = 1; i < rainFall.length; i++) {
            if(rainFall[i] > most){
                most = rainFall[i];
                mostIndex = i;
            }
        }
        return month[mostIndex];
    }
    public String leastRainfall(){
        double least = rainFall[0];
        int leastIndex = 0;
        for (int i = 1; i < rainFall.length; i++) {
            if(rainFall[i] < least){
                least = rainFall[i];
                leastIndex = i;
            }
        }
        return month[leastIndex];
    }
}
