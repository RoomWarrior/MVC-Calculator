import java.util.Stack;

public class PostfixCalculator {

    private static final String ADD = "+";
    private static final String SUBTRACT = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    public double calculate(String expr) {
        Stack<Double> stack = new Stack<>();
        String[] input = expr.split(" ");

        return handleCalculation(stack, input);
    }

    private static double handleCalculation(Stack<Double> stack, String[] postfixExpr) {
        double leftValue, rightValue;

        for (String s : postfixExpr) {
            if (s.equals(ADD) || s.equals(SUBTRACT)
                    || s.equals(MULTIPLY) || s.equals(DIVIDE)) {
                rightValue = stack.pop();
                leftValue = stack.pop();
                switch (s) {
                    case ADD: {
                        double local = leftValue + rightValue;
                        stack.push(local);
                        break;
                    }

                    case SUBTRACT: {
                        double local = leftValue - rightValue;
                        stack.push(local);
                        break;
                    }

                    case MULTIPLY: {
                        double local = leftValue * rightValue;
                        stack.push(local);
                        break;
                    }

                    case DIVIDE: {
                        double local = leftValue / rightValue;
                        stack.push(local);
                        break;
                    }
                }
            } else {
                stack.push(Double.parseDouble(s));
            }
        }
        return stack.pop();
    }
}
