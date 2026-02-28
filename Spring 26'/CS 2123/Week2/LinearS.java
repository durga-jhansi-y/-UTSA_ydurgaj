//import java.util.*;

public class LinearS {
    public static void main(String[] args){
        int[] arr = {1,2,5,99,0,4,11,8, 5,5};
        System.out.println("5 is at positions : " + LinearSear(arr,5));
    }

    public static int LinearSear(int[] arr, int k){
        int count = 0;
        int[] arr1 = new int[arr.length];
        for (int i = 0 ; i<arr.length; i++){
            if(arr[i] == k){
                count++;
                arr1[count-1] = i;
            }
        }
        if(count == 0){
            return -1;
        }
        else{
            for (int i = 0; i<count; i++){
                System.out.println("Element found at position: " + arr1[i]);
            }
        }
        return count;
    }
    
}
