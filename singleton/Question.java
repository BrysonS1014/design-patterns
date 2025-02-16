import java.util.Random;
/**
 * Class for a random Quesiton
 * @author Bryson Sinclair
 */
public class Question {

    private static final String ANSI_GREEN = "\u001B[32m"; //Correct Answer Color
    private static final String ANSI_RED = "\u001B[31m"; //Wrong Answer Color
    private static final String ANSI_BLACK = "\u001B[30m"; //Reset Color
    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;

    /**
     * Constructor Class, makes the numbers and operand random
     */
    public Question() {
        Random rand = new Random();
        this.num1 = rand.nextInt(100);
        this.num2 = rand.nextInt(100);
        Operand[] operands = Operand.values();
        this.operand = operands[rand.nextInt(operands.length)];
        calculateAnswer();
    }

    /**
     * Question Format as a String
     * @return random int 1 + random operand + random int 2
     */
    public String getQuestion() {

        return num1 + " " + operand.label + " " + num2 + " = ";
    }

    /**
     * Sets the user's answer
     * @param answer user answer
     */
    public void setUserAnswer(int answer) {
        this.userAnswer = answer;
    }

    /**
     * Check if user answer is correct
     * @return
     */
    public boolean isCorrect() {
        return userAnswer == answer;
    }

    /**
     * String representation of the question and the feedback on user's answer
     * 1. Green if the user's answer is correct
     * 2. Red if the user's answer is wrong. Shows the correct answer along with what the user answered
     * At the end, both reset to black as to not overlap wrong and correct answer colors on other questions
     * @return String displaying the question and feedback
     */
    @Override
    public String toString() {
        if (isCorrect()) {
            return ANSI_GREEN + getQuestion() + userAnswer + ANSI_BLACK;
        } else {
            return ANSI_RED + getQuestion() + answer +"   You answered " + userAnswer + ANSI_BLACK;
        }
    }

    /**
     * Calculator
     */
    private void calculateAnswer() {
        switch (operand) {
            case PLUS -> answer = num1 + num2;
            case MINUS -> answer = num1 - num2;
            case MULTIPLY -> answer = num1 * num2;
        }
    }
}
