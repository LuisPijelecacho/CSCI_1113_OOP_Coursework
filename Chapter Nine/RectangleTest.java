public class RectangleTest {
    public static void main (String[] args){

        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        rectangle1.setArea();
        rectangle2.setArea();
        rectangle1.setPerimeter();
        rectangle2.setPerimeter();

        System.out.println("The width of rectangle1 is " + rectangle1.getWidth() + " the height is "
        + rectangle1.getHeight() + ". This rectangle has an area of " + rectangle1.getArea() + " and a perimeter of " + rectangle1.getPerimeter());

        System.out.println("The width of rectangle2 is " + rectangle2.getWidth() + " the height is "
                + rectangle2.getHeight() + ". This rectangle has an area of " + rectangle2.getArea() + " and a perimeter of " + rectangle2.getPerimeter());
    }
}
