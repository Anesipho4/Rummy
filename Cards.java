import java.util.Arrays;
import java.util.List;

public class Cards
{
	private String face_name; 
	private String suit;
	
	
	//constructor: using set methods to validate inputs
	public Cards (String face_name, String suit)
	{
		setFaceName(face_name);	
		setSuit(suit);
	}
	
	//accessor: returns values within private instances
	public String getFaceName()
	{
		return face_name;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	//muatator: validates inputs and sets instance variable
	public void setFaceName(String face_name)
	{
		List<String> validFaceNames = getValidFaceNames();
		face_name = face_name.toLowerCase();
		if (validFaceNames.contains(face_name))
		{
			this.face_name = face_name;
		}
			
		else
		{
			throw new IllegalArgumentException("Valid face names are: " + validFaceNames);
		}
	}
	
	public void setSuit(String suit)
	{
		List<String> validSuits = getValidSuits();
		suit = suit.toLowerCase();
		
		if (validSuits.contains(suit))
		{
			this.suit = suit;
		}
			
		else
		{
			throw new IllegalArgumentException("Valid suits are: " + validSuits);
		}
	}
	
	//method that returns a list of facenames that are valid 
	public static List<String> getValidFaceNames()
	{
		return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
	}
	
	//method that returns a list of suit names that are valid
	public static List<String> getValidSuits()
	{
		return Arrays.asList("Hearts", "Diamonds", "Spades", "Clubs");
	}
	
	//toString method
	public String toString()
	{
		return String.format("%s of %s", face_name, suit);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
