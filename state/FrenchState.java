/**
 * French State to play the French lyrics of Twinkle and Happy
 */
public class FrenchState extends State {
    private static final String TWINKLE_FILE_NAME = "twinkle-french.txt";
    private static final String HAPPY_FILE_NAME = "happy-french.txt";

    /**
     * Constructs French State with MusicBox
     * @param box State of MusicBox
     */
    public FrenchState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    /**
     * Switches to English State
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("Switching to English State");
        box.setState(box.getEnglishState());
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
     * Scenario if French button is presssed
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Already in French State");
    }

}
