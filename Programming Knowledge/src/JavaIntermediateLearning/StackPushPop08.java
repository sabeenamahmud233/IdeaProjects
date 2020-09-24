package JavaIntermediateLearning;

import java.util.Stack;

public class StackPushPop08 {
    public static void main(String[] args) {
        StackClass stackClass = new StackClass();
        stackClass.stackMethod();
    }
}

class StackClass {
    public void stackMethod() {
        Stack<String> stack = new Stack<String>();

        // push method will add items in the stack
        // will add first item at the bottom than continue one after another
        // Bottom Item --> Bottom Item + 1 --> Bottom Item + 2 --> Bottom Item + 3 --> Bottom Item + 4 --> First Item
        stack.push("First");    // It will go to bottom
        stack.push("Second");   // bottom + 1
        stack.push("Third");   // bottom + 2
        stack.push("Four");   // bottom + 3
        stack.push("Five");   // bottom + 4 or first Item

        System.out.println(stack);

        // pop method will remove the item from the stack
        // it will pop out the last item that we have added in the stack (will remove the first item in the stack)
        stack.pop();
        stack.pop();
        System.out.println(stack);

    }
}