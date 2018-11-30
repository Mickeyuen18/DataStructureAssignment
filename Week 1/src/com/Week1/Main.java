package com.Week1;

import miscLib.*;
public class Main {

    public static void main(String[] args) {
        double w; //Weight
        double h; // Height
        double fc; //Fat Coefficient

        w = SimpleInput.getDouble("Please input the weight");
        h = SimpleInput.getDouble("Please input the height");
        fc = w / (h*h); //Caculation Fomula

        if (fc >25){
            System.out.println("Too Fat, need to keep fit!");
        }
        else if (fc <15){
            System.out.println("Too Thin, need to keep fat!");
        }
        else{
            System.out.println("Just fit, keep on!");
        }

    }
}
