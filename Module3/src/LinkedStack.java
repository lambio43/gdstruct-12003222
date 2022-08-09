import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Player> stack;

    public LinkedStack()
    {
        stack = new LinkedList<Player>();
    }

    public void push(Player player)
    {
        stack.push(player);
    }

    public Player pop()
    {
        return stack.pop();
    }

    public Player peek()
    {
        return stack.peek();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public void printStack()
    {
        System.out.println("Printing Stack");

        ListIterator<Player> iterator = stack.listIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
