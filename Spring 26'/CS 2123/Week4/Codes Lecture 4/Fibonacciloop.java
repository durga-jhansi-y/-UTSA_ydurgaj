import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
public class Fibonacciloop 
{    
public static void main(String[] args) 
{        
int n = 4;         
int first = 0;        
int second = 1;        
System.out.print(first + " " + second + " ");         
ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();        
long start = threadMXBean.getCurrentThreadCpuTime();        
for (int i = 2; i < n; i++) 
{            
int next = first + second;            
System.out.print(next + " ");            
first = second;            
second = next;        
}
long end = threadMXBean.getCurrentThreadCpuTime();
long cpuTime = end - start;
System.out.println("\nCPU Time: " + cpuTime / 1000000.0 + " milliseconds");    
}
}
