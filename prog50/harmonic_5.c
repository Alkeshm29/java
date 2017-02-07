#include <stdio.h>
#include <stdlib.h>
 
int main() {
    int terms, i, first, denominator, diff;
    float sum = 0.0;
    printf("Enter the number of terms in HP series\n");
    scanf("%d", &terms);
 
    printf("Enter denominator of first term and common difference of HP series\n");
    scanf("%d %d", &first, &diff);
 
    /* print the series and add all elements to sum */
    denominator = first;
    printf("HP SERIES\n");
    for(i = 0; i < terms; i++) {
        printf("1/%d ", denominator);
        sum += 1/(float)denominator;
        denominator += diff;
    }
 
    printf("\nSum of the HP series till %d terms is %f\n", terms, sum);
 
C
    getch();
