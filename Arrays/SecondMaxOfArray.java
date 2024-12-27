//code for finding second largest element in a array

import java.util.*;

class SecondMaxOfArray {
    public static int secondLarge(int[] arr) {
        int n = arr.length - 1;
        int secondMax = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        secondMax = arr[n-1];
        return secondMax;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println();
        int result = secondLarge(num);
        System.out.println();
        System.out.println(result);

        sc.close();
    }

}