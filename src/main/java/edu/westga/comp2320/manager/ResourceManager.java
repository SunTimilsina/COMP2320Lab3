package edu.westga.comp2320.manager;

import edu.westga.comp2320.resources.Laptop;
import edu.westga.comp2320.resources.Resource;
import edu.westga.comp2320.resources.Tablet;
import edu.westga.comp2320.resources.StudyRoom;

import java.util.ArrayList;

import static edu.westga.comp2320.SimulationParameters.*;

/**
 * The ResourceManager class manages the inventory of resources in the resource center.
 * It allows for generating inventories of different resource types and retrieving available resources.
 * The different types of resources are laptops, tablets, and study rooms.
 * The number of each resource type is defined in the SimulationParameters class.
 *
 * @author COMP2320
 */
public class ResourceManager {
    private ArrayList<Resource> inventory;

    /**
     * Constructs a ResourceManager and generates the initial inventory of resources.
     */
    public ResourceManager() {
        this.inventory = new ArrayList<Resource>();
        this.generateInventory();
    }

    private void generateInventory() {
        for (int i = 0; i < NUMBER_OF_LAPTOPS; i++) {
            this.inventory.add(new Laptop());
        }
        for (int i = 0; i < NUMBER_OF_TABLETS; i++) {
            this.inventory.add(new Tablet());
        }
        for (int i = 0; i < NUMBER_OF_STUDY_ROOMS; i++) {
            this.inventory.add(new StudyRoom());
        }
    }

    /**
     * Retrieves an available resource of the specified type from
     * the inventory.
     *
     * @param resourceType the type of resource to retrieve
     *                     ("Laptop", "Tablet", "StudyRoom")
     * @return an available Resource of the specified type, or null
     *          if no such resource is available
     */
    public Resource getResourceByType(String resourceType) {
        for (Resource resource : this.inventory) {
            if (resource.getType().equals(resourceType) && resource.isAvailable()) {
                return resource;
            }
        }
        return null;
    }
}
