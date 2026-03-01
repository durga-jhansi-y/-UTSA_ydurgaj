import java.util.Stack;

public class ExSearch{
    public static void main (String[] args){
        Stack<String> mystack = new Stack<>();
        mystack.push("Tanjiro");
        mystack.push("Muzan");
        mystack.push("Rengoku");
        mystack.push("Tanjiro");
        mystack.push("Zenitsu");

        System.out.println("Stack:"+mystack);
        int p1 = mystack.search("Rengoku");
        System.out.println("Rengoku position: "+p1);
        
        int p2 = mystack.search("Tanjiro");
        System.out.println("Tanjiro position: "+p2);

        int p3 = mystack.search("Aizan");
        System.out.println("Aizan position: "+p3);

        int p4 = mystack.search("Zenitsu");
        System.out.println("Zenitsu position: "+p4);

    }
}