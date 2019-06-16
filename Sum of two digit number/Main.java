#include<stdio.h>
int main()
{
  int a,sum,sum1,sum2;
  scanf("%d",&a);
  sum1=(a/10);
  sum2=(a%10);
  sum=sum1+sum2;
  printf("%d",sum);
  return 0;
}