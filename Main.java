/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    /**
     * Main method
     */
    public static void main(String[] args)
    {
        Comparable[] array = new Integer[12];
        for(int x = 0; x < 12; x++)
        {
            array[x] = ((int)(Math.random()*100)) + 1;
        }
        HeapDisplay hd = new HeapDisplay();
        hd.displayHeap(array, 11);
        array = HeapUtils.insert(array, new Integer(5), 11);
        hd.displayHeap(array, 12);
    }
}