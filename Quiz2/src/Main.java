import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        Player hamburger = new Player(1,"hamburger", 69);
        Player birdyBard = new Player(90, "BirdyBard", 21);
        Player IamSteel = new Player(303,"IamSteel", 89);
        Player RanchSauce = new Player(420, "RanchSauce", 500);

        PlayerLinkedList playerList = new PlayerLinkedList();

        playerList.addToFront(hamburger);
        playerList.addToFront(birdyBard);
        playerList.addToFront(IamSteel);
        playerList.addToFront(RanchSauce);

        playerList.printList();
        playerList.printListReversed();

        System.out.print("\n");

        System.out.println("Contains: " + playerList.contains(new Player(1,"hamburger", 69)));
        System.out.println("Index of: " + playerList.indexOf(new Player(1,"hamburger", 69)));

        System.out.println("\n\n");

        playerList.removeFirstElement();
        playerList.printList();
        playerList.printListReversed();

        System.out.print("\n");

        System.out.println("Contains: " + playerList.contains(new Player(1,"hamburger", 69)));
        System.out.println("Index of: " + playerList.indexOf(new Player(1,"hamburger", 69)));

        for(int i = 0; i < 10; i++)
        {
            playerList.removeFirstElement();
        }
        playerList.printList();

    }

}