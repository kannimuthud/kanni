#include <stdio.h>

int main(void) {
	int arr[30],size,ind,temp;
	scanf("%d",&size);
	for(ind=0;ind<size;ind++)
	scanf("%d",&arr[ind]);
	
	for(ind=0;ind<size-1;ind++)
	{
		if(ind%2==0)
		{
			if(arr[ind]>arr[ind+1])
			{
				temp=arr[ind];
				arr[ind]=arr[ind+1];
				arr[ind+1]=temp;
			}
		}
		else
		{
			if(arr[ind]<arr[ind+1])
			{
				temp=arr[ind];
				arr[ind]=arr[ind+1];
				arr[ind+1]=temp;
			}
		}
	}
	for(ind=0;ind<size;ind++)
	printf("%d ",arr[ind]);
	return 0;
}
