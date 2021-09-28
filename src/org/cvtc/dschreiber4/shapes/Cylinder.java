package org.cvtc.dschreiber4.shapes;

import javax.swing.*;

public class Cylinder extends Shape{

    //Fields
    private float radius = 0.0F;
    private float height = 0.0F;
    private float sA;
    private float vol;


    //Constructor
    public Cylinder() {

    }
    //Overload Constructor
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    //Methods
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //Overloads
    @Override
    public float surfaceArea() {

        sA = (float) (2 * Math.PI * radius * (radius + height));
        return (float) sA;
    }

    @Override
    public float volume() {

        vol = (float) (Math.PI * radius * radius * height);
        return vol;
    }

    @Override
    void render() {


        String message = "\nShape: Cylinder";
        message += "\nRadius: " + radius;
        message += "\nHeight: " + height;

        JOptionPane.showMessageDialog(null, message);

    }
}
