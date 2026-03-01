import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
//recursion
public class Factorialrec
{
    public static void main(String[] args) 
    {
ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();        
long start = threadMXBean.getCurrentThreadCpuTime();        
        int num = 10;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
long end = threadMXBean.getCurrentThreadCpuTime();
long cpuTime = end - start;
System.out.println("\nCPU Time: " + cpuTime / 1000000.0 + " milliseconds"); 
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}
