#include <stdio.h>
int main(int argc , char* argv[]){
    printf("Give a: ");
    int a ; 
    scanf("%d",&a);
    printf("Give b: ");
    int b ;
    scanf("%d",&b);
    //branches 
    // if (a>b)
    //     printf("True\n");
    // else 
    //     printf("False\n");
    
    // return 0;
    //conditional operator 
    printf("%d is %s than %d", a , (a>b)?"greater" : "less or equal",b);

    return 0;
}