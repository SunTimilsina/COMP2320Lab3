package edu.westga.comp2320;

/**
 * The SimulationParameters class defines the constants used in the resource center simulation.
 * These parameters include the duration of the simulation and the number of each type of resource.
 *
 * @author COMP2320
 */
public class SimulationParameters {
    /**
     * The duration of the simulation in minutes.
     */
    public static final int SIMULATION_DURATION = 720;

    /**
     * The number of laptops in the resource center.
     */
    public static final int NUMBER_OF_LAPTOPS = 10;

    /**
     * The number of tablets in the resource center.
     */
    public static final int NUMBER_OF_TABLETS = 5;

    /**
     * The number of study rooms in the resource center.
     */
    public static final int NUMBER_OF_STUDY_ROOMS = 2;

    /**
     * The maximum checkout duration for laptops in minutes.
     */
    public static final int LAPTOP_CHECKOUT_DURATION = 180;

    /**
     * The maximum checkout duration for tablets in minutes.
     */
    public static final int TABLET_CHECKOUT_DURATION = 60;

    /**
     * The maximum checkout duration for study rooms in minutes.
     */
    public static final int STUDY_ROOM_CHECKOUT_DURATION = 120;

    /**
     * The minimum duration in minutes any resource is checked out by a patron.
     */
    public static final int MIN_CHECKOUT_DURATION = 20;

    /**
     * The minimum interval in minutes between checkout events.
     */
    public static final int MIN_CHECKOUT_INTERVAL = 3;

    /**
     * The maximum interval in minutes between checkout events.
     */
    public static final int MAX_CHECKOUT_INTERVAL = 15;

    /**
     * The probability as a percentage that a checkout event is for a laptop.
     */
    public static final int PROBABILITY_OF_LAPTOP = 50;

    /**
     * The probability as a percentage that a checkout event is for a tablet.
     */
    public static final int PROBABILITY_OF_TABLET = 25;
}
