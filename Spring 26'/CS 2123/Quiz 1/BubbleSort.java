public class BubbleSort {
    void bubbleSort(int arr[]){
        int n = arr.length;
        int z = 0;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.print(" "+z+"\n");
                    z++;
                }
            }
        }
    }
    public static void main(String args[]){
        BubbleSort ob = new BubbleSort();
        int arr[] = {7,6,3};
        ob.bubbleSort(arr);
        int n = arr.length;
        for (int i = 0; i<n;i++){
            System.out.println();
        }
    }
    
}
