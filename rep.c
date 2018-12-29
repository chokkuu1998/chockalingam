#include <stdio.h>
 
void display(int);
 
int main()
{
    int num, result;
 
    printf("Enter the Nth number: ");
    scanf("%d", &num);
    display(num);
    return 0;
}
 
void display(int num)
{
    static int i = 1;
 
    if (num == i)
    {
        printf("%d   \n", num);
        return;
    }
    else
    {
        printf("%d   ", i);
        i++;
        display(num);
    }
}
