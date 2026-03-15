package edu.westga.comp2320.resources;

import static edu.westga.comp2320.SimulationParameters.STUDY_ROOM_CHECKOUT_DURATION;

/**
 * The StudyRoom class represents a study room resource in the resource center simulation.
 * Each study room has a unique code and a defined checkout duration.
 *
 * @author COMP2320
 */
public class StudyRoom extends Resource {
    private static final String TYPE = "StudyRoom";
    private static int roomCount = 0;
    private String code;

    /**
     * Creates a new StudyRoom with a unique code.
     */
    public StudyRoom() {
        super();
        roomCount++;
        this.code = TYPE + "-" + roomCount;
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
     * The checkout duration for a study room is fixed and defined in the simulation parameters.
     * @return the fixed checkout duration for a study room as defined in the simulation parameters
     */
    @Override
    public int getCheckoutDuration() {
        return STUDY_ROOM_CHECKOUT_DURATION;
    }
}
