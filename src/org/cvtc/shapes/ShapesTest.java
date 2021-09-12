package org.cvtc.shapes;

import javax.swing.*;


public class ShapesTest{

    public static void main(String[] args) {


        Cuboid cuboid = new Cuboid(1,1,1);
        Cylinder cylinder = new Cylinder(1,1);
        Sphere sphere = new Sphere(1);



        JOptionPane.showMessageDialog(null, cuboid.toString());
        JOptionPane.showMessageDialog(null, cylinder.toString());
        JOptionPane.showMessageDialog(null, sphere.toString());




    }
}
