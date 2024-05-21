package com.labwork3;

/**
 * Main
 */
public class Main {
    /**
     * Main method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        GraphicElement graphicElement = new GraphicElement();
        GraphicElementObserver observer1 = new GraphicElementObserver(graphicElement);
        GraphicElementObserver observer2 = new GraphicElementObserver(graphicElement);

        graphicElement.setColor("Red");
        graphicElement.setColor("Blue");
    }
}