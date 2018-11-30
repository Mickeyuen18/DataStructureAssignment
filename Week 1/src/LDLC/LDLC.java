package LDLC;
import miscLib.*;

public class LDLC {

    public static void main(String[] args) {
        double TC; //Totla Cholesterol
        double HDLC; // HDL Cholesterol
        double TG; // Triglyceride
        double LDLC; // Result
        TC = SimpleInput.getDouble("Please input the Total Cholesterol (TC)");
        HDLC = SimpleInput.getDouble("Please input the HDL Cholesterol (HDLC)");
        TG = SimpleInput.getDouble("Please input the Triglyceride (TG)");
        LDLC = TC - HDLC - TG / 5; // Caculation Fomula
        System.out.println("The LDLC is " + LDLC); // Print out
    }
}
