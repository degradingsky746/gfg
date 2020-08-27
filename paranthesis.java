// Java program for checking
// balanced Parenthesis
import java.util.*;

public class paranthesis {

	// function to check if paranthesis are balanced
	static boolean areParanthesisBalanced(String expr)
	{
		// Using ArrayDeque is faster than using Stack class
		Deque<Character> stack = new ArrayDeque<Character>();

		// Traversing the Expression
		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);
      char t;

			if (x == '(' || x == '[' || x == '{') {
				// Push the element in the stack
				stack.push(x);
				continue;
			}

			// IF current current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (stack.isEmpty())
				return false;

			switch (x) {
			case ')':
				t=stack.pop();
				if (t == '{' || t == '[')
					return false;
				break;

			case '}':
				t=stack.pop();
				if (t == '(' || t == '[')
					return false;
				break;

			case ']':
				t=stack.pop();
				if (t == '(' || t == '{')
					return false;
				break;
			}
		}

		// Check Empty Stack
		return (stack.isEmpty());
	}

	/*driver program to test above functions*/
	public static void main(String[] args)
	{
		String expr = "[(])";
		if (areParanthesisBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
