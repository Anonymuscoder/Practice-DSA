// code for rescursively checking if a string is palindrome or not

class practice15{

    public static boolean isPalindrome(String str){
        int e = str.length() -1;
        int s = 0;
        return isPalindrome(str, s, e);
    }
    public static boolean isPalindrome(String str, int s, int e){
        if(s>=e){
            return true;
        }
        if(str.charAt(s)==str.charAt(e)){
            boolean temp = isPalindrome(str, s+1, e-1);
            return temp;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result = isPalindrome("aabbaa");
        System.out.println(result);
    }
}