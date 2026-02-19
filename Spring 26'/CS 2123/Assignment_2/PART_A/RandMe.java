package Assignment_2;
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

        System.out.println("1000 random numbers saved to RandNumb.txt");
    }
}

    

