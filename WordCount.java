import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        
        String str = sc.nextLine();
        int count = countNumberOfWord(str);
    System.out.println("word are:"+count);
    }
//welcome to java
    private static int countNumberOfWord(String str) {
        int count = 0;
        if (str.charAt(0)!= ' '){
            count++;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) ==' ' &&str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }

}
