/*public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String text=str.toLowerCase();
        int l = 0;
        int r = text.length() - 1;
        while (l < r) {
            if (text.charAt(l) != text.charAt(r)) {
                return false;
            }
            l++;
            r--;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));   // true
        System.out.println(isPalindrome("abba"));    // true
        System.out.println(isPalindrome("java"));    // false
        System.out.println(isPalindrome("a"));       // true
        System.out.println(isPalindrome(""));        // true
        System.out.println(isPalindrome("Level"));   // true
    }
}*/
