#include<iostream>

using namespace std;


template <class T>
void Swap(T &ino1,T &ino2)  //call by reference
{
	T temp;
	temp=ino1;
	ino1=ino2;
	ino2=temp;
	
}

int main()
{
	char iValue1=0,iValue2=0;
	
	cout<<"Enter first number\n";
	cin>>iValue1;
	
	cout<<"Enter second number\n";
	cin>>iValue2;
	
	Swap(iValue1,iValue2);  //swap(iValue1,iValue2)
	cout<<"After swap value1 is :"<<iValue1<<"\n";
	cout<<"After swap value2 is :"<<iValue2<<"\n";
	
	return 0;
}
	