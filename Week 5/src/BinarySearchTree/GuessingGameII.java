package BinarySearchTree;
import miscLib.*;
import java.util.Scanner;

public class GuessingGameII {
    public static void main(String[]arg){
        int start = 1;
        int end = 2000;
        int code;
        Scanner input =  new Scanner(System.in);
        int anwser;
        //Generate a random number
        //int anwser = (int)(Math.random() * (end - start +1) + start);
       while (true) {
           anwser = (int) (Math.random() * (end - start + 1) + start);
           System.out.println(" I guess your number is " + anwser + " , is that correct ?");
           code = SimpleInput.getInteger("Code( 0 for correct; -1 for lower; 1 for higher)");

           if (code == 0) {
               System.out.println("Yeah Win.");
               return;
           }
           else if (code == 1) {
               System.out.println("It seems my number is higher than yours', let me guess again.");
               end = anwser;
           }
           else if (code == -1) {
               System.out.println("It seems my number is lower than yours', let me guess again. ");
               start = anwser;
           }
           else {
               System.out.println("Invalid input, please input again!");
           }
       }
    }
}
