package Assignment_2.PART_A.Codes;

import java.util.*;
import java.io.*;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class MergeSort {

    public void merge(ArrayList<Integer> arr, int left, int mid, int right) {
       int sideL =  mid - left + 1;
       int sideR = right - mid;

       int[] leftSide = new int[sideL];
       int[] rightSide = new int[sideR];

       for (int i = 0; i < sideL; i++) {
           leftSide[i] = arr.get(left + i);
       }
       for (int i = 0; i < sideR; i++) {
           rightSide[i] = arr.get(mid + 1 + i);
       }

       //Represents current index of left array
       int i =0;
       //Represents current index of right array
       int j = 0;
       //Represents current index of the original array
       int k = left;

       while( i < sideL && j < sideR) {
           if(leftSide[i] <= rightSide[j]) {
               arr.set(k++, leftSide[i++]);
           }
           else {
               arr.set(k++, rightSide[j++]);
           }
       }

        while (i < sideL) {
            arr.set(k++, leftSide[i++]);
        }

        while (j < sideR) {
            arr.set(k++, rightSide[j++]);
        }

    }

    public void sort(ArrayList<Integer> arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex){
            return;
        }
        int middleIndex = (startIndex + endIndex) / 2;

        //Recursive call on subindexes
        sort(arr, startIndex, middleIndex);
        sort(arr, middleIndex + 1, endIndex);
        merge(arr,startIndex, middleIndex, endIndex);
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

        MergeSort ms = new MergeSort();

        
        
        ms.sort(numbers, 0, numbers.size() - 1);
        

        

        // Save sorted file (NOT timed)
        PrintWriter writer = new PrintWriter("sortednumb.txt");
        for (int num : numbers)
            writer.println(num);
        writer.close();
        
        long end = bean.getCurrentThreadCpuTime();
        long cpuTime = end - start;
        double timeInSec = cpuTime / 1_000_000_000.0;
        System.out.println("Array sorted using Merge Sort");

        System.out.println("Jasen Daniel Drileck (VHA667), Durga Jhansi Yerukala (SCP203), Vyshanavi Sai Yadlapati (FPL006).");
        System.out.println("Merge Sort time: " + timeInSec + " sec");
    }
}
