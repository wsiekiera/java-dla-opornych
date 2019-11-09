package net.siekiera.tasks.lekcja5_alogrytmy;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortingTest {
    private int[] array1 = new int[]{};
    private int[] array2 = new int[]{5};
    private int[] array3 = new int[]{1,2,3,4,5};
    private int[] array4 = new int[]{7,6,5,4,3};
    private int[] array5 = new int[]{9,5,9,3,2,6};
    private int[] array6 = new int[]{-1,-2,-3,-4,9,0,19};
    private int[] array7 = new int[]{1,11,111,1111,5,55,555};

    private int[] sortedArray1 = new int[]{};
    private int[] sortedArray2 = new int[]{5};
    private int[] sortedArray3 = new int[]{1,2,3,4,5};
    private int[] sortedArray4 = new int[]{3,4,5,6,7};
    private int[] sortedArray5 = new int[]{2,3,5,6,9,9};
    private int[] sortedArray6 = new int[]{-4,-3,-2,-1,0,9,19};
    private int[] sortedArray7 = new int[]{1,5,11,55,111,555,1111};


    @Test
    public void bubbleSort() {
        BubbleSorting bubbleSorting = new BubbleSorting();
        assertArrayEquals(sortedArray1, bubbleSorting.bubbleSort(array1));
        assertArrayEquals(sortedArray2, bubbleSorting.bubbleSort(array2));
        assertArrayEquals(sortedArray3, bubbleSorting.bubbleSort(array3));
        assertArrayEquals(sortedArray4, bubbleSorting.bubbleSort(array4));
        assertArrayEquals(sortedArray5, bubbleSorting.bubbleSort(array5));
        assertArrayEquals(sortedArray6, bubbleSorting.bubbleSort(array6));
        assertArrayEquals(sortedArray7, bubbleSorting.bubbleSort(array7));
    }
}