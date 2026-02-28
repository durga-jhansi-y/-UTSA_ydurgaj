package Assignment_2.PART_A.Codes;
import java.io.*;
import java.util.*;

public class RandMe {
   
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        PrintWriter writer = new PrintWriter("RandNumb.txt");

        for (int num : numbers) {
            writer.println(num);
        }

        writer.close();

        System.out.println("Jasen Daniel Drileck (VHA667), Durga Jhansi Yerukala (SCP203) , Vyshanavi Sai Yadlapati (FPL006).");

        System.out.println("1000 random numbers saved to RandNumb.txt");
    }
}

    

