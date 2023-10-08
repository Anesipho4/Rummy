import java.util.*;

public class sort{
	public static void main(String[] args){
		Deck d=new Deck ();
		System.out.println(d);
		LinkedList<Integer> list= new LinkedList<Integer> ();
		LinkedList<Card> deck=new LinkedList<Card> ();
		LinkedList<Card> Hearts=new LinkedList<String> ();
		LinkedList<Card> Diamonds=new LinkedList<String> ();
		LinkedList<Card> Spades=new LinkedList<String> ();
		LinkedList<Card> Clubs=new LinkedList<String> ();
		//LinkedList<String> nw=new LinkedList<String> ();
		deck=d.getDeck();
	
for (Card card:deck){
	String m=card.getSuit();
	if(m.equals("♠")){
		Spades.add(card);
	}
	if(m.equals("♦")){
		Diamonds.add(card);
	}
	if(m.equals("♥")){
		Hearts.add(card);
	}
	if(m.equals("♣")){
		Clubs.add(card);
	}
}
	
	for(Card c:Hearts){
	     String n=c.getRank();
	     if (n.equals("A")){
	     n="1";	
}
	else if (n.equals("J")){
	     n="11";	
}
	else if (n.equals("Q")){
	     n="12";	
}
	else if (n.equals("K")){
	     n="13";	
}
	int x=Integer.parseInt(n);
		list.add(x);	

		
}


Collections.sort(list);
String rank;
for (int i=0;i<list.size();i++){
	if (list.get(i).equals(1){
	rank="A";
}
	list.get(i).equals(String.valueOf(Hearts.get(i).getRank())){};	
}
System.out.print(list);
System.out.print(suit);
	}

}