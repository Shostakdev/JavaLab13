package com.labwork3;

import java.util.*;

/**
 * GraphicElement class
 */
public class GraphicElement implements Subject {
    /**
     * List of observers
     */
    private List<Observer> observers;
    /**
     * Color of the graphic element
     */
    private String color;

    /**
     * Constructor
     */
    public GraphicElement() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    /**
     * Set color of the graphic element
     * @param color color to set
     */
    public void setColor(String color) {
        this.color = color;
        notifyObservers();
    }

    /**
     * Get color of the graphic element
     * @return color of the graphic element
     */
    public String getColor() {
        return color;
    }
}
