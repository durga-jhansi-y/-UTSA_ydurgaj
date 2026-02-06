#include <stdio.h>
int main(int argc , char *argv[]){
    char my_i = 'D';// declaration , allocation and initialization.
    int small = 2*10; 
    double f; // declaration and allocation but compiler initializes it with default value 0.0.
    printf("values : %c %d and %lf\n", my_i, small, f);
    return 0;

}