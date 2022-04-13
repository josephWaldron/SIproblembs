package abstact;

public abstract class quadrilateral implements shape{
    private String color;
    public quadrilateral(){}
    public quadrilateral(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public abstract boolean isQuadrilateral();
    @Override
    public String color() {
        return color;
    }    
}
