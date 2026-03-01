import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
public class FibonacciRec 
{
  public static int fibRecursion(int count) 
  {
    if (count == 0) {
      return 0;
    } 
    if (count == 1 || count == 2) {
      return 1;
    } 
    return fibRecursion(count - 1) + fibRecursion(count - 2);
  }
  public static void main(String args[]) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long start = threadMXBean.getCurrentThreadCpuTime();
    int fib_len = 4;
    System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");
    for (int i = 0; i < fib_len; i++) {
      System.out.print(fibRecursion(i) + " ");
    }
    long end = threadMXBean.getCurrentThreadCpuTime();

        long cpuTime = end - start;
        System.out.println("\nCPU Time: " + cpuTime / 1000000.0 + " milliseconds");
  }
}
