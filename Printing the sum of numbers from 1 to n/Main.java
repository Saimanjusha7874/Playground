#include <stdio.h>
int main() {
	int n,num,sum;
  scanf("%d",&n);
  for(num=1;num<=n;num=num+1)
  {
    sum=sum+num;
  }
  printf("%d\n",sum);
	return 0;
}