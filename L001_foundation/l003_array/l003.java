import java.util.Scanner;

public class l003{

  public static Scanner scn = new Scanner(System.in);

  public static void test1(){
    int n = scn.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i<n; i++)
    {
      arr[i] = scn.nextInt();
    }

    for(int i = 0; i<arr.length; i++)
    {
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args)
  {
    test1();
  }
}