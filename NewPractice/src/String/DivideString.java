package String;

public class DivideString {
    public static void main(String[] args) {
        String str = "abcdef";
        int k = 3; // number of parts
        divideString(str, k, 0, new String[k], 0);

    }
    static void divideString(String str, int k, int index, String[] parts, int partIndex) {
        if (partIndex == k) {
            if (index == str.length()) {
                for (String part : parts) {
                    System.out.print(part + " ");
                }
                System.out.println();
            }
            return;
        }

        for (int i = index + 1; i <= str.length() - (k - partIndex - 1); i++) {
            parts[partIndex] = str.substring(index, i);
            System.out.println(i);
            divideString(str, k, i, parts, partIndex + 1);
        }
    }
}
