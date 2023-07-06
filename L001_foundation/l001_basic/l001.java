
// How to run the file ? 
// javac filename.java && java filename
// 'javac' to tell java compiler to execute 'filename.java' , '&&' to tell that after execution , 
// 'java filename' to tell run this java file  

import java.util.Scanner;

public class l001{

  public static Scanner scn = new Scanner(System.in);

  public static void print_hello(){
    System.out.println("Function 1, print hello running");
    System.out.println("Hi there");

  }

  public static void workwith_Datatype(){
    System.out.println("Function 2, working and outputing datatype running");
    int a = 10;
    int b = 20;

    System.out.println("Value of a = "+a);
    System.out.println("Value of b = "+b);
}

// day 27 nov class
//https://classroom.pepcoding.com/myClassroom/the-placement-program-gtbit-nov-27-2020/getting-started/print-z-official/ojquestion 
  public static void printZ(){
    System.out.println("Function 3, print Z pattern running");
    System.out.println("*****");
    System.out.println("   *");
    System.out.println("  *");
    System.out.println(" *");
    System.out.println("*****");
  }

/*
q https://classroom.pepcoding.com/myClassroom/the-placement-program-gtbit-nov-27-2020/getting-started/grading-system-official/ojquestion
Grading System
1. You are given as input marks of a student.
2. Display an appropriate message based on the following rules:
  	  2.1 for marks above 90, print excellent.
  	  2.2 for marks above 80 and less than equal to 90, print good.
  	  2.3 for marks above 70 and less than equal to 80, print fair.
  	  2.4 for marks above 60 and less than equal to 70, print meets expectations.
  	  2.5 for marks less than equal to 60, print below par.

 */  

 public static void grading_system(int marks){
  System.out.println("Function 4, Grading System running");
  
  if( marks > 90){
    System.out.println("excellent");
  }
  else if(marks > 80 && marks <= 90){
    System.out.println("good");
  }
  else if(marks > 70 && marks <= 80){
    System.out.println("fair");
  }
  else if(marks > 60 && marks <= 70){
    System.out.println("meet expectations");
  }
  else {
    System.out.println("below par");
 }
}

// q :  Check if the no is odd or even

 public static void check_odd_even(int n){

  System.out.println("function : Check odd even running ");
  if(n%2 == 0){
    System.out.println("Even");
  }
  else{
    System.out.println("Odd");
  }
 }

 // q3 :  check if no is prime

  public static boolean is_prime(int n){
    System.out.println("Function : isprime running");
    boolean flag = true;

    for(int i =2; i<= n/2; i++){
      if( n%i == 0)
      {
        flag = false;
        break;
      }
    }
    return flag;
  }

  public static boolean is_prime2(int n){
    System.out.println("Function : isprime : Optimised with root n approach running");
    boolean flag = true;

    for(int i =2; i*i<= n; i++){
      if( n%i == 0)
      {
        flag = false;
        break;
      }
    }
    return flag;
  }

  public static void check_prime(){
    System.out.println("Function : check prime running");
    System.out.println("Enter no you want to check for is prime or not");
    int no = scn.nextInt();

    //boolean isprime = is_prime(no);
    boolean isprime = is_prime2(no);
    System.out.println("Prime status : "+isprime);
  }

  //q4 print all primes till n
  public static void prime_till_n(){
    System.out.println("Function : check prime till n running -----------");

    System.out.println("Enter first no of range you want to check for is prime or not");
    int no1 = scn.nextInt();

    System.out.println("Enter last no of range you want to check for is prime or not");
    int no2 = scn.nextInt();

    for (int i = no1; i <= no2; i++){
      boolean status = is_prime2(i);
      if(status){
        System.out.println(i);
      }
    }
  }

// q :  gcd of 2 no

  public static int get_gcd(int a, int b)
  {
    System.out.println("Function : get_GCD running");
    int divisor = a;
    int divident = b;

    if(a < b)
    {
    divisor = b;
    divident = a;
    }
    
    while(divident % divisor != 0)
    {
      int rem = divident % divisor;
      divident = divisor;
      divisor = rem;
    }
    return divisor;
  }

  public static void find_gcd()
  {
    System.out.println("Function : Find GCD  running");
    int a = scn.nextInt();
    int b = scn.nextInt();

    int gcd = get_gcd(a,b);
    System.out.println("GCD = "+ gcd);
  }

  // q :  find lcm of 2 no

  public static int get_lcm(int a, int b, int gcd)
  {System.out.println("Function : get LCM running");
    return ((a/gcd) * b);
  }

  public static void find_lcm()
  {
    System.out.println("Function : find LCM running");
    int a = scn.nextInt();
    int b = scn.nextInt();

    int gcd = get_gcd(a,b);
    int lcm = get_lcm(a,b,gcd);
    System.out.println("LCM = "+ lcm);
  }

  // Pythagoras Triplet : 

  /**
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static boolean isPythagorasTriplet(int a, int b, int c)
  {System.out.println("Function : Check Pythagorean triplet running");
    if((a*a + b*b == c*c) || (c*c + b*b == a*a) || (a*a + c*c == b*b))
      return true;
    else
      return false;
  }

  // benjamin bulbs

  public static void benjamin_bulbs(int n){
    System.out.println("Function : benjamin Bulbs running");
    for(int i = 1; i*i <=n; i++)
    {
      System.out.println(i*i);
    }
  }

  public static void print_fibo(int n)
  {
    int first =0;
    int second = 1;
    int sum = 0;
    System.out.println("Fibonacci series till "+n + " = ");
    System.out.println(first);
    System.out.println(second);

    while( n-->2)
    {
      sum = first+second;
      System.out.println(sum);
      first = second;
      second = sum;
    }
  }

  public static void fibo_till_n()
  {
    System.out.println("Function : Fibonacci till n running");
    System.out.println("Enter no till you want Fibonacci");
    int no = scn.nextInt();

    print_fibo(no);

  }



  public static void main(String[] args){   
  // public means its available to everyone ,
  // main means this is the first function that will get executed
  // void means this is not returning anything ( empty)
  //String[] args means this is interacting with the terminal / 
  // terminal functions  

  print_hello();
  // workwith_Datatype();
  // System.out.println("Hello");
  // printZ();
  // check_odd_even(69);
  // check_prime();
  // find_gcd();
  // find_lcm();
  // isPythagorasTriplet(3, 4, 5);
  // benjamin_bulbs(7);
  fibo_till_n();

  }
}