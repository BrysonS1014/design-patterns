import java.util.ArrayList;
/**
 * Polls for Student Government
 * Implements Subject interface to notify observers of updates
 */
public class StudentGovPoll implements Subject{
    
    private ArrayList<Observer> observers; //List of observers to notify
    private ArrayList<Candidate> candidates; //List of Candidates in the poll
    private String school; //Name of School conducting the poll

    /**
     * Constructs new Student Government for a specific school
     * @param school The name of the school
     */
    public StudentGovPoll(String school) {
        
        observers = new ArrayList<>();
        candidates = new ArrayList<>();
        this.school = school;
    }

    /**
     * Register observer for updates
     * @param observer Observer to register
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes observer from list of observers 
     * @param observer Observer to remove
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all observers with update list of candidates
     */
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(candidates);
        }
    }

    /**
     * Adds a new Candidate
     * @param firstName Candidate first name
     * @param lastName Candidate last name
     */
    public void addCandidate(String firstName, String lastName) {
        candidates.add(new Candidate(firstName, lastName));
    }

    /**
     * Enters votes for candidates based on rankings
     * @param firstPlace Index of first place vote
     * @param secondPlace Index of second place vote
     * @param thirdPlace Index of third place vote
     */
    public void enterVotes(int firstPlace, int secondPlace, int thirdPlace) {
        candidates.get(firstPlace - 1).addFirstPlace();
        candidates.get(secondPlace - 1).addSecondPlace();
        candidates.get(thirdPlace - 1).addThirdPlace();
        notifyObservers();
    }

    /**
     * Returns the given school name
     * @return school name
     */
    public String getSchool() {
        return school;
    }
    
}
