#include <iostream>
using namespace std;

int main() {
	int n;
	int a[100];
	cin>>n;
	for(int i=0;i<n;i++)
	{
	    cin>>a[i];
	}
	for(int i=0;i<n;i++)
	{
	     a[i]=(a[a[i]]%n)*n+a[i];
	}
		for(int i=0;i<n;i++)
	{
	    cout<<a[i]/n<<" ";
	}
	return 0;
}