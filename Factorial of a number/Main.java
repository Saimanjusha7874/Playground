#include <stdio.h>
int main() {
	int n,num,factorial=1;
  scanf("%d",&n);
  for(num=1;num<=n;++num)
  {
    factorial=factorial*num;
  }
  printf("%d",factorial);    
	return 0;
}