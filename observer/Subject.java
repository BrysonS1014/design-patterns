/**
 * Subject Interface
 */
public interface Subject {

    /**
     * Registers,Removes, and Notifys Observers
     * @param observer Derives from the Observer interface
     */
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
