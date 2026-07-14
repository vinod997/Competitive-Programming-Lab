//hi
import java.util.*;
public class maxSubArraySum {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,n=nums.length;
        for(int i=0;i<nums.length;i++){ 
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum > max) max=sum;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        maxSubArraySum obj = new maxSubArraySum();
        System.out.println(obj.maxSubArray(nums));
    }
}