package DSApractice.Arrays.Basic;

public class CheckIfSorted {
    // Function to check if the array is sorted in non-decreasing order
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                return false; // Found an element greater than the next one
            }
        }
        return true; // No such elements found, array is sorted
    }

    public static void main(String[] args) {
        int[] sampleArray = {1, 2, 2, 3, 4, 5};
        if (isSorted(sampleArray)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

}
