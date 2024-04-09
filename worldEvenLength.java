public class worldEvenLength {
    public static void main(String[] args) {
        String str = "Hello word is here for you";
        String[] s = str.split(" ");
     for ( String a : s){
        if(a.length()%2 ==0){
            System.out.println(a);
        }
    }
    }
}
//Lion