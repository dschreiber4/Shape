package org.cvtc.shapes;

import javax.swing.*;

public class Cuboid extends Shape {

    //Fields
    private float width = 0.0F;
    private float height = 0.0F;
    private float depth = 0.0F;
    private float radius;


    //Constructor
    public Cuboid() {

    }
    //Overload Constructor
    public Cuboid(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    //Methods
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return (float) depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }



    //Overloads
    @Override
    public float surfaceArea() {
        float sA = 2 * (depth * width + depth * height + width * height);
        return sA;
    }

    @Override
    public float volume() {
        float vol = width * height * depth;
        return vol;

    }

    @Override
    void render() {

        String message = "Shape: Cuboid\n";
        message += "Dimensions: \n";
        message += "Width is " + width + ". \n";
        message += "Height is " + height + ". \n";
        message += "Depth is " + depth + ". \n";
        message += "Surface Area is " + surfaceArea() + ". \n";
        message += "Volume is " + volume() + ". \n";



        JOptionPane.showMessageDialog(null, message);



    }
}
