#include <stdio.h>
/*Write a C program using vim that does the following.
Ask for an integer input from the user. Do not print any prompt for input.
If the number is divisible by 3, print the message CS
If the number is divisible by 5, print the message 1714
If the number is divisible by both 3 & 5, print the message CS1714
If the number is not divisible by 3 or 5, print the message ERROR*/

int main(int argc , char * argv[]){
    int num; 
    scanf("%d",&num);
    if(num%3 == 0 && num%5 == 0){
        printf("CS1714");
    }
    else if(num%3 == 0){
        printf("CS");
    }
    else if(num%5 == 0){
        printf("1714");
    }
    else{
        printf("ERROR");
    }

}