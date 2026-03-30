#include <stdio.h>
int ChangeValues(int x, int y) {
   int result;

   result = x + y;

   return result;
}

int main(void) {
   printf("%d\n", ChangeValues(1, 3));
   
   return 0;
}