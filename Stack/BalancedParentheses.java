package Stack;

import java.util.Stack;

class BalancedParentheses {
    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) return false;
            }
        }
        return stack.isEmpty();
    }
    public class Main {
        public static void main(String[] args) {
            System.out.println(BalancedParentheses.isBalanced("{[()]}"));
            System.out.println(BalancedParentheses.isBalanced("{[(])}")); 
            System.out.println(BalancedParentheses.isBalanced("(){}[]")); 
        }
    }
    
}
