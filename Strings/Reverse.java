//Reverse a given String without using built-in methods.
class Reverse {
    public static String reverse(String str){

        char[] ch = str.toCharArray();
        int sp=0;
        int ep=ch.length-1;
        while(sp<ep){
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] = temp;
            sp++;
            ep--;
        } 
        String result = String.valueOf(ch);
        return result;
       
    }

    public static void main(String[] args) {
        String str = "Adventure";
        String result = reverse(str);
        System.out.println(result);
    }
}
