import java.util.*;

class InfToPof {
    int precedence(char c){
        if(c == '^'){
            return 3;
        }
        else if(c=='/' || c=='*'){
            return 2;
        }
        else if(c=='+' || c =='-'){
            return 1;
        }
        else {
        return -1;
        }
    }
    void InfixToPostfix(String s){
        Stack <Character> st = new Stack <> ();
        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i <s.length(); i++){
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')){
                result.append(c);
            }
            else if(c == '('){
                st.push('(');
            }
            else if (c==')'){
                while(st.peek() !='('){
                    result.append(st.pop());
                }
                st.pop();
            }
            else {
                while(!st.isEmpty() && (precedence(c)< precedence(st.peek()) || precedence(c) == precedence(st.peek()))){
                    result.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        System.out.println(result.toString());

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);   

        InfToPof ip = new InfToPof();
        String input  = sc.nextLine();
        ip.InfixToPostfix(input);
        
        sc.close();
       
    }

    
}
