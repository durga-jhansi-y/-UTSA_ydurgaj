class S{
    public static int S (int array[] , int x){
        int n = array.length;
        for (int i = 1; i<n ; i++){
            if(array[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {2,4,1,2,9};
        int x = 2;
        int result = S(array,x);
        if(result == -1){
            System.out.println("Nope");
        }
        else{
            System.out.println("index: " + result );
            System.out.println("value: " + array[result]);
        }
    }
}