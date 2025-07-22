package recursion.medium;

public class DiceRollLeetcode {
    static int generateSum(String p, int target, int n, int k) {
        if (target == 0 && n == 0) {
            System.out.println(p);  // to print the valid combination path
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i <= k && i <= target; i++) {
            count = (count + generateSum(p + i, target - i, n - 1, k)) % 1_000_000_007;
        }
        return count;
    }

    public static int numRollsToTarget(int n, int k, int target) {
        return generateSum("", target, n, k);
    }

    public static void main(String[] args) {
        System.out.println(numRollsToTarget(2,6,7));
    }
}
