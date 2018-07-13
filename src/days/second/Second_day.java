package days.second;

/**
 * Created by Baltramiejus Jakstys on 2018-07-13.
 */
public class Second_day {
    public static void main(String[] args) {
        String palindrome = "KOL EINU ŠUNIE LOK".replaceAll(" ", "");

        //boolean temp = isPalindrome(palindrome);
        //boolean test = 10 < 40;

        if (isPalindrome(palindrome)) {
            System.out.println("Polindromas");
        } else {
            System.out.println("Ne polindromas");
        }
    }

    private static boolean isPalindrome(String palindrome) {
        boolean result = true;
        for (int i = 0; i < palindrome.length(); i++) {
            char a = palindrome.charAt(i);
            char b = palindrome.charAt(palindrome.length() - i - 1);
            if (a != b) {
                result = false;
                break;
            }
        }
        return result;
    }


}
