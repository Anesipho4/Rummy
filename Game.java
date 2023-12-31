import java.util.*;

public class Game
{
    Deck deck = new Deck(); // creates a shuffled deck
    Stack stack = new Stack(); //creates stack

    private static int handSize = 10;
    private Hand player = new Hand();
    private Hand computer = new Hand();
    private int playerReady;

    private boolean playersTurn = true;

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
        Scanner in = new Scanner(System.in);

        dealCards();
        stackFirstCard();

        for (int i = 0; i < 10; i++)
        {
            if (playersTurn)
            {
                System.out.println("Enter any number when player is ready");
                playerReady = in.nextInt();

                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlayer 1's Turn");
                doTurn(player);

            } else {
                System.out.println("Enter any number when player is ready");
                playerReady = in.nextInt();

                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlayer 2's Turn");
                doTurn(computer);

            }

        }

    }


    private void doTurn(Hand playersHand)
    {
        System.out.println("\nStack Top Card: " + stack.pickTopStack() + "\n");

        System.out.println(playersTurn ? "Player 1 Hand:" : "Player 2 Hand:");
        pln(playersHand.toString() + "\n");

        Scanner in = new Scanner(System.in);

        pln("1. Draw from Deck\n2. Draw from Stack");
        int draw = in.nextInt();


        if (draw == 1)
        {
            takeFromDeck(playersHand);

        }
        else if (draw == 2)
        {
            takeFromStack(playersHand);

        }
        else
            pln("Invalid option; please input either 1 or 2");

        playersTurn = !playersTurn;
    }


    private void takeFromDeck(Hand hand)
    {
        Scanner in = new Scanner(System.in);

        Card card = deck.dealCard();
        hand.addCard(card);

        if (true)
        {
            pln("Added from Deck: " + card.toString().toUpperCase());
            hand.sort();
            pln(hand.toString() + "\n");

            discardFromHand(hand);

        }

    }


    private void takeFromStack(Hand hand)
    {
        Card card = stack.pickTopStack();

        hand.addCard(card);
        stack.removeCard();

        if (true)
        {

            pln("Added from Stack: " + card.toString().toUpperCase());
            hand.sort();
            pln(hand.toString() + "\n");
            discardFromHand(hand);

        }

    }


    private void discardFromHand(Hand hand)
    {
        Scanner in = new Scanner(System.in);

        pln("Which card would you like to discard?");
        int discard = in.nextInt();

        Card c = hand.removeCard(discard-1);
        hand.removeCard(discard-1);
        stack.addCard(c);

        if (true)
        {
            hand.sort();
            p("Discarded: " + c.toString().toUpperCase());
            pln("\nHand now:\t" + hand.toString() + "\n");

        }

    }


    private void stackFirstCard()
    {
        Card c = deck.dealCard();
        stack.addCard(c);

    }

    public static void pln(String s)
    {
        System.out.println(s);
    }

    public static void p(String s)
    {
        System.out.print(s);
    }


    public static void main(String [] args)
    {
        Game g = new Game();
        g.start();

    }

}
