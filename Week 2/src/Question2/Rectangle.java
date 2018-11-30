package Question2;

public class Rectangle extends Shape{
    Point topleft;
    double length;
    double width;

    public Rectangle(double x, double y, double length, double width) {
        super("rectangle");
        this.topleft = new Point(x, y);
        this.length = length;
        this.width = width;
    }

    public void setTopLeft(double x, double y) {
        this.topleft = new Point(x, y);
    }
    public Point getTopleft(){
        return topleft;
     }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return width * length;
    }
    public String toString(){
        return "TopLeft = " + topleft + ";" + " Length = " + length + ";" + " Width = " + width + ";";
    }
}
