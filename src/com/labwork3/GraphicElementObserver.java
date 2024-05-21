package com.labwork3;

/**
 * GraphicElementObserver class.
 */
public class GraphicElementObserver implements Observer {
    /**
     * Subject.
     */
    private GraphicElement subject;

    /**
     * Constructor.
     * @param subject subject
     */
    public GraphicElementObserver(GraphicElement subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Color has been updated to: " + subject.getColor());
    }
}
