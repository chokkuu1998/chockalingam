#include <stdio.h>

void main()

{

        int num,digit,sum;

        clrscr();

        printf("Enter positive numbers:\n");

        scanf("%d",&num);

        sum=0;

        while (num > 0)

                {

                digit = num % 10;

                sum += digit;

                num /= 10;

                }

                    printf ("Sum Digit = %d ", sum);

                    getch();

}
