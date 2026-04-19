package com.sunbeam;
import java.util.*;

public class PrefixEval {
    public static int evaluatePrefix(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                int a = stack.pop();
                int b = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
}