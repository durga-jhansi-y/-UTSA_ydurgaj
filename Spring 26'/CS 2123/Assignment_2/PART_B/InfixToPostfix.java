import java.util.Stack;
import java.util.Scanner;

class InfixToPostfix {

    int pemdas(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return 0;
    }

    void convert(String exp) {

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {

             

            char ch = exp.charAt(i);

            if (ch == ' ')
                break; 

            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }

                if (!stack.isEmpty())
                    stack.pop(); 
            }
            else {

                while (!stack.isEmpty() &&
                       pemdas(ch) <= pemdas(stack.peek())) {
                    postfix.append(stack.pop());
                }

                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        System.out.println(postfix.toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Durga Jhansi Yerukala, scp203");
        System.out.println("Enter Infix Expression: ");
        String input = sc.nextLine();
        System.out.println("The Postfix Expression: ");
        InfixToPostfix obj = new InfixToPostfix();
        obj.convert(input);
        System.out.println("End of Program");

        sc.close();
    }
}
