import java.util.*;
public class sumex{
    public static void main(String[] args){
        System.out.print("Enter input: ");
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        System.out.println("Sum of first k numbers is : "+ sum(k));
        s.close();
    }
    static int sum(int k){
        if (k == 0){
            return 0;
        }
        else {
            return k+sum(k-1);
        }
        
    }
}