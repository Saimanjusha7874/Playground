#include<stdio.h>
int main()
{
  int num,extract;
  scanf("%d",&num);
  extract=((num%100)/10);
  printf("%d \n",extract);
  return 0;
}