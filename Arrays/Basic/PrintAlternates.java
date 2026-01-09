package DSApractice.Arrays.Basic;

public class PrintAlternates {
    // Function to print alternate elements of an array
    public static void printAlternateElements(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] sampleArray = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Alternate elements in the array:");
        printAlternateElements(sampleArray);
    }
}
