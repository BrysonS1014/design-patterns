import java.util.ArrayList;
/**
 * Manages a list of Appartments and sorts 
 */
public class AppartmentList {
    private ArrayList<Appartment> appartments;
    private SortBehavior sortBehavior;

    /**
     * Constructor initializes the apartment list with a default sorting behavior.
     */
    public AppartmentList() {
        appartments = new ArrayList<>();
        sortBehavior = new BubbleSort(); // Default sorting behavior (highest to lowest)
    }

    /**
     * Adds a new appartment to the list
     * @param address Appartment address
     * @param numBedrooms Number of bedrooms
     * @param numBathrooms Number of bathrooms
     * @param price Price of the Appartment
     */
    public void add(String address, int numBedrooms, int numBathrooms, double price) {
        appartments.add(new Appartment(address, numBedrooms, numBathrooms, price));
    }

    /**
     * Sets the sort behavior to be used
     * @param sortBehavior Sort to be applied
     */
    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    /**
     * Returns a sorted list of Appartments based on the sorting strategy
     * @return Sorted List of Appartments
     */
    public ArrayList<Appartment> getSortedList() {
        ArrayList<Appartment> sortedList = new ArrayList<>(appartments);
        sortBehavior.sort(sortedList);
        return sortedList;
    }
}
