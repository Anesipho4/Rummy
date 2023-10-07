import java.util.LinkedList;

public class Hand
{
    final private LinkedList<Card> hand;

    public Hand()
    {
        hand = new LinkedList<Card>();

    }

    public void deal()
    {

    }

    public void addCard(Card card)
    {
        hand.add(card);
    }
}
