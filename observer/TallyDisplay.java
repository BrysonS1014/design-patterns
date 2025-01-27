import java.util.ArrayList;
/**
 * Displays total number of weighted votes as an integer
 * Implements the Observer interface to receive updates from the poll
 */
public class TallyDisplay implements Observer{

    private Subject poll; //Subject that sends updates
    private ArrayList<Candidate> candidates; //List of Candidates
    
    /**
     * Constructs a TallyDisplay that observes the given poll
     * @param poll The subject (poll) to observe
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }
    
    /**
     *Updates the list of current candidates and displays current tallies
     *@param candidates Updated list of candidates
     */
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }
    
    /**
     * Displays the current tallies of first, second, and third place votes for each candidate.
     */
    public void display() {
        System.out.println("\nCurrent Tallies:");
        for (Candidate candidate : candidates) {
            System.out.printf("%s: First(%d), Second(%d), Third(%d)\n",
                    candidate.getFullName(),
                    candidate.getNumFirstPlaceVotes(),
                    candidate.getNumSecondPlaceVotes(),
                    candidate.getNumThirdPlaceVotes());
        }
    }
}
