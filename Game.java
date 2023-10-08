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
        stackFirstCard();

        System.out.println(playersTurn ? "Player 2 Hand:" : "Player 1 Hand:");
        System.out.println(player.toString() + "\n");

        Card firstStackCard = deck.dealCard();
        stack.addCard(firstStackCard);

        for (int i = 0; i < 10; i++)
        {
            if (playersTurn)
            {
                System.out.println("Stack Top Card: " + stack.pickTopStack());
                doTurn(player);
            }
            else
            {
                System.out.println("Stack Top Card: " + stack.pickTopStack());
                doTurn(computer);
            }
        }

    }

    private void doTurn(Hand playersHand)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Draw from Deck\n2. Draw from Stack");
        int draw = in.nextInt();

        if (draw == 1)
        {
            takeFromDeck(playersHand);
//            discard(player, );
        }
        else if (draw == 2)
        {
            if (!stack.isEmpty())
            {
                takeFromStack(playersHand);
            }
            else
            {
                System.out.println("Stack is empty. Drawing from deck.");
                takeFromDeck(playersHand);
            }
        }
        else
            System.out.println("Invalid option; please input either 1 or 2");



            playerDrew = true;
            playersTurn = !playersTurn;
            stateWhoseTurn = false;
    }

    private void takeFromDeck(Hand hand)
    {
        Card card = deck.dealCard();
        hand.addCard(card);

        if (true)
        {

            System.out.println("Added from Deck: " + card.toString().toUpperCase());

            if (!stateWhoseTurn)
            {
                System.out.println(hand.toString()+ "\n");

                System.out.println(playersTurn ? "Player 1" : "Player 2");
                stateWhoseTurn = true;
            }

        }
    }

    private void takeFromStack(Hand hand)
    {
        Card card = stack.pickTopStack();
        hand.addCard(card);
        stack.removeCard();

        if (true)
        {

            System.out.println("Added from Stack: " + card.toString().toUpperCase());

            if (!stateWhoseTurn)
            {
                System.out.println(hand.toString()+ "\n");

                System.out.println(playersTurn ? "Player 1" : "Player 2");
                stateWhoseTurn = true;
            }

        }
    }

    private void discardFromHand(Hand playersHand, int card)
    {
        Card c = playersHand.removeCard(card);
        playersHand.removeCard(card);
        stack.addCard(card);

        if (true)
        {
            System.out.println("\tDiscarded: " + card.toString().toUpperCase());
            System.out.println("\tHand now: " + playersHand.toString());
        }

    }

    private void stackFirstCard()
    {
        Card c = deck.dealCard();
        stack.addCard(c);
    }

    public static void main(String [] args)
    {
        Game g = new Game();
        g.start();
    }
}
