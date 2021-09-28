package org.cvtc.dschreiber4.shapes;

import javax.swing.*;
import java.util.Scanner;

public class ShapesTest{

    public static void main(String[] args) {

        // import scanner
        Scanner keyboard = new Scanner(System.in);

        // ask user for input and store width in w
        System.out.println("Please enter Width: ");
        float w = positiveValidation((int) keyboard.nextFloat());

        // ask user for input and store height in h
        System.out.println("Please enter Height: ");
        float h = positiveValidation((int) keyboard.nextFloat());

        // ask user for input and store depth in d
        System.out.println("Please enter Depth: ");
        float d = positiveValidation((int) keyboard.nextFloat());

        // ask user for input and store radius in r
        System.out.println("Please enter Radius: ");
        float r = positiveValidation((int) keyboard.nextFloat());



        Cuboid cuboid = new Cuboid(w,h,d);
        Cylinder cylinder = new Cylinder(r,h);
        Sphere sphere = new Sphere(r);



        JOptionPane.showMessageDialog(null, cuboid.toString());
        JOptionPane.showMessageDialog(null, cylinder.toString());
        JOptionPane.showMessageDialog(null, sphere.toString());




    }

    // validation function
    private static int positiveValidation(int checkedInteger) {

        // import scanner
        Scanner keyboard = new Scanner(System.in);
        int validInteger = 0;

        if (checkedInteger > 0) {

            return checkedInteger;

        } else {

            while (checkedInteger <= 0) {

                System.out.println("Please enter a positive number");

                validInteger = keyboard.nextInt();

                checkedInteger = validInteger;
            } //-- end while

            return validInteger;
        } //-- end if

    } //-- end positiveValidation
}
