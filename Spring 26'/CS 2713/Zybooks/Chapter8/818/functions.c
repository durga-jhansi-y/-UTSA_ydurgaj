#include "functions.h"
#include <math.h>

double average(int nums[LENGTH]) {
   int i;
   int sum = 0;

   for (i = 0; i < LENGTH; ++i) {
      sum += nums[i];
   }

   return (double)sum / LENGTH;
}

void quadraticFormula(double a, double b, double c, double* x1, double* x2) {
   double discriminant = sqrt((b * b) - (4 * a * c));

   *x1 = (-b + discriminant) / (2 * a);
   *x2 = (-b - discriminant) / (2 * a);
}