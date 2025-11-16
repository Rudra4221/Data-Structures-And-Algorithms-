// compareTo is a inbuilt function that helps compare two string, in lexigraphically order.

public class LargestString {

    public static void main(String[] args) {

        String str[] = { "Apple", "Mango", "Pinaple" };

        String large = str[0];

        for (int i = 1; i < str.length; i++) {
            if (large.compareTo(str[i]) < 0) {
                large = str[i];
            }
        }

        System.out.println(large);
    }
}
