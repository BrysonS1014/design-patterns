/**
 * Making a Candidate
 * Tracks Candidate's Names, Votes, and Weighted Votes
 */
public class Candidate {

   
    public int totalNumVotes; //Total number of votes
    private String firstName; //Candidate's first name
    private String lastName;  //Candidate's last name
    private int numFirstPlaceVotes; //number of first place votes
    private int numSecondPlaceVotes; //number of second place votes
    private int numThirdPlaceVotes; //number of third place votes

    /**
     * 
     * @param firstName Candidates first name
     * @param lastName Candidates last name
     */
    public Candidate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalNumVotes = 0;
        this.numFirstPlaceVotes = 0;
        this.numSecondPlaceVotes = 0;
        this.numThirdPlaceVotes = 0;
    }
    
    /**
     * Checks the Candidate's name matches
     */
    public boolean equals(String firstName, String lastName) {
        return this.firstName.equals(firstName) && this.lastName.equals(lastName);

    }


    /**
     * Adds a vote to the total number of votes
     */
    public void addVote() {
        totalNumVotes++;
    }


    /**
     * Adds one first place vote and increments the total number of votes
     */
    public void addFirstPlace() {
        numFirstPlaceVotes++;
        addVote();
    }


    /**
     * Adds one second place vote and increments the total number of votes
     */
    public void addSecondPlace() {
        numSecondPlaceVotes++;
        addVote();
    }


    /**
     * Adds one third place vote and increments the total number of votes
     */
    public void addThirdPlace() {
        numThirdPlaceVotes++;
        addVote();
    }
    

    /**
     * Calculates the weighted votes based on vote ranking.
     * First-place votes are worth 3 points, second-place votes are worth 2 points, and third-place votes are worth 1 point.
     * @return Total number of weighted votes for a candidate
     */
    public double getWeightedVotes() {
        return (3 * numFirstPlaceVotes) + (2 * numSecondPlaceVotes) + numThirdPlaceVotes;
    }

    /**
     * Returns full name of the candidate
     * 
     * @return Candidate's full name
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Returns total number of first place votes
     * @return total number of first place votes
     */
    public int getNumFirstPlaceVotes() {
        return numFirstPlaceVotes;
    }

    /**
     * Returns total number of second place votes
     * @return total number of second place votes
     */
    public int getNumSecondPlaceVotes() {
        return numSecondPlaceVotes;
    }
    
    /**
     * Returns total number of third place votes
     * @return total number of third place votes
     */
    public int getNumThirdPlaceVotes() {
        return numThirdPlaceVotes;
    }
}
