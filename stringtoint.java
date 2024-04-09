public class stringtoint {
    public static void main(String[] args) {
        String str1 = "111";
        String str2 = "2222";
        Integer sum = Integer.parseInt(str1) +Integer.parseInt(str2);
        System.out.println(sum.toString() instanceof String);
    }
}
