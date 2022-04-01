package lab6_inheritance;

public class Rectangle {
    protected double length;
    protected double width;
    private String name;

    public Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(double length, double width, String name){
        setDimensions(length, width);
        this.name = name;
    }

    public void setDimensions(double l, double w){
        length = l;
        width = w;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public String getName() {
        return name;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }
    public Rectangle getCopy(){
        return new Rectangle(this.length, this.width, this.name);
    }
    public void makeCopy(Rectangle otherRectangle){
        this.length = otherRectangle.length;
        this.width = otherRectangle.width;
        this.name = otherRectangle.name;
    }
    public boolean equalsDim(Rectangle otherRectangle){
        return(this.length == otherRectangle.length && this.width == otherRectangle.width);
    }
    @Override
    public String toString() {
        return "Name = " + name + " Length = " + length + " Width = " + width;
    }
}
