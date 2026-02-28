import java.util.*;

public class BigOSlides {
    public static void main(String[] args){
        int partialSum; // step count is 1 
        partialSum =0; // step count is 1 
        for (int i = 1; i <=3 ; i++){ // step count is 1 for initialization , N+1 for condition check and N for iteration 
            partialSum += i*i*i; // as there are 4 operators and it iterates , N times so step count is 4N
        }
        System.out.println("Line 8= "+partialSum); //step count is 1

        // Total step count is 1+1+1+(N+1)+N+4N+1 = 6N + 5
    }
    
}
