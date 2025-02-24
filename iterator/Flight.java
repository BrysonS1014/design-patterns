import java.time.*;
/**
 * Flight class that represents a flight with details
 * @author Bryson Sinclair
 */
public class Flight {
    
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Constructs a Flight 
     * @param flightNum Flight Number
     * @param from Origin Airport
     * @param to Destination Airport
     * @param startTime Departure Time
     * @param endTime Arrival Time 
     * @param numTransfers Number of transfers during the flight 
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;

    }

    /**
     * Returns origin airport
     * @return origin airport
     */
    public Airport getFrom() {

        return from;

    }

    /**
     * Returns destination airport
     * @return destination airport
     */
    public Airport getTo() {

        return to;

    }

    /**
     * Checks if flights matches the given original and destination airports
     * @param from original airport
     * @param to destination airport
     * @return Checks if flights match
     */
    public boolean sameLoc(Airport from, Airport to) {

        return this.from.equals(from) && this.to.equals(to);

    }

    /**
     * Outputs the number of transfers
     * @return Direct Flight if 0, 1 Stopover if 1, and x Transfers if x > 1
     */
    private String numTransfersInfo() {
        return switch (numTransfers) {
            case 0 -> "Direct Flight";
            case 1 -> "1 Stopover";
            default -> numTransfers + " Transfers";
        };

    }

    /**
     * Gives the total duration of the flight
     * @return total duration
     */
    private String getDuration() {

        Duration duration = Duration.between(startTime, endTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        return String.format("%dh %dm", hours, minutes);

    }

    /**
     * Returns formatted String of Flight Details
     */
    @Override
    public String toString() {

        return from + " to " + to + " " + startTime + " - " + endTime + 
        " (" + getDuration() + ") " + numTransfersInfo();
    }
    

}
