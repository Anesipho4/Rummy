import java.util.*;

public class Deck
{
    final private LinkedList<Card> deck;

    public Deck()
    {
        deck = new LinkedList<Card>();

        for (int i = 0; i < Card.SUIT.length; i++)
        {

            for (int j = 0; j < Card.RANK.length; j++)
            {
                Card card = new Card(Card.SUIT[i], Card.RANK[j]);
                deck.add(card);
            }

        }
        shuffle();

    }

    public boolean isEmpty()
    {
        return deck.isEmpty();
    }

    public Card dealCard()
    {
        if (!isEmpty())
        {
            return deck.removeLast();
        }
        return null;
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    public Card getTopCard()
    {
        if (!isEmpty())
        {
            return deck.getLast();
        }
        return null;
    }

    public void addCard(Card card)
    {
        deck.add(card);
    }

}
