package inter;

import java.util.*;

/**
 * Parentheses balance checker
 * 
 * @author skh
 *
 */

class ParenthesesChecker {

	public static void clearSt(Stack<Character> st) {
		while (!st.empty()) {
			st.pop();
		}
	}

	static void checkParentheses(String input) {

		boolean balanced = true;
		int i = 0;
		char c;

		Stack<Character> st = new Stack<Character>();

		while (i < input.length()) {
			c = input.charAt(i);
			if (c == '[' || c == '{' || c == '(')
				st.push(c);
			else {
				if (st.empty()) {
					balanced = false;
					break;
				} else if (c == ']' && (char) st.peek() == '[')
					st.pop();
				else if (c == '}' && (char) st.peek() == '{')
					st.pop();
				else if (c == ')' && (char) st.peek() == '(')
					st.pop();

			}
			i++;
		}
		i = 0;
		if (st.empty() && balanced) {
			System.out.println("true");
		} else {
			System.out.println("false");
			clearSt(st);
		}
		balanced = true;
	}

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();

			checkParentheses(input);

		}
		sc.close();

	}
}
