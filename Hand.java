import javax.swing.*;
import java.util.*;

public class Hand
{
    final private DefaultListModel<Card> hand;

    public Hand()
    {
        hand = new DefaultListModel<Card>();
    }

//    public Card removeCard(Card card)
//    {
//        return hand.(card);
//    }

    public Card removeCard(int card)
    {
        Card c = hand.remove(card);
        this.sort();
        return c;
    }

    public void addCard(Card card)
    {
        hand.addElement(card);
        this.sort();
    }

    public String toString()
    {
        String handTS = "";

        for (int i = 0; i < hand.size(); i++)
        {
            String cardTS = hand.get(i).toString().toUpperCase();

            if (i != hand.size() - 1)
            {
                cardTS = cardTS.concat("\t");
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

//    quite a bit of help from gitHub and Stack Overflow for this method
    public void sort()
    {

        DefaultListModel<Card> sortedHand = new DefaultListModel<Card>();

        for (int i = 0; i < hand.size(); i++)
        {

            Card firstGroup = hand.get(i);
            String groupRank = firstGroup.getRank();

            int j = i;
            DefaultListModel<Card> sameRankSorting = new DefaultListModel<Card>();

            while (j < hand.size() && Objects.equals(hand.get(j).getRank(), groupRank))
            {
                sameRankSorting.addElement(hand.get(j));
                j += 1;
            }

            for (int k = 0; k < sameRankSorting.size(); k++)
            {
                sortedHand.addElement(sameRankSorting.get(k));
            }

            i = j - 1;

        }

        hand.clear();

        for (int i = 0; i < sortedHand.size(); i++) {
            hand.addElement(sortedHand.get(i));
        }

    }
}
