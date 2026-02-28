import java.util.*;

public class BinaryS {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,7,9,11};
        System.out.println("7 is at position: " + binaryS(arr,7));
    }
    
    public static int binaryS(int[] arr, int k){
        int min = 0; 
        int max = arr.length -1;
        System.out.println("Array size is :" + arr.length);
        System.out.println("Max is :"+max);
        System.out.println();
        while (min <= max){
            int mid = (min+max)/2;
            System.out.println("Num at mid position is: " + arr[mid]);
            System.out.println("Min is: " + min);
            System.out.println("Max is: " + max);
            System.out.println("Mid is: " + mid);
            System.out.println();
            if (arr[mid] == k){
                return mid;
            }
            if (arr[min]<k){
                min = mid+1;
            }
            else {
                max = mid-1;
            }
                    
        }
        return -1;
    }
}
