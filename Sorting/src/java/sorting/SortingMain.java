package sorting;



import java.util.Arrays;

public class SortingMain {
    public static void main(String[] args) {
        int[] numbers= {7,2,4,6,1,9,-1};
        //System.out.println(Arrays.toString(BubbleSort.bubbleSort(numbers)));
        //System.out.println(Arrays.toString(SelectionSort.selectionSort(numbers)));
       // JD1MergeSort.mergeSort(numbers);
        JDQuickSort.qSort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));

    }
}