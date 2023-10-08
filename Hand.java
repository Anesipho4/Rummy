import javax.swing.*;
import java.util.*;

public class Hand
{
    final private DefaultListModel<Card> hand;

    public Hand()
    {
        hand = new DefaultListModel<Card>();
    }

    public void removeCard(int card)
    {
        hand.removeElement(card);
    }

    public void addCard(Card card)
    {
        hand.addElement(card);
    }

    public String toString()
    {
        String handTS = "";

        for (int i = 0; i < hand.size(); i++)
        {
            String cardTS = hand.get(i).toString().toUpperCase();

            if (i != hand.size() - 1)
            {
                cardTS = cardTS.concat(", ");
            }

            handTS = handTS.concat(cardTS);
        }
        return handTS;
    }

    public DefaultListModel<Card> getHand()
    {
        return hand;
    }

    public boolean isEmpty()
    {
        return hand.isEmpty();
    }
}
