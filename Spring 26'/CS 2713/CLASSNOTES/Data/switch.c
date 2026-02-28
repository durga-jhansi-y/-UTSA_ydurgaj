#include <stdio.h>
#include <ctype.h>

int main(int argc , char*argv[]){
    printf("Add vowel to the L , S , T ");
    char v;
    scanf("%c",&v);
    v = tolower(v);
    switch (tolower(v)){
        case 'a' :
            printf("LAST\n");
            break;
        case 'e' :
            printf("LEST\n");
            break;  
        case 'i' :
            printf("LIST\n");
            break;
        case 'o' :
            printf("LOST\n");   
            break;
        case 'u' :
            printf("LUST\n");   
            break;
        default :
            printf("ERROR\n");
    }
    return 0;
}