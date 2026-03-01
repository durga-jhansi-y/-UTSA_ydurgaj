import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack <String> animals = new Stack<>();
        animals .push("Dog");
        animals.push("Cat");
        animals.push("Bat");
        System.out.println("Stack top "+animals.peek());
        System.out.println("Stack: "+animals);
        String p1 =animals.pop();
        System.out.println("Stack: "+animals);
        System.out.println("Poped element is :"+p1);
        String p2 = animals.pop();
        System.out.println("Stack: "+animals);
        System.out.println("Poped element is :"+p2);
        String p3 = animals.pop();
        System.out.println("Stack: "+animals);
        System.out.println("Poped element is :"+p3);
    }
    
}
