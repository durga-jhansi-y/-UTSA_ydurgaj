#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main (int argv , char* argc){
    srand(time(0)) ;
int n=0;
while( rand()%100 ) n++ ;
printf("It took %d times\n",n) ;
}


