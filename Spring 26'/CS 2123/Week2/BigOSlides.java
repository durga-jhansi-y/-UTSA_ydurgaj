import java.util.*;

public class BigOSlides {
    public static void main(String[] args){
        int partialSum;
        partialSum =0;
        for (int i = 1; i <=3 ; i++){
            partialSum += i*i*i;
        }
        System.out.println("Line 8= "+partialSum);
    }
    
}
