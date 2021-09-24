import java.util.Stack;

public class ReverseString {

    public static String reverse(String data) {
        Stack<Character> stack = new Stack<>();

        char[] chars = data.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String reversed = reverse("ABCD");
        System.out.println("reversed string is " + reversed);
    }
}
