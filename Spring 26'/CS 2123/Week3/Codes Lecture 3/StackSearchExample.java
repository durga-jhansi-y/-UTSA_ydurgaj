import java.util.Stack;

public class StackSearchExample 
{
    public static void main(String[] args) 
    {
        Stack<String> myStack = new Stack<>();

        myStack.push("Tanjiro");
        myStack.push("Muzan");
        myStack.push("Rengoku");
        myStack.push("Tanjiro"); // Another 
        myStack.push("Zenitsu");
        
        System.out.println("Stack: " + myStack);

        int p1 = myStack.search("Rengoku");
        System.out.println("Rangoku Position: " + p1); 

        int p2 = myStack.search("Tanjiro");
        System.out.println("Tanjiro Position: " + p2);   

        int p3 = myStack.search("Aizan");
        System.out.println("Aizan Position: " + p3);   
        
        int p4 = myStack.search("Zenitsu");
        System.out.println("Zenitsu Position: " + p4); 
    }
}
