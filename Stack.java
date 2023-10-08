import java.util.LinkedList;

public class Stack
{
    public static final int STACK_MAX = 52;
    final private LinkedList<Card> stack;

    public Stack()
    {
        stack = new LinkedList<Card>();
    }

    public void addCard(Card card)
    {
        stack.add(card);
    }

    public Card removeCard()
    {
        return stack.removeLast();
    }

    public Card pickTopStack()
    {
        return stack.getLast();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

}
