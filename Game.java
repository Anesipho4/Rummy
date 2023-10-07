import java.util.*;

public class Game
{
    Deck deck = new Deck(); // creates a shuffled deck
    Stack stack = new Stack(); //creates stack

    private static int handSize = 10;
    private Hand player = new Hand();
    private Hand computer = new Hand();

    private boolean playersTurn = false;
    private boolean playerDrew = false;
    private boolean stateWhoseTurn = false;
    private void dealCards()
    {
        for (int i = 0; i < handSize; i++)
        {
            Card c = deck.dealCard();
            player.addCard(c);
        }

        for (int i = 0; i < handSize; i++)
        {
            Card c = deck.dealCard();
            computer.addCard(c);
        }
    }

    public void start()
    {
        dealCards();

        Card firstStackCard = deck.dealCard();
        stack.addCard(firstStackCard);

        for (int i = 0; i < 10; i++)
        {
            if (playersTurn)
            {
                doTurn(player);
            }
            else
            {
                doTurn(computer);
            }
        }

    }

    private void doTurn(Hand playersHand) {

        if (stack.isEmpty())
        {
            takeFromDeck(playersHand);
        }
//        else
//        {
//            int oneOrTwo = ThreadLocalRandom.current().nextInt(1, 3);
//
//            if (oneOrTwo == 1)
//            {
//                takeFromDeck(playersHand);
//            }
//            else
//            {
//                takeFromStack(playersHand);
//            }
//
//        }

        playerDrew = true;
        playersTurn = !playersTurn;
        stateWhoseTurn = false;
    }

    private void takeFromDeck(Hand playersHand)
    {

        Card card = deck.dealCard();
        playersHand.addCard(card);

        if (true)
        {
            if (!stateWhoseTurn)
            {
                System.out.println(playersTurn ? "Player 1" : "Player 2");
                stateWhoseTurn = true;
            }

            System.out.println("\tAdded from Deck: " + card.toString().toUpperCase());
        }

    }

    private void takeFromStack(Hand hand)
    {

        Card card = stack.removeCard();

        if (card == null) {
            return;
        }

        hand.addCard(card);
    }

    private void discard(Hand playersHand, Card card) {

        // Discard from hand
        playersHand.removeCard(card);
        deck.addCard(card);

        if (true) {
            System.out.println("\tDiscarded: " + card.toString().toUpperCase());
            System.out.println("\tHand now: " + playersHand.toString());
        }

    }

    public static void main(String [] args)
    {
        Game g = new Game();
        g.start();
    }
}
