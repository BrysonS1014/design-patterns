import java.util.ArrayList;
/**
 * Displays the total number of weighted votes in percentage form
 * Implements the Observer interface to receive updates from the polls
 */

public class PercentageDisplay implements Observer{
    
    private Subject poll; //Subject that sends updates
    private ArrayList<Candidate> candidates; //List of candidates

    /**
     * Constructs a PercentageDisplay that observes the given poll
     * @param poll The subject (poll) to observe
     */
    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);

    }
    
    
    /**
     * Updates the list of candidates and displays the current percentage
     * @param candidates Updated list of candidates
     */
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }
    
    /**
     * Displays the current percentage of total weighted votes each candidate has received.
     */
    public void display() {
        double totalWeightedVotes = candidates.stream().mapToDouble(Candidate::getWeightedVotes).sum();
        System.out.println("\nCurrent Percent of Votes:");
        for (Candidate candidate : candidates) {
            double percentage = (candidate.getWeightedVotes() / totalWeightedVotes) * 100;
            System.out.printf("%s %.2f%%\n", candidate.getFullName(), percentage);
        }
    }
}
