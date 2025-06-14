package BitManipulationCodes.Basics;

import java.sql.SQLOutput;
import java.util.*;

public class CovertDecimalToBinary
{
    static String convertToBinary(int num)
    {
        int temp = num;
        String binary = "";
        while(temp!=0)
        {
            if((temp&1)==1)
            {
                binary+="1";
            }
            else{
                binary+="0";
            }
            temp = temp>>1;
        }
        binary = new StringBuilder(binary).reverse().toString();
        return binary;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(convertToBinary(n));
    }
}
