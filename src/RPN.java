import java.util.Stack;

public class RPN {

    public static String reverseString(String expr) {
        if (expr == null)
            return null;
        char[] in = expr.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder out = new StringBuilder();

        for (char c : in)
            switch (c) {
                case '+':
                case '-':
                    while (!stack.empty() && (stack.peek() == '*' || stack.peek() == '/')) {
                        out.append(' ');
                        out.append(stack.pop());
                    }
                    out.append(' ');
                    stack.push(c);
                    break;
                case '*':
                case '/':
                    out.append(' ');
                    stack.push(c);
                    break;
                default:
                    out.append(c);
                    break;
            }

        while (!stack.empty())
            out.append(' ').append(stack.pop());

        return out.toString();
    }

}
