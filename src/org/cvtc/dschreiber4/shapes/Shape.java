package org.cvtc.dschreiber4.shapes;

public abstract class Shape {

    public Dialog messageBox;

    public Shape() {

    }

    //Getter and  Setter for messagebox
    public Dialog getMessageBox() {
        return messageBox;
    }
    public void setMessageBox(Dialog messageBox) {
        this.messageBox = messageBox;
    }

    //Methods
    abstract float surfaceArea();
    abstract float volume();
    abstract void renderer();

    //Default Constructor
    public Shape(Dialog messageBox) {
        this.messageBox = messageBox;
    }

}
