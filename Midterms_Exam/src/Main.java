import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

 class Main {

    public static void main(String[] args) {
        CardStack deckPile = new CardStack();
        CardStack handPile = new CardStack();
        CardStack discardPile = new CardStack();

        int roundNumber = 1;


        populateDeck(deckPile);

        while(deckPile.getSizeOfLinkedList() > 0)
        {
            System.out.println("=============================================================");
            System.out.println("Round: " + roundNumber);
            gamePlay(deckPile, handPile, discardPile);
            System.out.println("=============================================================");
            pause();

            roundNumber++;
        }
        System.out.println("Rounds played: " + roundNumber + "\n");
        System.out.print("Cards on Hands: ");
        handPile.printList();
        System.out.print("\nCards on Discard Pile: ");
        discardPile.printList();
    }

     public static Card removeCardFromPile(CardStack cardPile)
     {
         Card topDeckCard = cardPile.getHead();
         cardPile.removeFirstElement();
         return topDeckCard;
     }

     public static void gamePlay(CardStack deckPile, CardStack handPile,
                                 CardStack discardPile)
     {
         Random rand = new Random();
         int randCommand = rand.nextInt(1, 4);
         int randCardToRemove = rand.nextInt(1, 6);

         if (randCommand == 1)
         {
             System.out.println("Drawing from deck: " + randCardToRemove);
             for (int i = 1; i <= randCardToRemove; i++)
             {
                 handPile.addToFront(removeCardFromPile(deckPile));
             }
             System.out.print("HandPile: ");
             handPile.printList();
             System.out.println("Cards in hand: " + handPile.getSizeOfLinkedList());
             System.out.println("Deck Cards Remaining: " + deckPile.getSizeOfLinkedList());
             System.out.println("Cards in Discard Pile: " + discardPile.getSizeOfLinkedList());

         }
         else if (randCommand == 2)
         {
             System.out.println("Discarding from hand: " + randCardToRemove);
             for (int i = 1; i <= randCardToRemove; i++)
             {
                 discardPile.addToFront(removeCardFromPile(handPile));
             }
             System.out.print("HandPile: ");
             handPile.printList();
             System.out.println("Cards in hand: " + handPile.getSizeOfLinkedList());
             System.out.println("Deck Cards Remaining: " + deckPile.getSizeOfLinkedList());
             System.out.println("Cards in Discard Pile: " + discardPile.getSizeOfLinkedList());
         }
         else if (randCommand == 3)
         {
             System.out.println("Drawing from discard pile: " + randCardToRemove);
             for (int i = 1; i <= randCardToRemove; i++)
             {
                 handPile.addToFront(removeCardFromPile(discardPile));
             }
             System.out.print("HandPile: ");
             handPile.printList();
             System.out.println("Cards in hand: " + handPile.getSizeOfLinkedList());
             System.out.println("Deck Cards Remaining: " + deckPile.getSizeOfLinkedList());
             System.out.println("Cards in Discard Pile: " + discardPile.getSizeOfLinkedList());
         }
     }

     public static void populateDeck(CardStack deckPile)
     {
         List<Card> cardList = new ArrayList<>();
         cardList.add(new Card("Greed of Pot"));
         cardList.add(new Card("Doki Doki Charm"));
         cardList.add(new Card("Power of god and Anime"));
         cardList.add(new Card("I am steel"));
         cardList.add(new Card("White eyes, blue dragon"));
         cardList.add(new Card("Shake and Bake"));
         cardList.add(new Card("Dispel Force"));
         cardList.add(new Card("Hamburger deluxe"));
         cardList.add(new Card("AHHHHHH, YOUUUU"));
         cardList.add(new Card("Thousand Spice"));

         for(int i = 0; i < 3; i++)
         {
             Collections.shuffle(cardList);
             Collections.shuffle(cardList);

             for (Card cardThing : cardList)
             {
                 deckPile.addToFront(cardThing);
             }
         }
         cardList.removeAll(cardList);
         cardList = null;
     }

     // Source and inspiration: http://www.java2s.com/example/java-utility-method/console-pause/pause-eea00.html
     public static void pause() {
         Scanner s = new Scanner(System.in);
         System.out.println("\nPress Enter to Continue");
         s.nextLine();
     }
}