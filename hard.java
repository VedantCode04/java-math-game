package hardMath;
import java.util.*;
public class hard {
    public static int score = 0;
    static String expr = "";
    static String getOperator()
    {
        Random rd = new Random();
        int n = Math.abs(rd.nextInt(5));
        if (n == 0) {
            return "+";
        } else if (n == 1) {
            return "-";
        } else if (n == 2) {
            return "/";
        } else if (n == 3) {
            return "*";
        } else {
            return "^";
        }
    }

    public static void expression() throws Exception
    {
        expr = "";
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n = Math.abs(rd.nextInt(3)) + 4;
        int countExponent = 0;
        for (int i = 0; i < n; ++i) {
            int rand = Math.abs(rd.nextInt(10));
            if (i == n - 1) {
                expr = expr + Integer.toString(rand);
            } else {
                String o = getOperator();

                if (o.equals("^")) {
                    countExponent++;
                    expr = expr + Integer.toString(rd.nextInt(5) + 1) + " " + o + " ";
                } else if (expr.length() >= 4 && expr.charAt(expr.length() - 1) == '^') {
                    expr = expr + Integer.toString(rd.nextInt(5) + 1) + " " + o + " ";
                } else {
                    expr = expr + Integer.toString(rand) + " " + o + " ";
                }
            }
        }
        System.out.print(expr + " = ");
        double x = sc.nextDouble();

        expr = infixToPostfix(expr);

        double solution = evalString(expr);

        if (solution == x) {
            score = score + 10;
            System.out.println("correct. SCORE = " + score);
        } else {
            score = score - 5;
            System.out.println("Incorrect. Correct answer is " + solution + " SCORE = " + score);
        }
    }

    static double evalString(String expr) throws Exception
    {
        double ans = 0;
        Stack<Double> operands = new Stack<>();

        for (int i = 0; i < expr.length(); ++i) {
            char c = expr.charAt(i);

            if (isOperator(c)) {
                Double y = operands.pop();
                Double x = operands.pop();

                if (c == '+') {
                    x = x + y;
                } else if (c == '-') {
                    x = x - y;
                } else if (c == '/') {
                    x = x / y;
                } else if (c == '*') {
                    x = x * y;
                } else {
                    x = Math.pow(x, y);
                }

                operands.push(x);

            } else {
                double j = Double.parseDouble(String.valueOf(c));
                operands.push(j);
            }
        }

        ans = operands.pop();

        ans = Math.round(ans * 100D) / 100D;
        return ans;
    }

    static boolean isOperator(char c)
    {
        if (c == '+' || c == '-' || c == '/' || c == '*' || c == '^') {
            return true;
        }

        return false;
    }

    public static String infixToPostfix(String infix)
    {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        Map<Character, Integer> precedence = new HashMap<>();
        precedence.put('+', 1);
        precedence.put('-', 1);
        precedence.put('*', 2);
        precedence.put('/', 2);
        precedence.put('^', 3);

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if (Character.isDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    throw new IllegalArgumentException("Invalid infix string");
                }
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                while (!stack.isEmpty() && stack.peek() != '(' && precedence.get(stack.peek()) >= precedence.get(c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(' || stack.peek() == ')') {
                throw new IllegalArgumentException("Invalid infix string");
            }
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static int getScore()
    {
        return score;
    }
}