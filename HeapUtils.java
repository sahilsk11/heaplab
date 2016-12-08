/**
 *
 */
public class HeapUtils
{
    /**
     * Heapify gets the left child and the right child of a node and then compares them
     * with the parent node to make sure that both of them have a smaller value than the
     * parent. If at least one of the child has a larger value than the parent, the parent
     * node will be swapped with the greater value of the two children. After the two
     * values switch, heapify will then be used on the child node that was just modified to
     * make sure that the tree is a heap. 

     * @param   index   root of the tree that is being heapified
     * @param   heap    array that contains the heap data
     * @param   heapSize    Size of the heap
     * 
     * Big-O: n
     * 
     * MAKES sure its the maximum in the heap
     */
    public static void heapify(Comparable[] heap, int index, int heapSize)
    {
        int maxIndex = index;

        if (heapSize < index * 2 + 1 && heapSize == index * 2)
        {
            if (heap[index * 2].compareTo(heap[index]) > 0)
            {
                swap(heap, index * 2, index);
            }
        }
        else if (heap[index * 2].compareTo(heap[index]) > 0 || heap[index * 2 + 1].compareTo(heap[index]) > 0)
        {
            if (heap[index * 2 + 1].compareTo(heap[index * 2]) > 0)
            {
                swap(heap, index * 2 + 1, index);
            }
            else if (heap[index * 2].compareTo(heap[index * 2 + 1]) > 0)
            {
                swap(heap, index * 2, index);
            }
        }
    }

    /**
     * Swaps two elements in an array
     * 
     * @param   heap        array that contains the heap data.
     * @param   firstIndex  Index of the first node being swapped.
     * @param   secondIndex Index of the second node being swapped.
     */
    private static void swap(Comparable[] heap, int firstIndex, int secondIndex)
    {
        Comparable one = heap[firstIndex];
        heap[firstIndex] = heap[secondIndex];
        heap[secondIndex] = one;
    }

    /**
     * Build heap starts at the last non-leaf node then it applies heaapify to that node.
     * Next, the method moves to the previous node to apply heapify. This process occurs
     * recursively until the method reaches the root. The root must have the maximum value. 
     * 
     * @postcondition   Root will have the max value of the heap.
     * 
     * @param   heap    array that contains the heap data
     * @param   heapSize    size of the heap
     * 
     * Big-O: n
     */
    public static void buildHeap(Comparable[] heap, int heapSize)
    {
        for (int i = heapSize/2; i >=1; i--)
        {
            heapify(heap, i, heapSize);
        }
    }

    /**
     * Removes an item from the heap, specifically the root node of the heap. 
     * The new heap matches the heap rules and is a complete binary tree.
     * Swaps the root with the last leaf and reducces the heap size by one.
     * 
     * @param   heap        array that contains the heap data
     * @param   heapSize    Size of the heap
     * Big-O: n
     *
     */
    public static Comparable remove(Comparable[] heap, int heapSize)
    {  
        swap(heap, 1, heapSize);
        heapSize--;
        return heap[heapSize];
    }

    /***     * Adds an item to the heap, creates a new array, copies all the values
     * 
     * Big-O:
     */
    public static Comparable[] insert(Comparable[] heap, Comparable item, int heapSize)
    {
        Comparable[] values = new Comparable[heap.length + 1];
        for (int i = 1; i < heap.length; i++)
        {
            values[i] = heap[i];
        }
        values[values.length-1] = item;
        buildHeap(values, values.length-1);
        return values;
    }

    /**
     * Big-O
     */
    public void heapSort(Comparable[] heap, int heapSize)
    {
        while (heapSize >= 1)
        {
            buildHeap(heap, heapSize);
            remove(heap, heapSize);
            heapSize--;
        }
    }
}