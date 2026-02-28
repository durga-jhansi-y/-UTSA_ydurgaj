#include <stdio.h>

int main (int argc , char *argv[]){
    //Print multiplication table for odd numbers <N
    //let N = 8 
    int N = 8;
    for (int k = 1; k < N; k+=2){
        printf("\t%d",k);      
    }
    printf("\n");
    
        for (int i = 1; i < N; i+=2){
            printf("\n%d\t", i);
            for (int j = 1; j < N; j+=2){            
                printf("%d\t", i*j);
            }
            printf("\n");
        }
        return 0; 
}