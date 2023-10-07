public class Game
{
    Deck deck = new Deck(); // creates a shuffled deck
    Stack stack = new Stack(); //creates stack

    private static int numHandCards = 10;
    private Hand player = new Hand();
    private Hand computer = new Hand();

    private void dealCards()
    {
        for (int i = 0; i < numHandCards; i++)
        {
            player.addCard(deck.getTopCard());
            deck.dealCard();
            computer.addCard(deck.getTopCard());
            deck.dealCard();
        }
    }

    public void start()
    {
        dealCards();

    }

    public static void main(String [] args)
    {
        Game g = new Game();
        g.start();
    }
}
