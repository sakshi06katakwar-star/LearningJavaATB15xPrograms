import java.util.Scanner;
import java.util.Stack;

public class Task16_ValidParentheses {
    //Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
    // determine if the input string is valid.
    public static void main(String[] args) {
        //We solve it using Stack (LIFO – Last In First Out).
        //Problem Understanding -
        //A string is valid if:
        //Open brackets must be closed by the same type.
        //Open brackets must be closed in correct order.
        //Every closing bracket must have a matching opening bracket.
        //✔ Valid Examples:
        //"()"
        //"()[]{}"
        //"{[]}"
        //❌ Invalid Examples:
        //"(]"
        //"([)]"
        //"((("
        //Related Stack Methods
        //Method	Meaning
        //push()	Add element to top
        //pop()	Remove top element
        //peek()	View top element
        //isEmpty()	Check if stack is empty
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brackets string");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for(int i =0; i<str.length(); i++) {
            char ch = str.charAt(i);  //This line is used to access each character of the string one by one
            //If opening bracket → push to stack
            if(ch=='(' || ch=='{' || ch=='[') {
                stack.push(ch);
            }
            // If closing bracket
            else {
                if(stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                char top = stack.pop();
                if((ch==')' && top !='(') || (ch=='}' && top !='{') || (ch==']' && top !='[')) {
                    isValid = false;
                    break;
                }
            }
        }
        if(!stack.isEmpty()) {
            isValid = false;
        }
        if (isValid)
            System.out.println("Valid String");
        else
            System.out.println("Invalid String");

        sc.close();
    }
}
