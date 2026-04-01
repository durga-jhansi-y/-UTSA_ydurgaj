import java.util.Scanner;

public class Heaptree {

    static int[] heap = new int[7];
    static int size = 0;

    //Min-Heap helpers - Durga's code

    static void insertMin(int val) {
        heap[size] = val;
        size++;
        int i = size - 1;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap[parent] > heap[i]) {
                int tmp = heap[parent]; heap[parent] = heap[i]; heap[i] = tmp;
                i = parent;
            } else break;
        }
    }

    static int extractMin() {
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        int i = 0;
        while (true) {
            int left = 2*i+1, right = 2*i+2, smallest = i;
            if (left  < size && heap[left]  < heap[smallest]) smallest = left;
            if (right < size && heap[right] < heap[smallest]) smallest = right;
            if (smallest == i) break;
            int tmp = heap[i]; heap[i] = heap[smallest]; heap[smallest] = tmp;
            i = smallest;
        }
        return min;
    }

    //Max-Heap helpers - Vyshanavi's code

    static void insertMax(int val) {
        heap[size] = val;
        size++;
        int i = size - 1;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap[parent] < heap[i]) {
                int tmp = heap[parent]; heap[parent] = heap[i]; heap[i] = tmp;
                i = parent;
            } else break;
        }
    }

    static int extractMax() {
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        int i = 0;
        while (true) {
            int left = 2*i+1, right = 2*i+2, largest = i;
            if (left  < size && heap[left]  > heap[largest]) largest = left;
            if (right < size && heap[right] > heap[largest]) largest = right;
            if (largest == i) break;
            int tmp = heap[i]; heap[i] = heap[largest]; heap[largest] = tmp;
            i = largest;
        }
        return max;
    }

    // Main

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Group info header
        System.out.println("Group 1:");
        System.out.print("Durga Jhansi Yerukala (SCP203) ");
        System.out.print("Vyshanavi Yadlapati (FPL006) ");
        System.out.println("Jasen Drileck (VHA667)");

        // 1. Read 7 unique integers
        System.out.println("Enter 7 unique integers:");
        int[] input = new int[7];
        int count = 0;
        while (count < 7) {
            System.out.print("  Value " + (count + 1) + ": ");
            int val = sc.nextInt();
            boolean dup = false;
            for (int i = 0; i < count; i++) {
                if (input[i] == val) { dup = true; break; }
            }
            if (dup) {
                System.out.println("  Duplicate value! Please enter a different integer.");
            } else {
                input[count++] = val;
            }
        }

        // 2. Choose heap type
        System.out.println("\nSelect Heap type:");
        System.out.println("  Press 1 for Min Heap");
        System.out.println("  Press 2 for Max Heap");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        // 3. Build and display
        size = 0;
        if (choice == 1) {
            for (int v : input) insertMin(v);

            System.out.println("Extraction sequence (Min Heap):");
            while (size > 0) {
                System.out.println("  Extracted Min: " + extractMin());
            }

        } else if (choice == 2) {
            for (int v : input) insertMax(v);

            System.out.println("Extraction sequence (Max Heap):");
            while (size > 0) {
                System.out.println("  Extracted Max: " + extractMax());
            }

        } else {
            System.out.println("Invalid choice. Please run again and press 1 or 2.");
        }

        sc.close();
    }
}