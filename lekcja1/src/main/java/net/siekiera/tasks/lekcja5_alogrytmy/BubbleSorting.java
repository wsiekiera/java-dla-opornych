package net.siekiera.tasks.lekcja5_alogrytmy;

import java.util.Arrays;

/**
 * Implement simple bubble sort algorythm. Sample:
 * Take an array of numbers " 5 1 4 2 8", and sort the array from lowest number to greatest number using bubble sort.
 * In each step, elements written in bold are being compared. Three passes will be required;
 *
 * First Pass
 *     ( 5 1 4 2 8 ) → ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
 *     ( 1 5 4 2 8 ) → ( 1 4 5 2 8 ), Swap since 5 > 4
 *     ( 1 4 5 2 8 ) → ( 1 4 2 5 8 ), Swap since 5 > 2
 *     ( 1 4 2 5 8 ) → ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
 * Second Pass
 *     ( 1 4 2 5 8 ) → ( 1 4 2 5 8 )
 *     ( 1 4 2 5 8 ) → ( 1 2 4 5 8 ), Swap since 4 > 2
 *     ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 *     ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 *
 * Now, the array is already sorted, but the algorithm does not know if it is completed.
 * The algorithm needs one whole pass without any swap to know it is sorted.
 *
 * Third Pass
 *     ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 *     ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 *     ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 *     ( 1 2 4 5 8 ) → ( 1 2 4 5 8 )
 */
public class BubbleSorting {
    private int passCount;

    public int[] bubbleSort2(int[] arrayToBeSorted) {
        //todo implement me.
        if (arrayToBeSorted.length < 2) return arrayToBeSorted;

        /*for (int i = 0; i < arrayToBeSorted.length; i++) {
            if (onePass(arrayToBeSorted)) break;
        }*/
        this.passCount = 0;
        do {} while(!onePass(arrayToBeSorted));
        return arrayToBeSorted;
    }

    private boolean onePass(int[] arrayOnePass) {
        boolean isSorted = true;
        for (int i = 0; i < arrayOnePass.length - 1 - this.passCount; i++) {
            if ( arrayOnePass[i] > arrayOnePass[i + 1] ) {
                int temp = arrayOnePass[i];
                arrayOnePass[i] = arrayOnePass[i + 1];
                arrayOnePass[i + 1] = temp;
                isSorted = false;
            }
        }
        this.passCount++;
        return isSorted;
    }

    public int[] bubbleSort(int[] arrayToBeSorted) {
        if (arrayToBeSorted.length < 2) return arrayToBeSorted;
        boolean isSorted;
        int passCount = 0;
        do {
            isSorted = true;
            for (int i = 0; i < arrayToBeSorted.length - 1 - passCount; i++) {
                if (arrayToBeSorted[i] > arrayToBeSorted[i + 1]) {
                    int temp = arrayToBeSorted[i];
                    arrayToBeSorted[i] = arrayToBeSorted[i + 1];
                    arrayToBeSorted[i + 1] = temp;
                    isSorted = false;
                }
            }
        } while (!isSorted);
        return arrayToBeSorted;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new BubbleSorting().bubbleSort(new int[]{3, 4, 5, 2, 5, 2, 1, -7, 0})));
    }
}
