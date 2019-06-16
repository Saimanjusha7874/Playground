#include <stdio.h>
#include<math.h>
int main() {
	 int n;
  scanf("%d", &n);
  if(n % 2 == 1)
  {
      int term_in_series = (n+1)/2;
      int res = pow(2, term_in_series - 1);
     printf("%d ", res);
  }
  else
  {
    int term_in_series = n/2;
   	int res = pow(3, term_in_series -1);
   	printf("%d ", res);
  } 
  return 0;
}
