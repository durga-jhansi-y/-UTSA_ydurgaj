public class BubbleSortish {
    public static void BubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i<n-1 ; i++){
            for (int j = 0 ; j<n-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j] ; 
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println("Swapping " + arr[j] + " and " + arr[j+1]);
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1,8,99,5,83,4,6,3,-4};
        BubbleSort(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
