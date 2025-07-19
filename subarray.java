import java.util.*;
public class subarray {
    public static void subarr(int arr[]) {
        int[] presum = new int[arr.length];
        presum[0] = arr[0];
        int prefix = 0;
        for(int i=1; i<arr.length; i++) {
            prefix = prefix + arr[i];
            presum[i] = prefix;
        }
        int sum=0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print("(" + arr[k] + ")");
                    sum= sum + arr[k];
                }
                System.out.println("their Sum :" + sum );
            }
        }
        if(maxsum<sum) {
            maxsum = sum;
        }
        System.out.println("maximum sum of subarray is " + maxsum);
    }
    public static void main(String args[]) {
        int[] arr = {2,3,4,5,6,7,8,9};
        subarr(arr);
    }
}