package com.labwork3;

/**
 * Subject interface
 */
public interface Subject {
    /**
     * Attach observer.
     * @param observer observer
     */
    void attach(Observer observer);

    /**
     * Detach observer.
     * @param observer observer
     */
    void detach(Observer observer);

    /**
     * Notify observers.
     */
    void notifyObservers();
}
