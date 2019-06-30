#include <iostream>
using namespace std;

int main() {
	int n,i,j,c=1;
	cin>>n;
	for(i=0;i<=n;i++)
	{
	    for(j=0;j<n;j++)
	    {
	        if (i!=0 and i!=n)
	        {
	            if(j==n-2)
	            {
	                cout<<c++;
	                cout<<" ";
	            }
	            else
	            {
	                cout<<n;
	                cout<<" ";
	            }
	        }
	        else
	        {
	            cout<<n;
	            cout<<" ";
	        }
	   
	    }cout<<"\n";
	}
	return 0;
}
