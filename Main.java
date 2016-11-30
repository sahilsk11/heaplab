
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Main method,
     */
    public static void main(String[] args)
    {
        int[] hea = new int[12];
        for(int x = 1; x <= 12; x++)
        {
            hea[x] = (int)Math.random()*100;
        }
        HeapDisplay hD = new HeapDisplay();
        hD.displayHeap((Comparable)hetea, 12);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
