import java.util.*;

public class Hand{
	private ArrayList<Card> hand;
	private ArrayList<Card> newhand=new ArrayList<>();
	private ArrayList<Card> hearts,diamonds,spades,clubs;
	
	//constructor
	public Hand(){
		hand=new ArrayList<>(); 
	}
	
	//add card to hand
	public void addCard(Card c){
		hand.add(c);
	}
	
	//remove card from hand
	public void removeCard(Card c){
		hand.remove(hand.indexOf(c));
	}
	
	//count number of cards in hand
	public int getCardCount(){
		return hand.size();
	}
	
	//gets card from hand
	public Card getCard(int pos){
		return hand.get(pos);
	}
	
	//sorts cards by grouping by suit and sorting in ascending order within suit
	public ArrayList<Card> sortbySuit(){
		hearts=new ArrayList<>();
		diamonds=new ArrayList<>();
		spades=new ArrayList<>();
		clubs=new ArrayList<>();
		/*group according to suit*/
		for(Card c:hand){
			if (c.getSuit().equals("hearts")){
				hearts.add(c);
			}
			else if (c.getSuit().equals("spades")){
				spades.add(c);
			}
			else if (c.getSuit().equals("diamonds")){
				diamonds.add(c);
			}
			else if (c.getSuit().equals("clubs")){
				clubs.add(c);
			}
		}
		hearts=sortbyFaceName(hearts);
		spades=sortbyFaceName(spades);
		diamonds=sortbyFaceName(diamonds);
		clubs=sortbyFaceName(clubs);
		hand.clear();
		hand.addAll(hearts);
		hand.addAll(spades);
		hand.addAll(diamonds);
		hand.addAll(clubs);
		return hand;
	}
	
	//sorts cards in hand ascending order;cards of same value sorted by suit
	public ArrayList<Card> sortbyFaceName(ArrayList<Card> suit){
		List<String> list=new ArrayList<String>();
		ArrayList<Card> arr=new ArrayList<>();
		for (Card c:suit){
			list.add(c.getFaceName());
		}
		Collections.replaceAll(list,"ace","1");
		Collections.replaceAll(list,"jack","11");
		Collections.replaceAll(list,"queen","12");
		Collections.replaceAll(list,"king","13");
		
		Collections.sort(list);
		Collections.replaceAll(list,"1","ace");
		Collections.replaceAll(list,"11","jack");
		Collections.replaceAll(list,"12","queen");
		Collections.replaceAll(list,"13","king");
		
		/*for (int i=0;i<suit.size()-1;i++){
			for(int j=0;j<suit.size();j++){
				if (suit.get(i).getFaceName()
			}
		}*/
		int i=0;
		for(String s:list){
			while (suit.size()!=0&&i<suit.size()){
			
			if(suit.get(i).getFaceName().equals(s)){
				arr.add(suit.get(i));
				suit.remove(i);
				i++;
				break;
			}
			else{
				i++;
			}
			}
		}
		return arr;
	}
	
	//toString
	public String toString(){
		return hand.toString();
	}
	
	
	//ignore:Coding purposes
	public ArrayList<Card> clear(){
		hand.clear();
		return hand;
	}
	
	public ArrayList<Card> addAll(ArrayList<Card> suit){
		for(Card c:suit){
		addCard(c);}
	return hand;}
	
}