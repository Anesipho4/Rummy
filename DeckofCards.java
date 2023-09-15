import java.util.ArrayList;
import java.util.List;
public class DeckofCards{
	private ArrayList<Cards> deck;

	//constructor:creates deck of standard cards
	public DeckofCards(){
		List<String> suits=Cards.getValidSuits();
		List<String> facenames=Cards.getValidFaceNames();
		
		deck = new ArrayList<>();
		for( String suit: suits){
			for (String facename: facenames){
				deck.add(new Cards(facename,suit)); //adding cards to deck
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}