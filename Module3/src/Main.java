public class Main {

    public static void main(String[] args)
    {

        LinkedStack stack = new LinkedStack();

        stack.push(new Player(1, "Shroud", 120));
        stack.push(new Player(2, "S1mple", 150));
        stack.push(new Player(3, "Hiko", 100));
        stack.push(new Player(4, "Tarik", 120));

        stack.printStack();


        System.out.println("Peeking: " + stack.peek());

        stack.printStack();
    }
}