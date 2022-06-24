import java.util.Objects;

public class Card {

    private String CardName;
    private Card nextCard;
    private Card prevCard;

    public Card(String cardName) {
        CardName = cardName;
    }

    public String getCardName() {
        return CardName;
    }

    public void setCardName(String cardName) {
        CardName = cardName;
    }

    public Card getNextCard() {
        return nextCard;
    }

    public void setNextCard(Card nextCard) {
        this.nextCard = nextCard;
    }

    public Card getPrevCard() {
        return prevCard;
    }

    public void setPrevCard(Card prevCard) {
        this.prevCard = prevCard;
    }

    @Override
    public String toString() {
        return "Card{" +
                "CardName='" + CardName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(CardName, card.CardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CardName);
    }
}
