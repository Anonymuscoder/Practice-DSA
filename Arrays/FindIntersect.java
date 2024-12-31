//code for finding the Intersection of two arrays

class FindIntersect{

    public static int[] intersect(int [] arr, int [] arr1){ //logic
        int n = 0;
        if(arr.length > arr1.length){
            n = arr.length - 1;
        }else{
            n = arr1.length-1;
        } // setting value for the n which will be length of new array
        int[] temp = new int[n]; //created a temp array
        int sp = 0; //start pointer for temp array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr[i] == arr1[j]){ // in arr[i]=arr[j]
                    boolean isAdded = false; //create a boolean value isAdded to determine if the element is already added
                    for(int k=0; k<sp; k++){ //traverse the temp array and check if arr[i] element is already present or not
                        if(temp[k]==arr[i]){ 
                            isAdded = true; //if yes then make true and break the loop and go to next iteration
                            break; 
                        }
                    }
                    if(!isAdded){ //if not them add element in temp array at the temp[sp] position
                        temp[sp]=arr[i];
                        sp++; //increment sp
                    }
                }
            }
        }
        //resize the final resulting array to the size of array gathered in temp
        int [] result = new int[sp]; //length of sp because no. of items in temp is in relation to the count of sp
        for(int i=0; i<sp; i++){ 
            result[i] = temp[i]; //push elements
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,8,5,6};
        int[] arr1 = {9,12,2,8,6};

        int rarr[] = intersect(arr, arr1);
        System.out.print("[");
        for(int i=0; i<rarr.length; i++){
            System.out.print(rarr[i]);
        }
        System.out.println("]");
    }
}