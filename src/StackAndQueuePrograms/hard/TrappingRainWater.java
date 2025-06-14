package StackAndQueuePrograms.hard;
public class TrappingRainWater {

    public static int trap(int[] height) {
        int n = height.length;
        int[] suffixMax = new int[n];
        suffixMax[n - 1] = height[n - 1];
        //finding suffixMax values
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(height[i], suffixMax[i + 1]);
        }
        int total = 0;
        int prefixMax = height[0];
        for (int i = 1; i < n; i++) {
            prefixMax = Math.max(prefixMax, height[i]);
            if (height[i] < prefixMax && height[i] < suffixMax[i]) {
                total += (Math.min(prefixMax, suffixMax[i]) - height[i]);
            }
        }
        return total;
    }
        public static void main(String[] args)
        {
            int[] arr =  {3, 0, 1, 0, 4, 0,2};
            System.out.println("OUTPUT->"+trap(arr));
        }
}
