package Assignment_2.PART_A.Codes;

import java.io.*;
import java.util.*;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class BinaryS {

    static int binarySearch(int arr[], int pivot) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == pivot)
                return mid;
            else if (arr[mid] < pivot)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long start = bean.getCurrentThreadCpuTime();

        int arr[] = new int[1000];
        Scanner sc = new Scanner(new File("sortednumb.txt"));
        int i = 0;
        while (sc.hasNextInt())
            arr[i++] = sc.nextInt();
        sc.close();

        int result = binarySearch(arr, 1);

        // Serch for 1 
        // if (result != -1)
        //     System.out.println("1 found at index: " + result);

        // long end = bean.getCurrentThreadCpuTime();
        // long cpuTime = end - start;
        // double timeInSec = cpuTime / 1_000_000_000.0;
        // System.out.println("Jasen Daniel Drileck (VHA667), Durga Jhansi Yerukala (SCP203), Vyshanavi Sai Yadlapati (FPL006).\nBinary Search # 1 search time: " + timeInSec + " sec");

        // Search for 500
        
        // result = binarySearch(arr, 500);
        // if (result != -1)
        //     System.out.println("500 found at index: " + result);
        // long end = bean.getCurrentThreadCpuTime();
        // long cpuTime = end - start;
        // double timeInSec = cpuTime / 1_000_000_000.0;
        // System.out.println("Jasen Daniel Drileck (VHA667), Durga Jhansi Yerukala (SCP203), Vyshanavi Sai Yadlapati (FPL006).\nBinary Search # 500 search time: " + timeInSec + " sec");
        
        // Search for 900
         
        result = binarySearch(arr, 900);
        if (result != -1)
            System.out.println("900 found at index: " + result);
        long end = bean.getCurrentThreadCpuTime();
        long cpuTime = end - start;
        double timeInSec = cpuTime / 1_000_000_000.0;
        System.out.println("Jasen Daniel Drileck (VHA667), Durga Jhansi Yerukala (SCP203), Vyshanavi Sai Yadlapati (FPL006).\nBinary Search # 900 search time: " + timeInSec + " sec");
        
    }
}

