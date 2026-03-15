package edu.westga.comp2320.resources;

import static edu.westga.comp2320.SimulationParameters.TABLET_CHECKOUT_DURATION;

/**
 * The Tablet class represents a tablet resource in the resource center simulation.
 * Each tablet has a unique code and a defined checkout duration.
 *
 * @author COMP2320
 */

public class Tablet extends Resource {
    private static final String TYPE = "Tablet";
    private static int tableCount = 0;
    private String code;

    /**
     * Constructs a new Tablet with a unique code.
     */
    public Tablet() {
        super();
        tableCount++;
        this.code = TYPE + "-" + tableCount;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    /**
     * The checkout duration for a tablet is fixed and defined in the simulation parameters.
     * @return the fixed checkout duration for a tablet as defined in the simulation parameters
     */
    @Override
    public int getCheckoutDuration() {
        return TABLET_CHECKOUT_DURATION;
    }
}
