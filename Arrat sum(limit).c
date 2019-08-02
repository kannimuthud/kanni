#include <stdio.h>

int main(void) {
	int arr[30],k,sum,new[30],size,itr,jtr;
	scanf("%d %d",&size,&k);
	for(itr=0;itr<size;itr++)
	scanf("%d",&arr[itr]);
	
	for(itr=0;itr<size;itr++)
	{
		sum=0;
		for(jtr=0;jtr<k;jtr++)
		{
			sum=sum+arr[(itr+jtr)%size];
		}
		new[itr]=sum;
	}
		for(itr=0;itr<size;itr++)
	    printf("%d ",new[itr]);
	return 0;
}
