import java.util.*;
/**
 * Iterates through Flights based on Origin and Destination
 * @author Bryson Sinclair
 */
public class FlightIterator implements Iterator<Flight>{

    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;


    /**
     * Constructs FlightIterator for filtering flights
     * @param flights list of flights
     * @param from origin airport
     * @param to destination airport
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {

        this.flights = flights;
        this.position = 0;
        this.from = from;
        this.to = to;

    }

    /**
     * Checks if there is another flight in the list that matches the given route
     * @return True if matching, false otherwise
     */
    @Override
    public boolean hasNext() {

        while (position < flights.size()) {
            Flight currentFlight = flights.get(position);
            if (currentFlight.getFrom() == from && currentFlight.getTo() == to) {
                return true;
            }
            position++;
        }
        return false;

    }

    /**
     * Returns the next flight that matches the given route
     * @return the next matching flight
     * @throws NoSuchElementException if there are no matching flights
     */
    @Override
    public Flight next() {
        
        if (!hasNext()) {
            throw new NoSuchElementException("No more matching flights");
        }
        return flights.get(position++);

    }

}