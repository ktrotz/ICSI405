package edu.albany.hw2.morse;
import java.util.HashMap;



public class Morse {
	
	public static void toMorse(String message)
	{
		char text[] = {' ', ',' , '.' , '?' , '0', '1', '2', '3', '4', '5', '6', '7', '8','9', 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y', 'z'};
			
		String code[] = {" ", "--..--" , ".-.-.-", "..--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--", "--.."}; 
	
		//HashMap uses a key to value pairing
		//We store the items using the key (char text) with a value (String code)
		//HashMap uses O(1) retrival time thus making it a more efficent choice

		//Make the map
		HashMap<Character, String> morseMap = new HashMap<>();
		
		for(int i = 0; i < text.length; i++)
		{
			morseMap.put(text[i], code[i]);
		}
		
		StringBuffer sb = new StringBuffer();
		
		//Convert to morse code
		for(int i = 0; i < message.length(); i++)
		{
			String morseCode = (String)morseMap.get(message.charAt(i));
			sb.append(morseCode);
		}
		
		System.out.println(sb);
	}
}
