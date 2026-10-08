/*public class StringReverser {
    //cach 1 StringBuilder
    public static String reverse(String text) {
        if (text == null || text.length() == 0) {
            return text;
        }
        StringBuilder result = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }
    //cach 2 dung char[]
    public static String reverse2(String text) {
        if (text == null || text.length() == 0) {
            return text;
        }
        char[] result=new char[text.length()];
        for(int i=text.length()-1;i>=0;i--){
            result[text.length()-i-1]=text.charAt(i);
        }
        return new String(result);
    }
    public static void main(String[] args) {
        System.out.println(reverse2("Java"));
        System.out.println(reverse(""));
        System.out.println(reverse("a"));
    }

}*/
