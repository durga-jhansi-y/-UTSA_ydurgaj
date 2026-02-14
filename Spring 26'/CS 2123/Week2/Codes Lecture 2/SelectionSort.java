public class SelectionSort 
{
    public static void selectionSort(int[] arr) 
    {
        int n = arr.length;
        System.out.println("Array Length: "+n);
        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;
            System.out.println("Min-Index: "+minIndex);
            for (int j = i + 1; j < n; j++) 
            {
                System.out.println("L13: "+arr[j]);
                System.out.println("L14: "+arr[minIndex]);
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                    System.out.println("L18: "+arr[minIndex]);
                }
            }
            // Swap the found minimum element with the first element of the unsorted subarray
            int temp = arr[minIndex];
            System.out.println("L23: "+temp);
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {7, 5, 4, 2};
        selectionSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
