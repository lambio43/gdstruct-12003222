public class PlayerLinkedList {

    private PlayerNode head;

    public int sizeOfLinkedList;
    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        if(head.getNextPlayer() != null)
        {
            head.getNextPlayer().setPrevPlayer(head);
        }
        updateSizeVal();
    }

    public void removeFirstElement()
    {
        if (head == null )
        {
            return;
        }
        head = head.getNextPlayer();
        if (head != null) {
            head.setPrevPlayer(null);
        }
        updateSizeVal();
    }

    private void updateSizeVal() {
        PlayerNode current = head;
        int sizeVal = 0;

        while (current != null) {
                sizeVal++;
                current = current.getNextPlayer();
        }
        sizeOfLinkedList = sizeVal;
    }

    public boolean contains(Player playerToBeChecked)
    {
        PlayerNode current = head;
        while(current.getPlayer() != null)
        {
            if (playerToBeChecked.equals(current.getPlayer()))
            {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    public int indexOf(Player playerToBeChecked)
    {
        PlayerNode current = head;
        int indexOfObject = 0;

        while(current.getPlayer() != null)
        {
            if (playerToBeChecked.equals(current.getPlayer()))
            {
                return indexOfObject;
            }
            current = current.getNextPlayer();
            indexOfObject++;
        }

        return -1;
    }
        public void printList()
        {
            PlayerNode current = head;
            System.out.print("Head -> ");
            while (current != null) {
                System.out.print(current.getPlayer());
                System.out.print(" -> ");
                current = current.getNextPlayer();
            }
            System.out.print("null");

            System.out.println("\nLinkedList size: " + sizeOfLinkedList);
        }

        public void printListReversed()
        {
            PlayerNode current = head;
            System.out.print("null -> ");
            while(current.getNextPlayer() != null)
            {
                current = current.getNextPlayer();
            }
            while(current != null)
            {
                System.out.print(current.getPlayer() + " -> ");
                current = current.getPrevPlayer();
            }
            System.out.print("Head");

            System.out.println("\nLinkedList size: " + sizeOfLinkedList);
        }

}