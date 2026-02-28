package Assignment_2.PART_A.Codes;

import java.io.*;
import java.util.*;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class BubbleS {

    void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long start = bean.getCurrentThreadCpuTime();

        int array[] = new int[1000];

        // Read from file
        Scanner fileScanner = new Scanner(new File("RandNumb.txt"));

        int index = 0;
        while (fileScanner.hasNextInt()) {
            array[index++] = fileScanner.nextInt();
        }

        fileScanner.close();

        

        BubbleS b = new BubbleS();
        b.bubbleSort(array);

        

         PrintWriter writer = new PrintWriter("sortednumb.txt");
        for (int num : array)
            writer.println(num);
        writer.close();
        long end = bean.getCurrentThreadCpuTime();
        long cpuTime = end - start;
        double timeInSec = cpuTime / 1_000_000_000.0;
        System.out.println("Array sorted using Bubble Sort");
        System.out.println("Jasen Daniel Drileck (VHA667), Durga Jhansi Yerukala (SCP203) , Vyshanavi Sai Yadlapati (FPL006).\nBubble Sort time: " + timeInSec+ " sec");

    }
}

