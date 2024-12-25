//code for reversing a string using recurrsion

class practice14 {
    
    public static String reverse (String str){
        if(str.length()<= 1){
            return str;
        }

        String rev = reverse(str.substring(1))+str.charAt(0);
        return rev;
    }

    public static void main(String[] args) {
        String str = "Hello";
        String result = reverse(str);

        System.out.println(result);
    }
}
