package edu.westga.comp2320.events;

import edu.westga.comp2320.manager.ResourceManager;
import edu.westga.comp2320.resources.Resource;

import java.util.Random;

import static edu.westga.comp2320.SimulationParameters.*;

/**
 * A checkout event represents the checkout of a resource at a specific time.
 * It may generate a ReturnEvent depending on availability.
 *
 * @author COMP2320
 */
public class CheckoutEvent extends Event {
    private ResourceManager resourceManager;
    private Random rand;

    /**
     * Creates a new CheckoutEvent at the specified time with access
     * to the ResourceManager.
     *
     * @param time The time the event occurs
     * @param resourceManager The ResourceManager from which a
     *                        resource is checked out
     */
    public CheckoutEvent(int time, ResourceManager resourceManager) {
        super(time);
        this.resourceManager = resourceManager;
        this.rand = new Random();
    }

    @Override
    public Event processEvent() {
        String resourceType = this.selectResourceType();
        Resource resource = this.resourceManager.getResourceByType(resourceType);
        if (resource == null) {
            System.out.println("*** resource not available at time " + this.getTime());
            return null;
        }

        System.out.println("Checkout of " + resource + " at time " + this.getTime());
        resource.borrow();

        int maxDuration = resource.getCheckoutDuration();
        int durationRange = maxDuration - MIN_CHECKOUT_DURATION + 1;
        int checkoutDuration = MIN_CHECKOUT_DURATION + this.rand.nextInt(durationRange);
        int returnTime = this.getTime() + checkoutDuration;
        return new ReturnEvent(returnTime, resource);
    }

    private String selectResourceType() {
        int roll = this.rand.nextInt(100);
        if (roll < PROBABILITY_OF_LAPTOP) {
            return "Laptop";
        } else if (roll < PROBABILITY_OF_LAPTOP + PROBABILITY_OF_TABLET) {
            return "Tablet";
        } else {
            return "StudyRoom";
        }
    }
}
