#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main (int argc, int *argv[]){
    const int MIN = -10; 
    const int MAX = 15 ; 
    const int RANGE = MAX-MIN +1;

    srand(time(0));

    for (int i = 0; i < RANGE; i++){
        int r = rand() % RANGE + MIN;
        printf("%d\n",r);
    }
}