import java.util.ArrayList;

/**
 * Interface for sorting the appartments
 */
public interface SortBehavior {
    /**
     * Sorts given list of appartment
     * @param appartments List of appartments to be sorted
     */
    void sort(ArrayList<Appartment> appartments);
    
}
