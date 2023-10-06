import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Deck
{
	private ArrayList<Card> closed_deck;
	

	//constructor: creates deck of standard cards
	public Deck()
	{
		List<String> suits = Card.getValidSuits();
		List<String> facenames = Card.getValidFaceNames();
		closed_deck = new ArrayList<>();
		
		for (String suit : suits)
		{
			
			for (String facename : facenames)
			{
				closed_deck.add(new Card(facename, suit)); //adding cards to deck
			}
			
		}
		
		//shuffled deck
		Collections.shuffle(closed_deck);	
		
	}
	
	//deals cards to player's hand; need to specify number of players
	/*public Card deal(int n){
		int x;//number of cards to deal
		if(n==1||n==2){
			x=10;
		}
		else if(n==3||n==4){
			x=7;
		}
		else {
			x=6;
		}
		
		//for (int i=0;i<x;i++){
			//dealTopCard()
		//}
	}*/
	
	public int getSize(){
		return closed_deck.size();
	}
	
	
	//deal top card of closed deck
	//reshuffles used cards once closed deck depleted
	public Card dealTopCard(){
		Card topcard=closed_deck.get(0);
		closed_deck.remove(topcard);
		return topcard;
	}
		
	//toString: For coding purposes
	public String toString(){
		return closed_deck.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
