import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
//forloop 
public class Factorial 
{
    public static void main(String[] args) 
    {
      
ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();        
long start = threadMXBean.getCurrentThreadCpuTime();        

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            System.out.printf("\n Factorial of %d = %d ; I= %d", i-1,factorial, i);
            factorial = factorial * i;
        }
        System.out.printf("\n Factorial of %d = %d", num, factorial);
long end = threadMXBean.getCurrentThreadCpuTime();
long cpuTime = end - start;
System.out.println("\nCPU Time: " + cpuTime / 1000000.0 + " milliseconds"); 
    }
}
