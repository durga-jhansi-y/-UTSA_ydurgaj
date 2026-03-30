# include <stdio.h>
int main(int argc , char* argv){
    printf("give me an integer: ") ;
    int v ;
    scanf("%d",&v) ;
    while (v-- > 0) printf("%d ", v ) ;
    printf(".\n") ;
}