package Assignment_2;

import java.io.*;
import java.util.*;

public class LinearS {

    public static int linearSearch(int array[], int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {

        int array[] = new int[1000];

        // Read numbers from file
        Scanner fileScanner = new Scanner(new File("RandNumb.txt"));

        int i = 0;
        while (fileScanner.hasNextInt()) {
            array[i++] = fileScanner.nextInt();
        }

        fileScanner.close();

        
        int result = linearSearch(array, 1);

        // Search for 1 ** for grader comment from here to 
        if (result == -1)
            System.out.println("Element 1 not found");
        else
            System.out.println("Element 1 found at index: " + result);

        
        
        //System.out.println("Jasen Daniel Drileck (ABC123), Durga Jhansi Yerukala (SCP203) , Vyshanavi Sai Yadlapati (ABC123). Linear Search # 1 search time: " + timeInSec + " sec");
        // ** here 

        // Search for 500 
        /*
        start = System.nanoTime();
        result = linearSearch(array, 500);

        if (result == -1)
            System.out.println("Element 500 not found");
        else
            System.out.println("Element 500 found at index: " + result);
        long end = System.nanoTime();
        double timeInSec2 = (end - start) / 1_000_000_000.0;
        System.out.println("Jasen Daniel Drileck (ABC123), Durga Jhansi Yerukala (SCP203) , Vyshanavi Sai Yadlapati (ABC123). Linear Search # 500 search time: " + timeInSec2 + " sec");
        */

        
        //  Search for 900
        /*
        start = System.nanoTime();
        result = linearSearch(array, 900);

        if (result == -1)
            System.out.println("Element 900 not found");
        else
            System.out.println("Element 900 found at index: " + result);
        end = System.nanoTime();
        double timeInSec3 = (end - start) / 1_000_000_000_000.0;
        System.out.println("Jasen Daniel Drileck (ABC123), Durga Jhansi Yerukala (SCP203) , Vyshanavi Sai Yadlapati (ABC123). Linear Search # 900 search time: " + timeInSec3 + " sec");  

        */
        
    }
}

    

