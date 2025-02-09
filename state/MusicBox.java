import java.util.ArrayList;

/**
 * Music Box that can switch songs and languages
 */
public class MusicBox {

    
    private State englishState;
    private State frenchState;    
    private State spanishState;    
    private State state;    

    /**
     * Constructor for the MusicBox. Default state is English
     */
    public MusicBox() {

        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState; //Default
        
    }
    /**
     * Switches to the Twinkle Twinkle song
     */
    public void pressStarButton() {
        state.pressStarButton();
    }
    
    /**
     * Switches to the Happy Song
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * Switches to English State
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * Switches to French State
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * Switches to Spanish State
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * Sets the state of the music box
     * @param state returns new state 
     */
    public void setState(State state) {
        
        this.state = state;

    }

    /**
     * 
     * @return english state
     */
    public State getEnglishState() {
        return englishState;

    }

    /**
     * 
     * @return french state
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * 
     * @return spanish state
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * Plays the song to the console
     * @param songName name of song
     * @param lyrics lyrics of the song
     */
    public void playSong(String songName, ArrayList<String> lyrics) {

        for(String lyric : lyrics) {
            System.out.println(lyric);
        }

    }

}
