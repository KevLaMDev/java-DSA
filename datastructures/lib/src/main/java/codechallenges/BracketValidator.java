package codechallenges;


import java.util.Stack;

public class BracketValidator {

    public boolean validator(String string) {
        Stack stack = new Stack();
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar == '(') stack.push(')');
            else if (currentChar == '{') stack.push('}');
            else if (currentChar == '[') stack.push(']');
            else if (!stack.empty()) {
                char topValue = (char) stack.peek();
                if (currentChar == topValue) stack.pop();
            }
        }
        if (stack.empty()) return true;
        return false;
    }
}
