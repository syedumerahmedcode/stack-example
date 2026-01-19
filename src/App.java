public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Stack stack = new Stack();

        /**
         * Pushing elements on to the stack
         */
        stack.push(10);
        stack.push(20);
        stack.push(30);

        /**
         * peeking at the top
         */
        System.out.println("Current top element in the stack: " + stack.peek());

        /**
         * popping a couple of elemnts
         */
        System.out.println("Current popped element: " + stack.pop());
        System.out.println("Current popped element: " + stack.pop());

        /**
         * new peek value
         */
        System.out.println("Current top element in the stack after some pop methods: " + stack.peek());
    }
}
