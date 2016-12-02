/**
 *
 */
public class HeapUtils
{
    /**
     * Heapify is a recursive method that takes an array and brings the largest values to the top.
     * To do this, it starts at the left-most non-leaf node. It then looks at the left and right child.
     * If any of the children are bigger, it takes the larger value and exchanges places. This is done recursively,
     * until the root node is the largest value. 
     * 
     * Big-O:
     */
    public static void heapify(Comparable[] heap, int index, int heapSize)
    {
    }

    /**
     * Swaps to elements in an array
     */
    private static void swap(Comparable[] heap, int firstIndex, int secondIndex)
    {
        Comparable one = heap[firstIndex];
        heap[firstIndex] = heap[secondIndex];
        heap[secondIndex] = one;
    }

    /**
     * Builds a heap from an array of randomly arranged values. The heap created will be in the order of a complete
     * binary tree satisfying the rules of a heap.
     * 
     * Big-O:
     */
    public static void buildHeap(Comparable[] heap, int heapSize)
    {
    }

    /**
     * Removes an item from the heap, specifically the root node of the heap. The new heap matches the heap rules
     * and is a complete binary tree.
     * 
     * Big-O:
     *
    public static Comparable remove(Comparable[] heap, int heapSize)
    {

    }
     */

    /**
     * Adds an item from the heap, matching the heap rules.
     * 
     * Big-O:
     * 
    public static Comparable[] insert(Comparable[] heap, Comparable item, int heapSize)
    {
    }
     */
}