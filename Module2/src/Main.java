import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//            List<Player> playerList = new ArrayList<>();
//
            Player hamburger = new Player(1,"hamburger", 69);
            Player birdyBard = new Player(90, "BirdyBard", 21);
            Player IamSteel = new Player(303,"IamSteel", 89);

            PlayerLinkedList playerList = new PlayerLinkedList();

            playerList.addToFront(hamburger);
            playerList.addToFront(birdyBard);
            playerList.addToFront(IamSteel);

            playerList.printList();
            playerList.printListReversed();

            System.out.println(playerList.contains(new Player(90, "BirdyBard", 21)));
            System.out.println(playerList.indexOf(new Player(90, "BirdyBard", 21)));

            playerList.removeFirstElement();
            playerList.printList();
            playerList.printListReversed();

//            playerList.removeFirstElement();
//
//            System.out.println("\n\n");
//            playerList.printList();


//
//            playerList.add(2, new Player(12, "LogiGods", 81));
//
//            playerList.remove(2);

           // System.out.println(playerList.contains(new Player(90,"BirdyBard", 21)));
           // System.out.println(playerList.indexOf(new Player(90,"BirdyBard", 21)));

//            System.out.println(playerList.get(1));
//            for(Player p : playerList)
//            {
//                System.out.println(p);
//            }



    }

}