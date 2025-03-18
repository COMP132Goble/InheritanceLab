package shapes;

/**
 * Provides a sleep method that can be used for inserting delays.
 * 
 * @author Grant Braught, edited by William Goble
 * @author Dickinson College
 * @version Aug 18, 2009
 */
public class AnimationTimer {
    /**
     * Cause the program to pause for the specified number of 
     * milliseconds before continuing with the next statement.
     * @param milli
     */
    public static void sleep(int milli) {
        try {
            Thread.sleep(milli);
        } catch(InterruptedException e) {
            // nothing to do, just continue
        }
    }
}
