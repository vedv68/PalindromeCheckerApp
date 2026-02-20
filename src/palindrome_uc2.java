public class palindrome_uc2 {
    private palindrome_uc2() {
    }
        public static void main(String[] args) {
        System.out.println("UC2 - Hardcoded Palindrome Check");
        System.out.println("--------------RA642--------------");
        String word = "maLAYALam";
        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
        System.out.println("Program Ended");
    }
}