package org.cvtc.dschreiber4.shapes;

import javax.swing.*;

public class Sphere extends Shape implements Renderer{

    //Fields
    private float radius = 0.0F;
    private double PI=3.14285714286;

    // Constructor
    public  Sphere(Dialog messageBox, float radius) {
        this.radius = radius;
    }

    public Sphere(float v) {
    }

    //Methods
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float surfaceArea() {

        float sA = (float) (4 * PI * (float)Math.pow(radius, 2));
        return sA;
    }

    @Override
    public float volume() {

        float vol= (float) ((4.0/3.0)*PI*(radius*radius*radius));
        return vol;
    }

    @Override
    public void renderer() {
       render();
    }

    @Override
    public void render() {
        String message = "Shape: Sphere\n" +
            "Dimensions: \n" +
            "Radius is " + radius + ". \n" +
            "Surface Area is " + surfaceArea() + ". \n" +
            "Volume is " + volume() + ". \n";
            JOptionPane.showMessageDialog(null, message);
    }
}
