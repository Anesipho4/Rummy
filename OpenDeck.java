import java.util.ArrayList;
import java.util.List;


public class OpenDeck{
	private	ArrayList<integer> deck;

	public List<String> getList(){
		return deck;
}
	//play card into an open deck
	public void AppendToDeck(int[] card){
		deck.addAll(card);

}

	//for getting one or more cards from the open deck
	public static ArrayList<String> GetCard(int n){
		int lastcard= deck.size()-1;

		//if player decides to draw card from an open deck
		if (n==0){
			return deck.get(lastcard);
		}

		//when the cards in a closed deck have been depleted...
		//the cards that have been played are to be recycled
		if(n==-1){
			newlist=deck.subList(0,lastcard);
			return newlist;
		}
	}
}