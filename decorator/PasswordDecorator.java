/**
 * Abstract class to decorate the password
 */
public abstract class PasswordDecorator extends Password{

    protected Password passwordBeginning;

    /**
     * Creates the base password
     * @param passwordBeginning base Password
     */
    public PasswordDecorator(Password passwordBeginning) {

        this.passwordBeginning = passwordBeginning;

    }
    
    /**
     * Method to return the decorated password
     */
    @Override
    public abstract String getPassword();
}