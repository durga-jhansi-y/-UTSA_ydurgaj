package Assignment_2;

import java.io.*;
import java.util.*;

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

        int array[] = new int[1000];

        // Read from file
        Scanner fileScanner = new Scanner(new File("RandNumb.txt"));

        int index = 0;
        while (fileScanner.hasNextInt()) {
            array[index++] = fileScanner.nextInt();
        }

        fileScanner.close();

        long start = System.nanoTime();

        BubbleS b = new BubbleS();
        b.bubbleSort(array);

        System.out.println("Sorted Array:");

         PrintWriter writer = new PrintWriter("sortednumb.txt");
        for (int num : array)
            writer.println(num);
        writer.close();
        long end = System.nanoTime();
        double timeInSec = (end - start) / 1_000_000_000.0;
        System.out.println("Jasen Daniel Drileck (ABC123), Durga Jhansi Yerukala (SCP203) , Vyshanavi Sai Yadlapati (ABC123). Bubble Sort time: " + timeInSec + " sec");


    }
}

