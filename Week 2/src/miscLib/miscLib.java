package miscLib;
import java.util.Random;
public class miscLib {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 0 ; i< 10; i++)
            System.out.print(genInt(1, 100) + " ");
        System.out.println();
        for(int i = 0; i < 10; i++)
            System.out.print(genInt(-10, 0) + " ");
        System.out.println();
        System.exit(0);
    }

    private static int genInt(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
