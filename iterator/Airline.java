import java.util.ArrayList;
/**
 * List of Available Flights
 * @author Bryson Sinclair
 */
public class Airline {
    
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Airline Constructor, gives title and flight data
     * @param title name of airline
     */
    public Airline(String title) {

        this.title = title;
        this.flights = FlightLoader.getFlights();

    }

    /**
     * returns airline title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creates iterator for flights matching the correct origin and destination codes
     * @param fromCode code of the original airport
     * @param toCode code of the destination airport
     * @return iterator of flights that match the given route, null if invalid codes are used
     */
    public FlightIterator createIterator(String fromCode, String toCode) {

        try {

            Airport from = Airport.valueOf(fromCode.trim().toUpperCase());
            Airport to = Airport.valueOf(toCode.trim().toUpperCase());
            return new FlightIterator(flights, from, to);

        } catch (IllegalArgumentException e) {

            System.out.println("\nMust enter valid airport codes\n");
            return null;
        }
    }
}

