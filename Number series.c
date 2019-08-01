#include <stdio.h>

int main(void) {

	int num,p=1,ans=0;
	scanf("%d",&num);
while(num)
{
	if(num%2!=0)
	{
		ans=(3*p)+ans;
		p=p*10;
		num=num/2;
	}
	else
	{
		ans=(4*p)+ans;
		p=p*10;
		num=num/2;
		num=num-1;
	}
}
	printf("%d",ans);
}
//3 4 33 34 43 44 333 334 343 34....
