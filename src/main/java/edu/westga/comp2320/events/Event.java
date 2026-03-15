package edu.westga.comp2320.events;


/**
 * The Event abstract class represents a generic event in the resource center simulation.
 * Each event has a scheduled time and is associated with a ResourceManager.
 *
 * @author COMP2320
 */
public abstract class Event {
    private int time;

    /**
     * Creates a new Event with the specified time and ResourceManager.
     *
     * @param time            the scheduled time of the event
     */
    public Event(int time) {
        this.time = time;
    }

    /**
     * Processes the event and returns the next event that may result from processing this event.
     *
     * @return the next Event to be scheduled; null, if no further event is generated
     */
    public abstract Event processEvent();

    /**
     * Gets the scheduled time of the event.
     *
     * @return the time of the event
     */
    public int getTime() {
        return this.time;
    }
}
