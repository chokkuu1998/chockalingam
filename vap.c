#include<stdio.h>
#include<conio.h>
#include<values.h>
int a[10] ;
void main()
{
    int i, n ;
    void qsort(int, int) ;
    clrscr() ;
    printf("Enter the limit : ") ;
    scanf("%d", &n) ;
    printf("\nEnter the elements :\n\n") ;
    for(i = 0 ; i < n ; i++)
    scanf("%d", &a[i]) ;
    a[i] = MAXINT ;
    qsort(0, n - 1) ;
    printf("\nThe sorted elemets are :\n\n") ;
    for(i = 0 ; i < n ; i++)
    printf("%d\t", a[i]) ;
    getch() ;
}
void qsort(int left, int right)
    {
    int i, j, t, v ;
    if(left < right)
    {
        i = left + 1 ;
        j = right ;
        v = left ;
        for( ; ; )
        {
            while(a[v] >= a[i])
            i++;
            while(a[v] < a[j])
            j-- ;
            if(i < j)
            {
                t = a[i] ;
                a[i] = a[j] ;
                a[j] = t ;
            }
            else
            break ;
        }
        t = a[v] ;
        a[v] = a[j] ;
        a[j] = t ;
        qsort(left, j - 1) ;
        qsort(j + 1, right) ;
    }
    return ;
}
