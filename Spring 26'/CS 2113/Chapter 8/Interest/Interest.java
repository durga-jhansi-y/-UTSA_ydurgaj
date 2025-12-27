import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {
     public static void main (String[] args){
        BigDecimal principle = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);
        System.out.printf("%s%20s%n","Year","Amount on deposit");
        for (int i = 0 ; i <=10 ; i++){
            BigDecimal amount = principle.multiply(rate.add(BigDecimal.ONE).pow(i));
            System.out.printf("%4d%20s%n",i,NumberFormat.getCurrencyInstance().format(amount));
        }
    }
}
