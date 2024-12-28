

import java.util.Scanner;

public class table {
    public static void main (String[] arag) {

      Scanner cs = new Scanner(System.in);
      System.out.println("Enter the value");
      int a = cs.nextInt();

      System.out.println("Enter the value of multiple");
      int n = cs.nextInt();
     
      cs.close();

      for(int i=1;i<=n;i++)
       {
        int ans=i*a;
        System.out.println(i + "x" + a + "=" + ans);
      }
      
      // int b = (1 * a)
      // int c = (2 * a)
      // int d = (3 * a)
      // int e = (4 * a)
      // int f = (5* a)
      // int g = (6 * a)
      // int h = (7 * a)
      // int i = (8 * a)
      // int j = (9 * a)
      // int k = (10 * a)

      // System.out.println(" 1 x " + a + " = " + b)
      // System.out.println(" 2 x " + a + " = " + c)
      // System.out.println(" 3 x " + a + " = " + d)
      // System.out.println(" 4 x " + a + " = " + e)
      // System.out.println(" 5 x " + a + " = " + f)
      // System.out.println(" 6 x " + a + " = " + g)
      // System.out.println(" 7 x " + a + " = " + h)
      // System.out.println(" 8 x " + a + " = " + i)
      // System.out.println(" 9 x " + a + " = " + j)
      // System.out.println("10 x " + a + " = " + k)
    }
}
     