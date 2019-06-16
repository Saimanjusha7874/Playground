#include <stdio.h>
int main() {
	int n,num=1;
  scanf("%d",&n);
  for(num=1;num<=n;++num)
  {
    if(n%num==0)
    {
      printf("%d\n",num);
    }
  }
	return 0;
}