public class SelectionSortish{
    public static void SelectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++){
            int minTarget = i ;
            for( int j = i+1 ; j<n ; j++){
                if(arr[j]<arr[minTarget]){
                    minTarget = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minTarget];
            arr[minTarget] = temp;
            System.out.println("Swapping " + arr[i] + " and " + arr[minTarget]);           
            
        }

    }

    public static void main(String[] args){
        int[] arr = {7,5,4,2};
        SelectionSort(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}