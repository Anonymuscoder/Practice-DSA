//code for replacing the blank spaces with the underscore in a String
class ReplaceBlank {

    public static String replaceBlack (String str){
        char[] ch = str.toCharArray();
        int n = ch.length-1;

        for(int i=0; i<n; i++){
            if(ch[i]==' '){
                ch[i] = '_';
            }
        }

        String result = String.valueOf(ch);
        return result;
    }

    public static void main(String[] args) {
        String str = "a ve t re";
        String result = replaceBlack(str);
        System.out.println(result);
    }
}
