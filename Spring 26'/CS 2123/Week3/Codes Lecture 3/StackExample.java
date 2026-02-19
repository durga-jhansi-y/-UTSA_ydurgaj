import java.util.Stack;
public class StackExample 
{
    public static void main(String[] args) 
    {
        Stack<Integer> s = new Stack<>();
        System.out.println("Is stack empty:"+s.isEmpty());
        s.push(5);
        s.push(7);
        s.push(3);
        s.push(11);
        System.out.println("Top:" +s.peek());
        while(!s.isEmpty()) 
        {
            System.out.println(s.pop());
        }
    }
}
