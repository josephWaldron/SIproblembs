package lab6_inheritance;

public class Square extends Rectangle{
    private double sideLength;
    public Square(){
        super();
        sideLength = 0;
    }
    public Square(double side, String name){
        super(side, side, name);
    }

    public double getSideLength() {
        return sideLength;
    }
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    public double area(){
        return super.area();
    }
    public double perimeter(){
        return super.perimeter();
    }
    @Override
    public String toString() {
        return super.toString() + " This is a square";
    }
}
