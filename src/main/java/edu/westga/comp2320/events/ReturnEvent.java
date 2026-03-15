package edu.westga.comp2320.events;

import edu.westga.comp2320.resources.Resource;

/**
 * A ReturnEvent represents the return of a resource at a specific time.
 * It does not generate any new events.
 * @author COMP2320
 */
public class ReturnEvent extends Event {
    private Resource resource;

    /**
     * Creates a new ReturnEvent with the specified time and resource
     * to be returned.
     *
     * @param time the scheduled time of the event
     * @param resource the resource to be returned
     */
    public ReturnEvent(int time, Resource resource) {
        super(time);
        this.resource = resource;
    }

    /**
     * Processes the return event by returning the resource and printing a message.
     *
     * @return null since no new event is generated from processing a return event
     */
    @Override
    public Event processEvent() {
        this.resource.returnItem();
        System.out.println("Return of " + this.resource + " at time " + this.getTime());
        return null;
    }
}
