package edu.westga.comp2320.resources;

/**
 * The Borrowable interface defines the methods required for an object to be borrowable.
 *
 * @author COMP2320
 */
public interface Borrowable {
    /**
     * Marks this object as borrowed.
     */
    void borrow();

    /**
     * Returns the duration in minutes that this objects can be borrowed for.
     *
     * @return the duration in minutes
     */
    int getCheckoutDuration();

    /**
     * Marks this object as returned.
     */
    void returnItem();

    /**
     * Checks if this object is available for borrowing.
     *
     * @return true if available, false otherwise
     */
    boolean isAvailable();
}
