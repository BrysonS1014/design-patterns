import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort implements SortBehavior {
    @Override
    public void sort(ArrayList<Appartment> appartments) {
        int n = appartments.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (appartments.get(j).compareTo(appartments.get(j + 1)) > 0) {
                    Collections.swap(appartments, j, j + 1);
                }
            }
        }
    }
}
