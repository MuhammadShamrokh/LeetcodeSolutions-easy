package shamrokh.muhammad.leetcode.solution;

import java.util.Comparator;

class Solution {
    private static final Comparator<Integer> comparator;

    static {
        comparator = (o1, o2) -> {
            int tmp1 = o1;
            int tmp2 = o2;
            int counter1 = 0;
            int counter2 = 0;

            while(tmp1>0){
                if(tmp1%2==1){
                    counter1++;
                }

                tmp1>>>=1;
            }

            while(tmp2>0){
                if(tmp2%2==1){
                    counter2++;
                }

                tmp2>>=1;
            }

            if(counter1 != counter2)
                return counter1 - counter2;

            return o1-o2;
        };
    }

    public int[] sortByBits(int[] arr) {
        quickSort(arr, 0, arr.length-1);

        return arr;
    }

    private int partition(int[] arr, int low, int high) {

        // Choose the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = low - 1;

        // Traverse arr[low..high] and move all smaller
        // elements to the left side. Elements from low to
        // i are smaller after every iteration
        for (int j = low; j <= high - 1; j++) {
            if (comparator.compare(pivot,arr[j])>0) {
                i++;
                swap(arr, i, j);
            }
        }

        // Move pivot after smaller elements and
        // return its position
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap function
    private  void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // The QuickSort function implementation
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // pi is the partition return index of pivot
            int pi = partition(arr, low, high);

            // Recursion calls for smaller elements
            // and greater or equals elements
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}