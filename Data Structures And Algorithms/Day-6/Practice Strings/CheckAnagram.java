import java.util.Arrays;

public class CheckAnagram {

    public static void isAnagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean hero = Arrays.equals(ch1, ch2);

            if (hero) {
                System.out.println("Is Anagram");
            } else {
                System.out.println("Is not Anagram");
            }
        } else {
            System.out.println("Is not Anagram");
        }

    }

    public static void main(String[] args) {

        String str1 = "Race";
        String str2 = "Csre";

        isAnagram(str1, str2);
    }
}
