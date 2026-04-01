import java.util.*;

public class MaxHeapAssignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        System.out.println("Enter 7 integers:");
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Press 1 for Min Heap");
        System.out.println("Press 2 for Max Heap");
        int choice = sc.nextInt();

        if (choice == 2) {
            maxHeap(arr);
            extractMaxRepeated(arr);
        } else {
            System.out.println("Min heap not implemented in this file.");
        }
    }

    // Build Max Heap
    public static void maxHeap(int[] arr) {
        int n = arr.length;
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Heapify for Max Heap
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    // Extract max repeatedly
    public static void extractMaxRepeated(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            System.out.println("Extracted Max: " + arr[0]);

            // Move last element to root
            arr[0] = arr[i];

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }
}
