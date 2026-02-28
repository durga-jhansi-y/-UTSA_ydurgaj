import java.util.Stack;
public class Q9 {
    public static void main(String[] args){
        Stack<String> myStack = new Stack<>();
        myStack.push("1");
        myStack.push("0");
        myStack.push("1");
        myStack.push("1");
        myStack.push("0");
        System.out.println(myStack);
        int p = myStack.search("0");
        System.out.println(p);
    }
    
}
