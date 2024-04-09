public class reversfullstring {
    public static void main(String[] args) {
        String str = "welcome to the java world";
        String revStr = "";
        int len = str.length();
        for (int i =len;i>0;i--){
        len--;
        Character revChar =  str.charAt(len);
        revStr = revStr + revChar;
        }
        System.out.println(revStr);
    }
}
