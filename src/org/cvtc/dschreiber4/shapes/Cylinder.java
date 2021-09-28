package org.cvtc.dschreiber4.shapes;

import javax.swing.*;

public class Cylinder extends Shape implements Renderer {

    //Fields
    private float radius = 0.0F;
    private float height = 0.0F;
    private float sA;
    private float vol;

    //Constructor
    public Cylinder(Dialog messageBox, float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(float v, float radius) {
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
    void renderer() {
        render();

    }

    @Override
    public void render() {
        String message = "\nShape: Cylinder" +
        "\nRadius: " + radius +
        "\nHeight: " + height +
        "Surface Area is " + surfaceArea() + ". \n" +
        "Volume is " + volume() + ". \n";
        JOptionPane.showMessageDialog(null, message);
    }
}
