import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    Scanner in = new Scanner(System.in);
    System.out.print("Enter interger: ");
    int num = in.nextInt();
    while(num > 0){
      String p = "";
      for (int x = 1; x <= num; x +=1){
        p += "*";
      }
      System.out.println(p);
      num -= 1;
    }
  }
}
