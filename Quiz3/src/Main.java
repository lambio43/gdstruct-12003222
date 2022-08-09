import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayQueues matchMaking = new ArrayQueues(5);
        ArrayQueues playersSearching = new ArrayQueues(7);
        int gamesFound = 0;

        pause();
        while (gamesFound != 10) {

            System.out.println("===================================================================");

            int numOfPlayersInQueue = ThreadLocalRandom.current().nextInt(1, 7 + 1);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("# of new players searching: " + numOfPlayersInQueue);

            for (int i = 0; i < numOfPlayersInQueue; i++) {
                playersSearching.add(new Player());
            }
            int numOfPlayersCurrentlySearching = playersSearching.size();
            System.out.println("-------------------------------------------------------------------");
            System.out.println("# of players still searching " + numOfPlayersCurrentlySearching);
            System.out.println("Player searching list: ");
            playersSearching.printQueue();

            if(numOfPlayersCurrentlySearching >= 5)
            {
            for (int i = 0; i < numOfPlayersCurrentlySearching; i++) {

                matchMaking.add(playersSearching.remove());

                if (matchMaking.size() == 5) {
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Match Making List: ");
                    matchMaking.printQueue();

                    int maxPlayers = matchMaking.size();
                    for (int j = 0; j < maxPlayers; j++) {
                        matchMaking.remove();
                    }

                    gamesFound++;
                    break;
                }
            }
            }
            System.out.println("Matche/s Found: " + gamesFound);
            System.out.println("===================================================================");
            if (gamesFound != 10)
                pause();
        }
    }

    public static void pause() {
        Scanner s = new Scanner(System.in);
        System.out.println("\nPress Enter to Continue");
        s.nextLine();
    }
}

