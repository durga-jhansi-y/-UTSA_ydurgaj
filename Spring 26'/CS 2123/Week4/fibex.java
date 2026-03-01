public class fibex {
    // using recursion 
    public static int fibRecursion(int count) {
        if (count == 0) {
        return 0;
        } 
        if (count == 1 || count == 2) {
        return 1;
        } 
        return fibRecursion(count - 1) + fibRecursion(count - 2);
    }
    public static void main(String args[]) {
        int fib_len = 4;
        System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");
        for (int i = 0; i < fib_len; i++) {
        System.out.print(fibRecursion(i) + " ");
        }

    }
    //using loops 
    /*
    public static void main(String[] args) {        
        int n = 4;         
        int first = 0;        
        int second = 1;        
        System.out.print(first + " " + second + " ");                
        for (int i = 2; i < n; i++) 
        {            
        int next = first + second;            
        System.out.print(next + " ");            
        first = second;            
        second = next;    
        } 
    */
}

