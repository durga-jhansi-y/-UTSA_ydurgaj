package Assignment_2.PART_A.Codes;

import java.io.*;
import java.util.*;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class LinearS {

    public static int linearSearch(int array[], int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();

        long start = bean.getCurrentThreadCpuTime();

        int array[] = new int[1000];

        // Read numbers from file (NOT timed)
        Scanner fileScanner = new Scanner(new File("RandNumb.txt"));

        int i = 0;
        while (fileScanner.hasNextInt()) {
            array[i++] = fileScanner.nextInt();
        }
        fileScanner.close();


        
        //  Search for 1

        // int result = linearSearch(array, 1);

        // if (result == -1)
        //     System.out.println("Element 1 not found");
        // else
        //     System.out.println("Element 1 found at index: " + result);

        // long end = bean.getCurrentThreadCpuTime();
        // long cpuTime = end - start;
        // double timeInSec = cpuTime / 1_000_000_000.0;

        // System.out.println("Jasen Daniel Drileck (VHA667), Durga Jhansi Yerukala (SCP203), Vyshanavi Sai Yadlapati (FPL006).");
        // System.out.printf("Linear Search # 1 search time: %.12f sec%n", timeInSec);        

        // Search for 500

        // int result = linearSearch(array, 500);

        // long end = bean.getCurrentThreadCpuTime();

        // if (result == -1)
        //     System.out.println("Element 500 not found");
        // else
        //     System.out.println("Element 500 found at index: " + result);

        // long cpuTime = end - start;
        // double timeInSec = cpuTime / 1_000_000_000.0;

        // System.out.println("Jasen Daniel Drileck (VHA667), Durga Jhansi Yerukala (SCP203), Vyshanavi Sai Yadlapati (FPL006).");
        // System.out.printf("Linear Search # 500 search time: %.12f sec%n", timeInSec);

        //  Search for 900
        
        int result = linearSearch(array, 900);

        long end = bean.getCurrentThreadCpuTime();

        if (result == -1)
            System.out.println("Element 900 not found");
        else
            System.out.println("Element 900 found at index: " + result);

        long cpuTime = end - start;
        double timeInSec = cpuTime / 1_000_000_000.0;

        System.out.println("Jasen Daniel Drileck (VHA667), Durga Jhansi Yerukala (SCP203), Vyshanavi Sai Yadlapati (FPL006).");
        System.out.printf("Linear Search # 900 search time: %.12f sec%n", timeInSec);
        
    }
}