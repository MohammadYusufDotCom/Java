public class reversWordsOfString {
    public static void main(String[] args){
        String str = "welcome to java world vs JavaScript";
        String revStr="";
        String revArray[] = str.split(" ");
        for (int i = revArray.length-1;i>=0;i--  ){
            revStr = revStr.concat(revArray[i]);
        }
        System.out.println(revStr);
    }   
}
