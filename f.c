#include <stdio.h> 
int countDigit(long long n) 
{ 
 if (n == 0) 
  return 0; 
 return 1 + countDigit(n / 10); 
} 
int main(void) 
{ 
 long long n = 345289467; 
 printf("Number of digits : %d", 
  countDigit(n)); 
return 0; 
} 
