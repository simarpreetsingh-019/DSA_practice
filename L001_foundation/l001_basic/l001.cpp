//how to execute it ? 
// g++ filename.cpp -o out && ./out
// tell g++ about filename.cpp , '-o out' means compile it, '&&' means do another task at same ,
// './out' or 'out ' means do output.
//if you want to save output in another file, do add 'out > filename.txt' , it will save output in filename.txt 

#include <iostream>
using namespace std;  

void print_hello()
{
  cout<<"hello there from cpp"<<endl;
}

void workwith_Datatype(){
  int a = 10;
  int b = 20;

  cout<< "value of a = "<<a<<endl;
  cout<<"value of b = "<<b<<endl;
}

// day 2 27 nov 2020

void printZ(){
  cout<<"* * * * * "<<endl;
  cout<<"       *"<<endl;
  cout<<"     *"<<endl;
  cout<<"   *"<<endl;
  cout<<"* * * * * "<<endl;
}

// q2 Grading system
 void grading_system(int marks){
  if( marks > 90){
    cout<<"excellent"<<endl;
  }
  else if(marks > 80 && marks <= 90){
    cout<<"good"<<endl;
  }
  else if(marks > 70 && marks <= 80){
    cout<<"fair"<<endl;
  }
  else if(marks > 60 && marks <= 70){
    cout<<"meet expectations"<<endl;
  }
  else {
    cout<<"below par"<<endl;
 }
}

// Check odd even
void check_odd_even(int n){
  if(n%2 == 0)
  {
    cout<<"\n Even";
  }
  else 
  {
    cout<<"\n odd";
  }
}

int main()
{
  
  //workwith_Datatype();
  //print_hello();
  //printZ();
  grading_system(69);
  check_odd_even(96);
  return 0;

}