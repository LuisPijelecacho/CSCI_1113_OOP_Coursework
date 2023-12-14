public class Rectangle {
    private double width = 0;
    private double height = 0;

    private double area = 0;
    private double perimeter = 0;

    Rectangle(){

    }

    Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setPerimeter() {
        this.perimeter = (width + height) * 2;
    }

    public void setArea() {
        this.area = width * height;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
