public class CardStack {

    private Card head;

    public int sizeOfLinkedList;

    public void addToFront(Card cardToAdd)
    {
        if(cardToAdd == null)
        {
            return;
        }
        Card cardCurrent = new Card(cardToAdd.getCardName());
        cardCurrent.setNextCard(head);
        head = cardCurrent;
        if(head.getNextCard() != null)
        {
            head.getNextCard().setPrevCard(head);
        }
        updateSizeVal();
    }

    public void removeFirstElement()
    {
        if(head == null)
        {
           return;
        }
        head = head.getNextCard();
        if(head != null) {

            head.setPrevCard(null);
        }
            updateSizeVal();
    }

    private void updateSizeVal() {
        Card current = head;
        int sizeVal = 0;

        while (current != null) {
            sizeVal++;
            current = current.getNextCard();
        }
        sizeOfLinkedList = sizeVal;
    }

    public boolean contains(Card cardToBeChecked)
    {
        Card current = head;
        while(current != null)
        {
            if (cardToBeChecked.equals(current))
            {
                return true;
            }
            current = current.getNextCard();
        }
        return false;
    }

    public int indexOf(Card cardToBeChecked)
    {
        Card current = head;
        int indexOfObject = 0;

        while(current != null)
        {
            if (cardToBeChecked.equals(current))
            {
                return indexOfObject;
            }
            current = current.getNextCard();
            indexOfObject++;
        }

        return -1;
    }
    public void printList()
    {
        int numberOfCardsToBreakLine = 0;
        Card current = head;
        System.out.print("1st: ");
        while (current != null) {
            System.out.print(current.getCardName());
            System.out.print(" -> ");
            current = current.getNextCard();
            numberOfCardsToBreakLine++;
            if(numberOfCardsToBreakLine % 5 == 0)
            {
                System.out.println("");
            }
        }
        System.out.print("Last\n");

    }

    public void printListReversed()
    {
        Card current = head;
        System.out.print("null -> ");
        while(current.getNextCard() != null)
        {
            current = current.getNextCard();
        }
        while(current != null)
        {
            System.out.print(current + " -> ");
            current = current.getPrevCard();
        }
        System.out.print("Head");

    }

    public int getSizeOfLinkedList() {
        return sizeOfLinkedList;
    }

    public Card getHead() {
        return head;
    }

    public void setHead(Card head) {
        this.head = head;
    }
}
