package Assignment_2.PART_A.Codes;

import java.util.*;
import java.io.*;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class QuickSort {

    // Partition using FIRST element as pivot
    public int partition(ArrayList<Integer> arr, int low, int high) {

        int pivotValue = arr.get(low);   // FIRST element as pivot
        int i = low + 1;

        for (int j = low + 1; j <= high; j++) {

            if (arr.get(j) < pivotValue) {
                swap(arr, i, j);
                i++;
            }
        }

        // Place pivot in correct position
        swap(arr, low, i - 1);

        return i - 1;
    }

    public void swap(ArrayList<Integer> arr, int first, int second) {
        int temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }

    public void quickSort(ArrayList<Integer> arr, int startIndex, int endIndex) {

        if (startIndex < endIndex) {

            int pivotIndex = partition(arr, startIndex, endIndex);

            quickSort(arr, startIndex, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, endIndex);
        }
    }

    public static void main(String[] args) throws IOException {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long start = bean.getCurrentThreadCpuTime();


        ArrayList<Integer> numbers = new ArrayList<>();

        // Read file first (NOT timed)
        Scanner sc = new Scanner(new File("RandNumb.txt"));
        while (sc.hasNextInt())
            numbers.add(sc.nextInt());
        sc.close();

        QuickSort qs = new QuickSort();

        qs.quickSort(numbers, 0, numbers.size() - 1);


        // Save sorted file (NOT timed)
        PrintWriter writer = new PrintWriter("sortednumb.txt");
        for (int num : numbers)
            writer.println(num);
        writer.close();

        long end = bean.getCurrentThreadCpuTime();
        long cpuTime = end - start;
        double timeInSec = cpuTime / 1_000_000_000.0;

        System.out.println("Array sorted using Quick Sort (Pivot = First Index)");
        System.out.println("Jasen Daniel Drileck (VHA667), Durga Jhansi Yerukala (SCP203), Vyshanavi Sai Yadlapati (FPL006).");
        System.out.printf("Quick Sort (Pivot = First Index) time: %.6f sec%n", timeInSec);
    }
}

