package SelfLearn;


import javax.swing.*;
import java.util.Scanner;

public class MathPractice {
    public static void main(String[] args) {

        double x = Double.parseDouble(JOptionPane.showInputDialog("Enter side x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter side y: "));
        double z = Math.sqrt((x*x) + (y*y));
        JOptionPane.showMessageDialog(null,"The hypotenuse is: "+z);

    }
}
