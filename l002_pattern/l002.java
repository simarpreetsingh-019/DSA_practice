import java.util.Scanner;

public class l002{

  // nsp = no. of spaces
  // csp =  count of star right now
  // nst = no of stars
  // cst = count of star right now

  public static Scanner scn = new Scanner(System.in);

  public static void print_square(int row)
  {
    int nst = row; 
    for (int r = 1; r< row; r++)
    {
      for( int cst = 1; cst <= nst; cst ++)
      {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

  public static void print_triangle(int row)
  {
    System.out.println(" Print triangle function running");
    int nst = 1;
    for( int i = 1; i <= row; i++)
    {
      for ( int cst = 1; cst <= nst; cst++)
      {
        System.out.print(" * ");
      }
      System.out.println();
      nst++;  
    }
  }

  public static void print_mirror_triangle(int row)
  {
    System.out.println(" Print mirror triangle function running");
    int nst = 1;
    int nsp = row -1;
    for(int r = 1; r <= row; r++)
    {
      for (int csp = 1; csp<= nsp; csp++)
      {
        System.out.print(" ");
      }
      for(int cst = 1; cst <= nst; cst++)
      {
        System.out.print("*");
      }

      System.out.println();
      nsp--;
      nst++;
    }
  }

  public static void inverted_triangle(int row)
  {
    System.out.println(" Print reverse triangle function running");
    int nst = row;
    for(int r = row; r>= 1; r--)
    {
      for( int cst = 1; cst <=r; cst++)
      {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

  public static void inverted_mirror_triangle(int row)
  {
    System.out.println(" Print inverted mirror triangle function running");
    int nst= row;
    int nsp = 0;

    for( int r = 1; r <= row; r++)
    {
      nsp = r-1;
      for(int csp = 1; csp <= nsp; csp++)
      {
        System.out.print(" ");
      }

      for(int cst = 1; cst <= nst; cst++)
      {
        System.out.print("*");
      }
      nst--;
      System.out.println();
    }
  }

  public static void print_Diamond(int row)
  {
    System.out.println(" Print Diamond function running");
    int nsp = row/2;
    int nst = 1;
    
    for(int r = 1; r <= row; r++)
    {
      for (int csp = 1; csp <= nsp; csp++)
      {
        System.out.print(" ");
      }

      for ( int cst = 1; cst <= nst; cst++)
      {
        System.out.print("*");
      }

      if(r <= row/2)
      {
        nsp--;
        nst+=2;
      }
      else
      {
        nsp++;
        nst-=2;
      }
      System.out.println();
    }
  }

  public static void empty_Diamond(int row)
  {
    System.out.println(" Print Empty Diamond function running");
    int nst = (row+1) / 2;
    int nsp = 1;

    for (int r = 1; r <= row; r++)
    {
      for (int cst = 1; cst <= nst; cst++)
      {
        System.out.print("*");
      }

      for( int csp =1; csp <= nsp; csp++)
      {
        System.out.print(" ");
      }

      for( int cst2 = nst; cst2>= 1; cst2--)
      {
        System.out.print("*");
      }

      System.out.println();

      if(r <= row/2)
      {
        nst--;
        nsp+=2;
      }
      else
      {
        nst++;
        nsp-=2;
      }
    }
  }

  public static void print_number_Diamond(int row)
  {
    int nsp = row/2;
    int nst = 1;
    int count =1 ;

    for( int r = 1; r<=row; r++)
    {
      for( int csp = 1; csp<=nsp; csp++)
      {
        System.out.print(" ");
      }

      for( int cst = 1; cst <= nst; cst++)
      {
        System.out.print(count + " ");

      //   if(cst <= (nst/2))
      //     count++;
      //   else
      //     count--;
      //
     }
      System.out.println();
      if(r <= (row/2))
      {
        nsp--;
        nst+=2;
        count++;
      }
      else
      {
        nsp++;
        nst-=2;
        count--;
      }
    }

  }

  public static void print_number_pattern15(int row)
  {
    int nsp = row/2;
    int nst = 1;

    for( int r = 1; r<=row; r++)
    {
      for( int csp = 1; csp<=nsp; csp++)
      {
        System.out.print(" ");
      }

      int count =r ;
      if(r > (row /2) +1)
        count = row-r+1;


      for( int cst = 1; cst <= nst; cst++)
      {
        System.out.print(count + " ");

        if(cst <= (nst/2))
          count++;
        else
          count--;
      
     }
      System.out.println();
      if(r <= (row/2))
      {
        nsp--;
        nst+=2;
        count++;
      }
      else
      {
        nsp++;
        nst-=2;
        count--;
      }
    }

  }

  public static void print_right_diagonal(int row)
  {
    int nsp=0;
    for (int r =1;r<=row ; r++)
    {
      nsp = r;
      for(int csp = 0; csp<nsp; csp++)
      {
        System.out.print("  ");
      }
      System.out.print("* ");
      System.out.println();
    }
  }

  public static void print_left_diagonal(int row)
  {
    int nsp = row-1;
    for(int r = 1; r<= row; r++)
    {
      for(int csp = 1; csp <=nsp; csp++)
      {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();

      nsp--;
    }
  }

  public static void print_cross(int row)
  {
    for(int r = 1; r <= row; r++)
    {
      for( int c = 1; c<= row; c++)
      {
        if(c == r || c == row - r + 1 )
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void new_pattern_diamond_boundry(int row)
  {
    int mid = (row/2 + 1);
    for (int r = 1; r<=row; r++)
    {
      int center = r;
      if(r >= row/2 +1 )
        center = r - mid +1;
      for( int c = 1; c<= row; c++)
      {
        if( (c == (mid - center + 1)) || (c == (mid + center - 1))  )
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }


  public static void diamond_boundry(int row)
  {
    int mid = (row/2 + 1);
    for (int r = 1; r<=row; r++)
    {
      int center = r;
      if(r >= row/2 +1 )
        center = row - r +1;
      for( int c = 1; c<= row; c++)
      {
        if( (c == (mid - center + 1)) || (c == (mid + center - 1))  )
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }

  //no triangle
  public static void pattern11(int row)
  {
    int count = 1;
    for(int r = 1; r<= row; r++)
    {
      for(int c = 1; c<= r; c++)
      {
        System.out.print(count + " ");
        count++;
      }
      System.out.println();
    }
  }

  // fibo triangle
  public static void pattern12(int row)
  {
    int first = 0;
    int second =1;
    int sum = 0;

    for(int r = 1; r<=row; r++)
    {
      for(int c = 1; c<= r; c++)
      {
        if( r == 1)
          sum = 0;
        else
          sum = first + second;

        System.out.print(sum + " ");
        first = second;
        second = sum;
      }
      System.out.println();
    }
  }

  public static void pattern13(int row) // pascal triangle
  {

    for( int n = 0; n<row; n++)
    {
      int val =1;
      for (int r = 0; r<=n; r++)
      {
        System.out.print(val + " ");
        val = ((n-r) * val)/ (r+1) ;

      }
    }
  }

  public static void pattern16_1(int row)
  {
    int nst = 1;
    int nsp = 2*row -3;

    for(int r = 1; r<= row; r++)
    {
      for(int cst = 1; cst <=nst; cst++)
      {
        System.out.print("* ");
      }

      for(int csp = 1; csp <= nsp; csp++)
      {
        System.out.print("  ");
      }
      if(r == row)
      {
        nst--;
      }
      for(int cst = 1; cst<= nst; cst++)
      {
        System.out.print("* ");
      }

      nsp-=2;
      nst++;
      System.out.println();
    }
  }  

  public static void pattern16(int row)
  {
    int nst = 1;
    int nsp = 2*row -3;

    for(int r = 1; r<= row; r++)
    { int val =1;
      for(int cst = 1; cst <=nst; cst++)
      {
        System.out.print(val + " ");
        val++;
      }

      for(int csp = 1; csp <= nsp; csp++)
      {
        System.out.print("  ");
      }
      if(r == row)
      {
        nst--;
        val--;
      }
      for(int cst = 1; cst<= nst; cst++)
      {
        val--;
        System.out.print(val + " ");
      }

      nsp-=2;
      nst++;
      System.out.println();
    }
  }

   public static void pattern17(int row)
   {
    int nst =1;
    int nsp = row/2;
    for(int r = 1; r<=row; r++)
    {
      for(int csp = 1; csp <=nsp; csp++ )
      {
        if(r != row/2+1)
        {
          System.out.print("  ");
        }
        else
        {
          System.out.print("* ");
        }
      }

      for(int cst = 1; cst <= nst; cst++)
      {
        System.out.print("* ");
      }

      if(r<=row/2)
        nst++;
      else
        nst--;

      System.out.println();  
    }
    

  }
  

  public static void pattern18(int row) // hourglass
  {
    int nst = row;
    int nsp = 0;
    for(int r = 1; r<=row; r++)
    {
      for(int csp = 1; csp<= nsp; csp++)
      {
        System.out.print(" ");
      }

      for(int cst = 1; cst<= nst; cst++)
      {
        if(r>1 && r<=row/2 && cst > 1 && cst < nst)
        {
          System.out.print(" ");
        }
        else
        System.out.print("*");
      }

      if( r<= row/2)
      {
        nsp++;
        nst-=2;
      }
      else
      {
        nsp--;
        nst+=2;
      }
      System.out.println();
    }
  }

  public static void pattern19(int row)
  {
    for(int r = 1; r<= row; r++)
    {
      for(int c = 1; c<= row; c++)
      {
        if( r == 1)
        {
          if(c <= row/2 +1 || c == row)
          {
            System.out.print("*");
          }
          else
            System.out.print(" ");
        }    

        if( r <= row/2)
      {
        if(c == row/2 + 1)
          System.out.print("*");
        else
          System.out.print(" ");
      }

        if( r == row/2+1)
        {
            System.out.print("*");
        }

        if( r < row)
        {
          if(c == 1 || c == row/2 +1)
          {
            System.out.print("*");
          }
          else
            System.out.print(" ");
        }

        if( r == row)
        {
          if(c == 1 || c>= row/2+1)
            System.out.print("*");
          else
            System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void pattern20(int row) // print w
  {
    for ( int r = 1; r<= row; r++)
    {
      for( int c = 1; c <= row; c++)
      {
          if(c == 1 || c == row)
            System.out.print("*");

          else if(r >row/2 && (c == r || c == row-r+1))
            System.out.print("*");

          else
            System.out.print(" ");
      }
      System.out.println();
    }
  }

 

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    //print_square(5);
    //print_triangle(5);
    //print_mirror_triangle(5);
    //inverted_triangle(5);
    //inverted_mirror_triangle(5);
    // print_Diamond(7);
    //empty_Diamond(5);
    //print_number_Diamond(5);
    //print_number_pattern15(5);
    //print_right_diagonal(5);
    //print_left_diagonal(5);
    //print_cross(5);
    // new_pattern_diamond_boundry(11);
    //diamond_boundry(7);
    //pattern11(5);
    //pattern12(5);
    //pattern16_1(4);
    // pattern16(4);
    //pattern17(5);
    //pattern18(7);
    //pattern19(7);
    pattern20(7);

  }
}  
