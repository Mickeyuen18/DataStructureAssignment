package Question3;
import Question2.*;
import miscLib.GenLib;
import java.util.Random;
public class RandomNum{
    public static void main(String args[]){
        Shape[] shapes;
        // random size
        int size = GenLib.genInt(5, 25);
        shapes = new Shape[size];
        // random generate Circle / Rectangle
        for(int i=0; i < shapes.length;i++){
            double x = (double) (GenLib.genInt(1, 50));
            double y = (double) (GenLib.genInt(1, 50));

            if(GenLib.genInt(1,10)%2 == 0){
                double radius = (double) (GenLib.genInt(1, 50));
                shapes[i] = new Circle(x, y, radius);
            } else {
                double length = (double) (GenLib.genInt(1, 50));
                double width = (double) (GenLib.genInt(1, 50));
                shapes[i] =  new Rectangle(x,y ,length ,width );
            }
            System.out.println(shapes[i].getName() + " : " + shapes[i] + " Area = " + shapes[i].getArea());
        }
        // random: X, Y, Radius, Length, Width

    }
}
