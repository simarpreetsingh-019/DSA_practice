#include<iostream>
#include<vector>
using namespace std;

void test1()
{
  // int* arr = new int[100];
  // for(int i =0; i<20; i++)
  // {
  //   cout<<arr[20]<<" ";
  // }

  vector<int> arr(10, 4);
  for(int i=0; i<arr.size(); i++)   
  { 
    cout<<arr[i]<<" ";
  }
}

void test2()
{
  int n;
  cout<<"Enter size of array"<<endl;
  cin>>n;
  vector<int> arr(n);

  for(int i = 0; i<arr.size(); i++)
  {
    cin>>arr[i];
  }

  cout<<"--------------------------"<<endl;
  for(int i = 0; i<n; i++)
  {
    cout<<arr[i]<<" ";
  }
}

int maxEle(vector<int>& arr)
{
  int max = -1e8;
  for(int i = 0; i<arr.size(); i++)
  {
    if(arr[i] > max)
      max = arr[i];
  }
  return max;
}

int minEle(vector<int>& arr)
{
  int min = 1e8;
  for(int i = 0; i< arr.size(); i++)
  {
    if(min > arr[i])
      min = arr[i];
  }
  return min;
}

int findEle(vector<int>& arr, int data)
{
  int idx = -1;
  for(int i = 0; i<arr.size(); i++)
  {
    if(arr[i] == data)
      {
        idx = i;
        break;
      }
  }
    return idx;
}

void find_firstIdx(vector<int>& arr, int data)
{
  int idx = -1;
  for(int i = 0; i< arr.size(); i++)
  {
    if(arr[i] == data)
    {
      idx = i;
      break;
    }
  }
  //return idx;
  if(idx > -1)
    cout<<endl<<"element found at = " << idx;
}

void find_lastIdx(vector<int>& arr, int data)
{
  int idx = -1;
  for(int i = arr.size(); i>=0; i--)
  {
    if(arr[i] == data)
    {
      idx = i;
      break;
    }
  }
  // return idx;
  if(idx > -1)
    cout<<endl<<"element found at = " << idx;
}

int main()
{
  // test1();
  //test2();
   int n; 
  cout<<"Enter size of array"<<endl;
  cin>>n;
  vector<int> arr(n);

  for(int i = 0; i<arr.size(); i++)
  {
    cin>>arr[i];
  }

  int data = 5;
  // cout<<endl<<"max element = " << maxEle(arr);
  //cout<<endl<<"min element = " << minEle(arr);
  //findEle(arr, data);
  //find_firstIdx(arr, data);
  find_lastIdx(arr,data);
  return 0;
}