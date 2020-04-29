import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of integers you wish to enter: ");
    int num = in.nextInt();
    List<Integer> list = new ArrayList<Integer>();

    int modeCount = 0;
    int modeInteger = 0; 

    while (num > 0){
      System.out.print("Enter the interger: ");
      int integer = in.nextInt();
      list.add(integer);
      num -= 1;
    }

    for (int i : list){
      int count = 0;
      for (int n : list){
        if(i == n){
          count += 1;
        }
      }
      if(count > modeCount){
        modeCount = count;
        modeInteger = i; 
      }
    }
    System.out.println("The mode is: " + modeInteger);
  }
}
