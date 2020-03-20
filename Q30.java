//Evaluate the given expression using stack
package com.tgt.igniteplus;
import java.util.Scanner;
import java.util.Stack;
import java.lang.String;

public class Q30
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter expression:");
        String exp = in.nextLine();
        Q30 i = new Q30();
        System.out.println("After evaluation=  " + i.getValue(exp));
    }

    public int getValue(String expression)
    {
        if (expression == null || expression.length() == 0) return 0;
        Stack<Character> OptrStack = new Stack();
        Stack<Integer> OpndStack = new Stack<>();
        int digit = 0;
        for (int i = 0; i < expression.length(); i++)
        {
            char c = expression.charAt(i);
            if (c == ' ')
                continue;
            else if (Character.isDigit(c))
            {
                digit = c - '0';  //convert character c to integer
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1)))
                {
                    digit = digit * 10 + (expression.charAt(++i) - '0');
                }
                OpndStack.push(digit);
            }
            else if (isOperator(c))
            {
                while (!OptrStack.isEmpty() && hasPrecedence(c, OptrStack.peek()))
                {
                    OpndStack.push(applyOperation(OptrStack.pop(), OpndStack.pop(), OpndStack.pop()));
                }
                OptrStack.push(c);
            }
            else if (c == '(')
            {
                OptrStack.push(c);
            } else if (c == ')') {
                while (OptrStack.peek() != '(')
                {
                    OpndStack.push(applyOperation(OptrStack.pop(), OpndStack.pop(), OpndStack.pop()));
                }
                OptrStack.pop();
            }
        }
        while (!OptrStack.isEmpty())
        {
            OpndStack.push(applyOperation(OptrStack.pop(), OpndStack.pop(), OpndStack.pop()));
        }
        return OpndStack.pop();
    }

    public boolean isOperator(char c)
    {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    public int applyOperation(char optr, int a, int b)
    {
        switch (optr)
        {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                return b / a;
        }
        return 0;
    }

    public boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
}