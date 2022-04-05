# Challenge Summary 
Multi-bracket Validation:
Write a function called validate brackets
- Arguments: string
- Return: boolean
  - representing whether or not the brackets in the string are balanced
- Three types of brackets:
  - Round brackets: ()
  - Square brackets: []
  - Curly Brackets: {}

## Whiteboard Process
![image](../code-challenge-whiteboards/code-challenge-13.png)

## Approach & Efficiency
Bracket Validator is a class which contains the method validator, which takes a string as an argument and returns a boolean if the string has valid bracket syntax. 
The method uses a for loop to iterate over the individual characters of the input string and pushes frames onto the stack if the character is a type of opening bracket with a value of its respective closing bracket.
If a character in the string matches the top frame value of the stack, the frame is then popped off the stack.
Outside of the for loop, if the stack is empty then we return true, otherwise return false.

Time complexity of the algorithm is O(n), as we iterate through the string one char at a time.
## Solution
```     public boolean validator(String string) {
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
```
