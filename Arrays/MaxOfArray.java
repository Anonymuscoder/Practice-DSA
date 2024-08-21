//code for returning maximum number in a array

import java.util.Scanner;

public class MaxOfArray {
    public static int max(int[] arr){
        int m = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>m){
                m = arr[i];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] nums = new int[n];
        for(int i=0 ;i<nums.length; i++){
            nums[i]=sc.nextInt();
        }
        int r = max(nums);
        System.out.println(r);

        sc.close();

    }
}
