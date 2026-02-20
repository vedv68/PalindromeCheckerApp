public class palindrome_uc1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("----------------RA642---------------");
        String word = "MalayalaM";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}