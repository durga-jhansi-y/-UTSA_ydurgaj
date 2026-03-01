import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class Factorialw 
{
    public static void main(String[] args) {
      
ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();        
long start = threadMXBean.getCurrentThreadCpuTime();        

        int num = 10, i = 1;
        long factorial = 1;
        while(i <= num)
        {
            System.out.printf("\n Factorial= %d ; I= %d", factorial, i);
            factorial = factorial*i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

long end = threadMXBean.getCurrentThreadCpuTime();
long cpuTime = end - start;
System.out.println("\nCPU Time: " + cpuTime / 1000000.0 + " milliseconds"); 

    }
}

