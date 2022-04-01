package lab6_inheritance;

public class testShape {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 4, "r1");
        System.out.println(r1.toString());
        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());

        Rectangle r2 = new Rectangle();
        r2.setDimensions(4, 2);
        r2.setName("r2");
        System.out.println("\n" + r2.toString());
        System.out.println("Area = " + r2.area());
        System.out.println("Perimeter = " + r2.perimeter());

        System.out.println("Equals? = " + r1.equals(r2));

        Rectangle r3 = new Square(2, "r3");
        System.out.println("\n" + r3.toString());
        System.out.println("Area = " + r3.area());
        System.out.println("Perimeter = " + r3.perimeter());

        Square s1 = new Square(4, "s1");
        System.out.println("\n" + s1.toString());
        System.out.println("Area = " + s1.area());
        System.out.println("Perimeter = " + s1.perimeter());

        System.out.println("Equals? = " + r3.equals(s1));
    }
}
