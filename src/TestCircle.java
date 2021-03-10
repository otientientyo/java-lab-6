public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("The raddius is :  " + c1.getRadius());
        System.out.println("The color is:  " + c1.getColor());
        System.out.printf("The area is: %.2f%n",  c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The radius is:  " + c2.getRadius());
        System.out.println("The color is:  "+ c2.getColor());
        System.out.printf("The area is: %.2f%n", c2.getArea());

        Circle c3 = new Circle(2.0);
        System.out.println("The radius is:  " + c3.getRadius());
        System.out.println("The color is:  "+ c3.getColor());
        System.out.printf("The area is: %.2f%n", c3.getArea());

        Circle c4 = new Circle(2.0);
        System.out.println("The radius is:  " + c4.getRadius());
        System.out.println("The color is:  "+ c4.getColor());
        System.out.printf("The area is: %.2f%n", c4.getArea());

        Circle c5 = new Circle(2.0);
        System.out.println("The radius is:  " + c5.getRadius());
        System.out.println("The color is:  "+ c5.getColor());
        System.out.printf("The area is: %.2f%n", c5.getArea());

        Circle c6 = new Circle(2.0);
        System.out.println("The radius is:  " + c6.getRadius());
        System.out.println("The color is:  "+ c6.getColor());
        System.out.printf("The area is: %.2f%n", c6.getArea());
    }
}
