#include<stdio.h>
int main()
{
  int x,y,sum,num;
  scanf("%d",&num);
  x=(num/100);
  y=(num%10);
  sum=(x+y);
  printf("%d \n",sum);
  return 0;
}