package com.examples.practice;
import java.util.Stack;

public class MergeStack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        Stack<Integer> mergedStack = mergeStacks(stack1, stack2);

        System.out.println("Merged Stack:");
        while (!mergedStack.isEmpty()) {
            System.out.print(mergedStack.pop() + " ");
        }
    }

    public static Stack<Integer> mergeStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> mergedStack = new Stack<>();

        // Push elements of stack1 into mergedStack
        while (!stack1.isEmpty()) {
            mergedStack.push(stack1.pop());
        }

        // Push elements of stack2 into mergedStack
        while (!stack2.isEmpty()) {
            mergedStack.push(stack2.pop());
        }

        // Reverse the order of elements in mergedStack to maintain the original order
        Stack<Integer> tempStack = new Stack<>();
        while (!mergedStack.isEmpty()) {
            tempStack.push(mergedStack.pop());
        }

        // Transfer elements back to mergedStack
        while (!tempStack.isEmpty()) {
            mergedStack.push(tempStack.pop());
        }

        return mergedStack;
    }
}
