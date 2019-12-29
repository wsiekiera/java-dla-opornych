package net.siekiera.tasks.lekcja5_alogrytmy;

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
    public int[] bubbleSort(int[] arrayToBeSorted) {
        int length = arrayToBeSorted.length;
        boolean noSwap = true;
        for(int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arrayToBeSorted[j] > arrayToBeSorted[j + 1]) {
                    int temp = arrayToBeSorted[j];
                    arrayToBeSorted[j] = arrayToBeSorted[j + 1];
                    arrayToBeSorted[j + 1] = temp;
                    noSwap = false;
                }
            }
            if (noSwap == true) {
                break;
            }
        }

        return arrayToBeSorted;
    }
}
