//code for returning sum of elements in a array

import java.util.Scanner;

class SumOfArray{

    public static int sum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0 ;i<nums.length; i++){
            nums[i]=sc.nextInt();
        }

        int r = sum(nums);
        System.out.println(r);

        sc.close();
    }
}