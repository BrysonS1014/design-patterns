import java.util.ArrayList;
/**
 * The Observer Interface
 */
public interface Observer {
    /**
     * The observer interface keeps track of all candidates and updates when a new changes occurs
     * @param candidates The given candidates
     */
    void update(ArrayList<Candidate> candidates);
 
}
