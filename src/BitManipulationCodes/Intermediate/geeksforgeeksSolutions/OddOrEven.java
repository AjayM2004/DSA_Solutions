package BitManipulationCodes.Intermediate.geeksforgeeksSolutions;

import java.util.Scanner;

public class OddOrEven {
    static String findOddOrEven(int n)
    {
        if((n&1)==1)
        {
            return "given no is odd";
        }
        else
        {
            return "given no is even";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n ->");
        int n = scan.nextInt();
        System.out.println(findOddOrEven(n));
    }
}
