/**
 * Replace all instances of the letters with the corresponding symbol:
    a => @

    b => 8

    e => 3

    g => 9

    i => !

    o => 0

    s => $

    t => 7
 */
public class Symbols extends PasswordDecorator{
    
    /**
     * 
     * @param passwordBeginning Base password to be decorated
     */
    public Symbols(Password passwordBeginning) {
        
        super(passwordBeginning);

    }
    
    /**
     * Returns the password with new symbols
     * @return modified password
     */
    @Override
    public String getPassword() {
        
        String basePassword = passwordBeginning.getPassword();
        String replacePass = basePassword.replace('a','@').replace('b','8') 
        .replace('e','3')
        .replace('g','9')
        .replace('i','!')
        .replace('o','0')
        .replace('s','$')
        .replace('t','7');

        return replacePass;
    }

}
