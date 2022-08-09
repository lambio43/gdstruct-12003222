import java.awt.*;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(new Player(1, "Shroud", 120));
        queue.add(new Player(2, "S1mple", 150));
        queue.add(new Player(3, "Hiko", 100));
        queue.add(new Player(4, "Tarik", 120));
        queue.add(new Player(5, "Ploo", 420));
        System.out.println("Index# " + queue.size());

        queue.printQueue();

        System.out.println("After popping element" + queue.remove());

        queue.printQueue();


    }
}