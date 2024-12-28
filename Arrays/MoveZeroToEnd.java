//code for moving zeros to the end of the array

import java.util.Scanner;

class MoveZeroToEnd {

    public static void moveZerosToEnd(int[]arr){
        int sp = 0;
        int ep = arr.length-1;
        while(sp<=ep){ //main logic
            if(arr[sp]==0){
                int temp = arr[sp];
                arr[sp] = arr[ep];
                arr[ep] = temp;
                ep--;
            }
            else {
                sp++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter element");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Moving Zeros");
        moveZerosToEnd(arr);
        System.out.println("After moving zeros");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }

        sc.close();
    }
}
