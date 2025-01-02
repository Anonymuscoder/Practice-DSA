//code for finding if there are any two elements in the array whose sum is equal to the target sum.

class FindPairOfGivenSum {
    
    public static int[] findPair(int[]arr, int target){
        int[] temp = new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    temp[0] = arr[i];
                    temp[1] = arr[j];
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 8};
        int target = 6;

        int[] result = findPair(arr, target);
        for(int i=0 ; i<result.length; i++){
            System.out.print(result[i]);
        }
    }
}
