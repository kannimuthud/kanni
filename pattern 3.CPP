#include <iostream>
using namespace std;

int main() {
	int n,i,j,c=2;
	cin>>n;
	for(i=1;i<=n;i++)
	{
	    if(i%2!=0)
	    {
	        for(j=0;j<n;j++)
	        {
	            if(j==n-1)
	            {
	                cout<<c++;
	            }
	            else
	            {
	                cout<<i;
	            }
	            cout<<" ";
	        }
	    }
	    else
	    {
	        for(j=0;j<n;j++)
	        {
	            if(j==0)
	            {
	                cout<<c++;
	            }
	            else
	            {
	                cout<<i;
	            }
	            cout<<" ";
	        }
	    }
	    cout<<"\n";
	}
	return 0;
}
