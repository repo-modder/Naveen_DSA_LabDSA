package com.gl.service;

import java.util.Stack;

public class BracketsServiceImpl implements BracketsService {

	private final String openBrackets = "{([<";
	private final String closeBrackets = "})]>";

	@Override
	public boolean isBalanced(String str) {
		if (str.isEmpty())
			return true;
		Stack<String> stack = new Stack<>();
		String[] arrOfStr = str.split("");
		for (String ch : arrOfStr) {

			if (openBrackets.contains(ch)) {
				stack.push(ch);
			} else if (closeBrackets.contains(ch)) {
				if (stack.isEmpty())
					return false;
				String top = stack.pop();
				switch (top) {
				case "{":
					if (ch.equals("}"))
						continue;
				case "(":
					if (ch.equals(")"))
						continue;
				case "[":
					if (ch.equals("]"))
						continue;
				case "<":
					if (ch.equals(">"))
						continue;
				default:
					return false;
				}
			} else
				continue;
		}
		return stack.isEmpty();
	}

}
