#include<stdio.h>
int main()
{
   int num;
  scanf("%d ",&num);
  if((num%4==0&&num%100!=0)||(num%4==0))
                              
  {
    printf("Leap year");
  }
  else
  {
    printf("Not Leap year");
  }
 
  return 0;
}