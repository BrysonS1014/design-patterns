import java.util.Random;
/**
 * For each letter, 30% of the time add a random special character directly after it. Special Chars are:
 *               , !, %, +, . {, }
 */
public class SpecialChars extends PasswordDecorator{
    private static final char[] SPECIAL_CHARS = {'*','!','%','+','.','{','}'};
    /**
     *
     * @param passwordBeginning Base password to be decorated
     */
    public SpecialChars(Password passwordBeginning) {
        
        super(passwordBeginning);
        
    }

    /**
     * Returns the new password with random special characters
     * @return modified password
     */
    @Override
    public String getPassword() {
        Random rand = new Random();
        StringBuilder result = new StringBuilder();

        for(char ch : passwordBeginning.getPassword().toCharArray()) {
            result.append(ch);

            if(Character.isLetter(ch) && rand.nextDouble() < 0.30) {
                result.append(SPECIAL_CHARS[rand.nextInt(SPECIAL_CHARS.length)]);
            }
        }

        return result.toString();

    }
}
