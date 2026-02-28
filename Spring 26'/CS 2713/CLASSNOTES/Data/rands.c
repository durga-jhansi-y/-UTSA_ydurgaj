// #include <stdio.h>
// #include <stdlib.h>
// #include <time.h>

// int main (int argc, int *argv[]){
//     const int MIN = -10; 
//     const int MAX = 15 ; 
//     const int RANGE = MAX-MIN +1;

//     srand(time(0));

//     for (int i = 0; i < RANGE; i++){
//         int r = rand() % RANGE + MIN;
//         printf("%d\n",r);
//     }
// }
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc , char* argv[]){
    int L = -20;
    int U = 20;
    int N = U-L+1;

    srand(time(NULL));

    printf("Random number between %d and %d is %d\n", L, U, rand()%N +L);

    for (int i =0 ; i<N ; i++){
        int r = rand()%N+L;
        printf("%d. %d\n",i+1,r);
    }
    return 0;

}