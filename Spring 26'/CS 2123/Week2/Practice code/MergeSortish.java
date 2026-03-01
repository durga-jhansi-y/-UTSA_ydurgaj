public class MergeSortish {
    public static void main(String[] args){
        int[] arr = {4,2,6,0};
        int f = 0;
        int l = arr.length;
        MergeSort(arr,f,l-1);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void MergeSort(int[] arr , int f, int l){
        if(f<l){
            int mid = f+(l-f)/2;
            MergeSort(arr, f, mid);
            MergeSort(arr, mid+1, l);
            Merge(arr, f, mid, l);
        }

    }
    public static void Merge(int[] arr, int f, int mid, int l){
        int n1 = mid-f+1;
        int n2 = l-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i<n1; i++){
            left[i] = arr[f+i];
        }
        for(int j = 0; j<n2; j++){
            right[j] = arr[mid+1+j];
        }
        int i=0,j=0,k=f;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }

    }
    
}
