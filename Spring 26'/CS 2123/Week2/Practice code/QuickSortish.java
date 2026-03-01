public class QuickSortish {
    public static void main(String[] args){
        int[] arr = {4,2,6,0};
        int f = 0;
        int l = arr.length;
        QuickSort(arr,f,l-1);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void QuickSort(int[] arr , int f, int l){
        if(f<l){
            int pi = partition(arr,f,l);
            QuickSort(arr, f, pi-1);
            QuickSort(arr, pi+1, l);
        }

    }
    public static int partition(int[] arr, int f, int l){
        int pivot = arr[l];
        int i = f-1;
        for(int j = f; j<l; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[l];
        arr[l] = temp;
        return i+1;
    }
}
