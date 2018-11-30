package Question2;

public class Circle extends Shape{
    Point center;
    double radius;

    public Circle(double x, double y, double radius){
        super("Circle");
        this.center = new Point(x,y);
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setCenter(double x, double y){
        this.center = new Point(x, y);
    }

    public Point getCenter()
    {
        return center;
    }

    public double getArea(){
        return Math.PI *  radius* radius;
    }

    public String toString(){
        return "Center = " + center + ";" + " Radius = " + radius + ";";
    }

    }