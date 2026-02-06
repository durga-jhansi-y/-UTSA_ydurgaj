public class LinearSearch {
    public static int linearSearch(int array[], int x){
        int n = array.length;
        for (int i = 1; i<n ; i++){
            if(array[i] == x){
                return i;
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        int array[] = {2,4,1,0,9};
        int x = 2;
        int result = linearSearch(array,x);
        if(result == -1){
            System.out.println("Element not found.");
        }
        else{
            System.out.println("element found at index: " + result );
            System.out.println("value: " + array[result]);
        }
    }
    
}
