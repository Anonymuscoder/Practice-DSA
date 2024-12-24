//Write a recursive function to calculate the sum of digits of a number.
class practice13 {
    
    public static int sumOfDigits(int n){
        if(n==0){return 0;}

        int temp = n%10; //taking out last digit
        int temp1 = sumOfDigits(n/10); //sending first remaining digit, except last digit

        return temp+temp1;
    }

    public static void main(String[] args) {
        int result = sumOfDigits(323);
        System.out.println(result);
    }
}
