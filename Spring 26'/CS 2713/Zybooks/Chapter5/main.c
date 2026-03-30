#include <stdio.h>
#include <math.h>

#define LENGTH 10

int main() {

    double arr[LENGTH];
    double sum = 0.0;
    double avg;
    double varianceSum = 0.0;
    double stddev;

    // Input values
    for(int i = 0; i < LENGTH; i++) {
        scanf("%lf", &arr[i]);
        sum += arr[i];
    }

    // Calculate average
    avg = sum / LENGTH;
    printf("average: %.2f\n", avg);

    // Calculate standard deviation
    for(int i = 0; i < LENGTH; i++) {
        varianceSum += pow(arr[i] - avg, 2);
    }

    stddev = sqrt(varianceSum / LENGTH);

    printf("standard deviation: %.2f\n", stddev);

    return 0;
}