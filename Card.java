public class Card
{
    public static final String[] SUIT = {"♠", "♦", "♥", "♣"};
    public static final String[] RANK = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    private final String suit;
    private final String rank;

    public Card(String suit, String rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit()
    {
        return suit;
    }

    public String getRank()
    {
        return rank;
    }

    public String toString()
    {
        return "" + this.getRank() + this.getSuit();
    }

}
