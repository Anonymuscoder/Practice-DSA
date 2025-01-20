//code for checking if a string is palindrome or not

class CheckPalindrome {
    
    public static boolean checkPalindrome(String str){
        String str1 = str.toUpperCase();
        char[] ch = str1.toCharArray();
        int sp = 0;
        int ep = ch.length-1;
        boolean temp = false;

        while(sp <= ep){
            if(ch[sp]==ch[ep]){
                temp = true;
                sp++;
                ep--;
            }else{
                temp = false;
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String str = "merm";
        boolean result = checkPalindrome(str);
        System.out.println(result);
    }
}
