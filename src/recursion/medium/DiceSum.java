package recursion.medium;

public class DiceSum {
    static void generateSum(String p,int target)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++)
        {
            generateSum(p+i,target-i);
        }
    }
    public static void main(String[] args) {
        generateSum("",4);
    }
}
