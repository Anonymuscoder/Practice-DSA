//code for rotating an array

class RotateArray {

    public static void rotate(int[] arr, int s, int e){
        int sp = s;
        int ep = e;
        while(sp<=ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 5};
        int k=3;
        rotate(arr, 0, arr.length-1); //reverse whole array
        rotate(arr, 0, k-1); // reverse first k terms
        rotate(arr, k, arr.length-1); // reverse k to n-1 terms
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }   
}
