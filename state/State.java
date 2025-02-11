import java.util.ArrayList;
/**
 * Abstract class of State representing the common functionalities
 * @author Bryson
 */
public abstract class State {

    protected MusicBox box;
    private ArrayList<String> starLyrics;
    private ArrayList<String> happyLyrics;

    /**
     * Constructs state with the music box
     * @param box The MusicBox that is associated with this state
     * @param twinkleFileName file containing lyrics to the Twinkle songs
     * @param happyFileName file containing lyrics to the Happy songs
     */
    public State(MusicBox box, String twinkleFileName, String happyFileName) {
        
        this.box = box;
        this.starLyrics = FileReader.getLyrics(twinkleFileName);
        this.happyLyrics = FileReader.getLyrics(happyFileName);

    }

    /**
     * Plays Twinkle Song
     */
    public void pressStarButton() {
        System.out.println("Playing Twinkle, Twinkle Little Star");
        box.playSong("twinkle", starLyrics);

    }

    /**
     * Plays Happy Song
     */
    public void pressHappyButton() {
        System.out.println("Playing If Your're Happy and You Know It");
        box.playSong("happy", happyLyrics);

    }

    /**
     * Switches to different languages
     */
    public abstract void pressEnglishButton(); 
    public abstract void pressFrenchButton();
    public abstract void pressSpanishButton();

}
