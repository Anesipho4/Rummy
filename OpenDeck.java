import java.util.ArrayList;
import java.util.List;


public class OpenDeck{
	private	ArrayList<Card> deck;
	private ArrayList<Card> newlist=new ArrayList<>();


	//constructor
	public OpenDeck(){
		deck=new ArrayList<>();
	}
	
	public ArrayList<Card> getOpenDeck(){
		return deck;	
	}
	
	//play card into an open deck
	public void Add(Card card){
		deck.add(card);
	}

	//for getting one card from the open deck 
	public Card GetLastCard(int n){
		int lastcard= deck.size()-1;
			return deck.get(lastcard);
	}
	
	//displays face card
	public Card DisplayLastCard(int n){
			return deck.get(deck.size()-1);
	}

		//when the cards in a closed deck have been depleted...
		//the cards that have been played are to be recycled
	public ArrayList<Card> RecycleDeck(){
			newlist=new ArrayList<Card>(deck.subList(0,deck.size()-1));
			return newlist;
		}
	
	
	public String toString(){
		return deck.toString();
	}
}