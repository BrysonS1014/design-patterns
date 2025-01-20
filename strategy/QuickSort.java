import java.util.ArrayList;
import java.util.Collections;
/**
 * Implementation of QuickSort
 */
public class QuickSort implements SortBehavior {
    @Override
    public void sort(ArrayList<Appartment> appartments) {
        quickSort(appartments, 0, appartments.size() - 1);
    }
    /**
     * Recursively sorts the subarrays
     * @param appartments List of apparments
     * @param low Starting index
     * @param high Ending index
     */
    private void quickSort(ArrayList<Appartment> appartments, int low, int high) {
        if (low < high) {
            int pi = partition(appartments, low, high);
            quickSort(appartments, low, pi - 1);
            quickSort(appartments, pi + 1, high);
        }
    }
    /**
     * Partitions the array for QuickSort
     * @param appartments List of appartments
     * @param low Starting Index
     * @param high Ending Index
     * @return Partition Index
     */
    private int partition(ArrayList<Appartment> appartments, int low, int high) {
        Appartment pivot = appartments.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (appartments.get(j).compareTo(pivot) > 0) {
                i++;
                Collections.swap(appartments, i, j);
            }
        }
        Collections.swap(appartments, i + 1, high);
        return i + 1;
    }
}
