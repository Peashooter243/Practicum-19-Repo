// Code for Practicum 19 (Arrays in Java)
// (TO COMPLETE)
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int sum;
    double avg1, avg2;
    
    Scanner input = new Scanner(System.in);
    
    // declare an array of integers called nums of size 100
    // (to complete)
    int[] nums = new int[100];
   

    // create a for loop that populates array nums such that
    // the first element is 100, the second element 101, etc.
    // (to complete)
    for(int i = 0; i < nums.length; i++)
    {
      nums[i] = 100 + i;
    }
    
    
    // use a for loop to determine the average of all of the
    // values in array nums and assigns to variable avg1
    // (to complete)
    sum = 0;
    for(int i = 0; i < nums.length; i++)
    {
      sum = sum + nums[i];
    }
    avg1 = sum / nums.length;

    // use a for loop to add 5 to every elements in array nums
    // (to complete)
    for(int i = 0; i < nums.length; i++)
    {
      nums[i] = nums[i] + 5;
    }
    
    // use a for loop to determine the average of all of the
    // values in array nums and assigns to variable avg2
    // (to complete)
    sum = 0;
    for(int i = 0; i < nums.length; i++)
    {
      sum = sum + nums[i];
    }
    avg2 = sum / nums.length;

    // display results
    System.out.println("avg1 = " + avg1);
    System.out.println("avg2 = " + avg2);
    
  }
}