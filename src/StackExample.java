import java.util.Stack;
class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());//remove top element

        System.out.println(stack);

        System.out.println(stack.peek());//top element give

    }
}