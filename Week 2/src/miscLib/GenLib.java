package miscLib;

import java.util.Random;

public abstract class GenLib {
    public static int genInt(int start, int end) {
        if (start >= end) {
            throw new IllegalArgumentException("Start must be greater than end");
        }
        Random r = new Random();
        return r.nextInt((end - start) + 1) + end;
    }
}
