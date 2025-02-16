import java.util.ArrayList;
import java.util.Iterator;
/**
 * Math Game class for a series of math questions
 * @author Bryson Sinclair
 */
public class MathGame {

    public static final int NUM_QUESTIONS = 5;
    private static MathGame mathGame;
    private ArrayList<Question> questions;

    /**
     * Constructor, initializes the game and generates the questions
     */
    public MathGame() {

        questions = new ArrayList<>();
        generateQuestions();
        
    }

    /**
     * Provides access to the singleton instance of the MathGame class
     * @return The singleton instance of the MathGame
     */
    public static MathGame getInstance() {

        if(mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    /**
     * Returns an iterator over the questions 
     * @return
     */
    public Iterator<Question> getIterator() {

        return questions.iterator();
    }

    /**
     * Generates 5 questions
     */
    private void generateQuestions() {
        for (int i = 0; i < NUM_QUESTIONS; i++) {
            Question question = new Question();
            questions.add(question);
        }
    }


}
