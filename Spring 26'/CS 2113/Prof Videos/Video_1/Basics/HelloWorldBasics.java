package Basics;

public class HelloWorldBasics{

    
    public static void main(String[] args){
        // variable 
        // int num = 5;
        String greeting = "Hello World!";

        int x = 0;
        int y = 15;

        if (x < y) {
            System.out.println(greeting);
        }else if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is equal to y");
        }
        int i = 0;
        while(i<10){
            System.out.println("i is: " + i);
            i++;
        }

        for ( i = 0 ; i <10 ; i++){
            System.out.println("for loop i is: " + i);
        }
        
    }
}