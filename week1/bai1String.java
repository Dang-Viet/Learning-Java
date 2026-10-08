/*import java.util.Scanner;

public class bai1String {
    public static int findMax(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int findMin(int[] nums){
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }

    public static int sum(int[] nums){
    int sum=0;
        for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        }
        return sum;
    }

    public static double average(int[] nums){
     return (double)sum(nums)/nums.length;
    }

    public static void main(String[] args) {
        int[] nums={5,3,8,1};
        System.out.println("Max: "+findMax(nums));
        System.out.println("Min: "+findMin(nums));
        System.out.println("Sum: "+sum(nums));
        System.out.printf("Average: %.2f",average(nums));

    }
}*/
