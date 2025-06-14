package BitManipulationCodes.Intermediate.geeksforgeeksSolutions;

import java.util.Scanner;

public class GetSetClear1basedIndexing {
    static int getTheIthBit(int number,int i)
    {
        return (number&(1<<i-1))!=0?1:0;
    }
    static int setTheIthBit(int number,int i)
    {
        return (number|(1<<i-1));
    }
    static int clearTheIthBit(int number,int i)
    {
        return (number&(~(1<<i-1)));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = scan.nextInt();
        int value1 = getTheIthBit(n,i);
        System.out.println("ith bit value->"+value1);
        int value2 = setTheIthBit(n,i);
        System.out.println("After setting the ith bit value->"+value2);
        int value3 = clearTheIthBit(n,i);
        System.out.println("After clearing the ith bit value->"+value3);
    }
}
