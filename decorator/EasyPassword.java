import java.util.Random;
/**
 * Class to make an Easy Password: replace spaces with -, and adds a random number from 0 to 100
 */
public class EasyPassword extends Password{
    
    /**
     * Returns a phrase and converts it using rules given for EasyPassword
     * @param phrase returns phrase that the user gives and converts it into a password
     */
    public EasyPassword(String phrase) {

        Random rand = new Random(); 

        int randInt = rand.nextInt(101);

        this.password = phrase;

        password = phrase.replace(' ','-') + randInt;

    }

    /**
     * Returns the generated password
     */
    public String getPassword() {

        return password;
        
    }

}
