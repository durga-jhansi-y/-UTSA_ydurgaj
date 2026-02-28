public class Q7 {
    public static void main(String[] args){
        int result = sum(3);
        System.out.println(result);
    }
    public static int sum(int k){
        if(k>1){
            return k + sum(k-1);
        }
        else{
            System.out.println("K: "+k);
            return 0;
        }
    }
}
