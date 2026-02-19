import java.util.Stack;
class stackstr 
{
  public static void main(String[] args) 
  {
    Stack<String> animals= new Stack<>();
    animals.push("Dog");
    animals.push("Cat");
    animals.push("Bat");
    System.out.println("Stack top: " + animals.peek());
    System.out.println("Stack: " + animals);
    animals.pop();
    System.out.println("Stack after pop: " + animals);
    }
}
