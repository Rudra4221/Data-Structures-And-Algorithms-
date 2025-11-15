
public class Substring {

    public static String subString(String str, int si, int ei) {

        String sub = "";

        for (int i = si; i < ei; i++) {
            sub += str.charAt(i);
        }

        return sub;

    }

    public static void main(String[] args) {

        String str = "Rudra Patel";

        System.out.println(subString(str, 2, 6));

    }
}
