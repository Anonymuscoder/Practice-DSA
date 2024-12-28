//code for checking if an array is sorted or not

import java.util.Scanner;

class IsSorted {
    
    public static boolean checkSort(int[] arr){
        int n = arr.length-1;
        for(int i=0;  i<n; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        } 
        return true;
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

        boolean sort = checkSort(arr);
        System.out.println(sort);

        sc.close();
    }
}


