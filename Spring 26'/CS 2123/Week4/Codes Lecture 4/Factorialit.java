import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

class Factorialit
{  
 public static void main(String args[])
 {  
   ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();        
   long start = threadMXBean.getCurrentThreadCpuTime();        
  int i,fact=1;  
  int number=10;  
  for(i=1;i<=number;i++)
  {    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);  
  long end = threadMXBean.getCurrentThreadCpuTime();
  long cpuTime = end - start;
  System.out.println("\nCPU Time: " + cpuTime / 1000000.0 + " milliseconds"); 
 }  
} 
