
/**
 * English State to play the English Lyrics of Twinkle and Happy
 * @author Bryson
 */
public class EnglishState extends State {
    private static final String TWINKLE_FILE_NAME = "twinkle-english.txt";
    private static final String HAPPY_FILE_NAME = "happy-english.txt";

    /**
     * Constructs English State with the MusicBox
     * @param box State of the music box
     */
    public EnglishState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    /**
     * Scenario if the English State is pressed
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("Already in English State");
    }

    /**
     * Switches to Spanish State
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish State");
        box.setState(box.getSpanishState());
    }

    /**
     * Switches to French State
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French State");
        box.setState(box.getFrenchState());
    }

}
