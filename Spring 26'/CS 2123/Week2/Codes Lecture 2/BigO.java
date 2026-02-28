//import java.util.*;
public class BigO 
{    
public static void main(String[] args) 
{
  int partialSum; 
  partialSum = 0; 
  for( int i = 1; i <= 3; i++ ) 
    partialSum += i * i * i;
  System.out.println("Line 8="+partialSum);  
}
}
