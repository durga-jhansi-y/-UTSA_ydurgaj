#include <stdio.h>

int main(int argc , char*argv[]){
    int x ; 
    printf("Enter x: ");
    scanf("%d",&x);

    printf("x doubled is %d\n",x*2);

    printf("Enter y: ");
    int y ;
    scanf("%d",&y);
    printf("sum of x and y is: %d\n", x+y);
    return 0;

}