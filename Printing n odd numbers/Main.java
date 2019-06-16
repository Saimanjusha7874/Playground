#include <stdio.h>
int main() {
	int n, num;
  scanf("%d",&n);
  for(num=1;num<=(2*n-1);num=num+1)
  {
    if(num%2==1)
    {   
    printf("%d\n",num);
    }
  }
	return 0;
}