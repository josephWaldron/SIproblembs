package abstact;

public class parallelogram extends quadrilateral {
    private int base;
    private int height;
    public parallelogram(){
    }
    public parallelogram(int base, int height){
        this.base = base;
        this.height = height;
    }
    public parallelogram(int base, int height, String color){
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return base * height;
    }
    @Override
    public double perimeter() {
        return 2 * (base + height);
    }
    @Override
    public boolean isQuadrilateral() {
        return true;
    }
    
}
