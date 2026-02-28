#include <stdio.h>

int main(int argc , char *argv[]){
    //pyramid of alphabets 
    int N = 9;
    //scanf("%d", &N);
    
    for (int i = 0 ; i <N ; i ++){
        char c = 'A';
        for (int j = 0 ; j <= i ; j++){
            
            printf("%c ", c);
            c++;
        }
        printf("\n");

    }
}