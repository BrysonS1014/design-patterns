/**
 * Making the password a Pallendrome
 */
public class Pallendrome extends PasswordDecorator{
    
    /**
     * 
     * @param passwordBeginning Base password to be decorated
     */
    public Pallendrome(Password passwordBeginning) {

        super(passwordBeginning);

    }

    /**
     * Returns the pallendrome version of the password
     * @return the modified password
     */
    public String getPassword() {

        String basePassword = passwordBeginning.getPassword();
        return basePassword + new StringBuilder(basePassword).reverse().toString();

    }
    
}
