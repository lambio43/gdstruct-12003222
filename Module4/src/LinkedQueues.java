import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
// Experiment in the future

public class LinkedQueues {

    private Queue<Player> queue;

    public LinkedQueues()
    {
        queue = new LinkedList<>();
    }

    public void add(Player player)
    {
        queue.add(player);
    }

    public Player peek()
    {
        return queue.peek();
    }

    public Player remove()
    {
        return queue.remove();
    }

    public int size()
    {
        return queue.size();
    }

}
