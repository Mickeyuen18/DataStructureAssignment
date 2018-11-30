package BinarySearchTree;
import miscLib.*;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[]arg) {
        int LowerLimited = 1;
        int UpperLimited = 2000;
        int MyNumber = 0;
        Scanner input = new Scanner(System.in);
    //Generate a random number between 1 to 2000
    int anwser = (int)(Math.random()* (UpperLimited - LowerLimited +1) + LowerLimited);
    while(true) {
        System.out.println("Correct Number: " + anwser);
        System.out.println("Please guess a number between " + LowerLimited + " and " + UpperLimited + " :");
        MyNumber = input.nextInt(); //User Number
        if (MyNumber == anwser) {
            System.out.println("Yeah Win !");
            return;
        }
        else if (MyNumber > anwser && MyNumber < UpperLimited) {
            System.out.println("My number is too high, let me guess again ! ");
            UpperLimited = MyNumber;
        }
        else if (MyNumber < anwser && MyNumber > LowerLimited) {
            System.out.println("My number is too low, let me guess again ! ");
            LowerLimited = MyNumber;
        }
        else {
            System.out.println("Invalid Input. Please input again !");
        }
    }
    }
}
