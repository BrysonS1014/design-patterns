/**
 * Spanish State that plays the Spanish lyrics of Twinkle and Happy
 */
public class SpanishState extends State {
    private static final String TWINKLE_FILE_NAME = "twinkle-spanish.txt";
    private static final String HAPPY_FILE_NAME = "happy-spanish.txt";

    /**
     * Constructs Spanish State with Music Box
     * @param box State of MusicBox
     */
    public SpanishState(MusicBox box) {
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
     * Scenario if the Spanish Button is pressed
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Already in Spanish State");
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
