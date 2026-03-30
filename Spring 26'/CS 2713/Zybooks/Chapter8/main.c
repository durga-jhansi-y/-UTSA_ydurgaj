#include <stdio.h>
#include <stdlib.h>

int main(void) {
   int size;
   int* myData;
   int i;
   double sum = 0.0;

   scanf("%d", &size);

   myData = (int*)malloc(size * sizeof(int));

   for (i = 0; i < size; ++i) {
      myData[i] = i;
   }

   for (i = 0; i < size; ++i) {
      printf("%d", myData[i]);
      if (i < size - 1) {
         printf(" ");
      }
      sum += myData[i];
   }
   printf("\n");

   printf("average: %.2lf\n", sum / size);

   free(myData);

   return 0;
}