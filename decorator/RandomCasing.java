import java.util.Random;
/**
 * For every letter 50% of the time make it lower case and 50% of the time make it upper case
 */
public class RandomCasing extends PasswordDecorator{

    /**
     * 
     * @param passwordBeginning base password
     */
    public RandomCasing(Password passwordBeginning) {
        
        super(passwordBeginning);

    }
    /**
     * Password with random casings
     * @return modified password
     */
    @Override
    public String getPassword() {
        Random rand = new Random();
        StringBuilder result = new StringBuilder();

        for (char ch : passwordBeginning.getPassword().toCharArray()) {
            if (Character.isLetter(ch)) {
                result.append(rand.nextBoolean() ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
            }
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}