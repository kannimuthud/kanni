#include <stdio.h>

int main(void) {
 
      int arr[8],newarr[8],ind,m,h=0;
      for(ind=0;ind<8;ind++)
           scanf("%d",&arr[ind]);
      scanf("%d",&m);
      while(m>h)
      {
      h++;
          newarr[0]=arr[1];
          newarr[7]=arr[6];
          for(ind=1;ind<7;ind++)
          newarr[ind]=arr[ind-1]^arr[ind+1];
          for(ind=0;ind<8;ind++)
            arr[ind]=newarr[ind];
      }
       for(ind=0;ind<8;ind++)
      printf("%d ",newarr[ind]);
	return 0;
}
