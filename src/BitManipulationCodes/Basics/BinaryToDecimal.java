package BitManipulationCodes.Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BinaryToDecimal {
    static int binaryToDecimal(String binary)
    {  int num = 0;
        int n = binary.length();
        int value = 1;
        for(int i=n-1;i>=0;i--)
        {
            if(binary.charAt(i)=='1')
            {
                num+=value;
            }
            value*=2;
        }
       return  num;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the binary value::");
        String string = scan.nextLine();
        System.out.println("Decimal value of "+string+" is :"+binaryToDecimal(string));
    }
}
