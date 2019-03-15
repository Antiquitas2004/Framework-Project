package sparktest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// import org.apache.spark.SparkConf;
// import org.apache.spark.SparkContext;

public class SparkTest 

public class CharacterCreator 
{
	public static final String SRC = "CharacterSheet - webform";
	public static String DEST = "Destination for Sheet";
	public static final String RACES = "Race Options";
	public static final String CLASSES = "Class Options";
	public static Scanner userInput;
	public static Info Info; // contains info needed to create characters (ie, races, classes, etc)
    public static characterData character;
    
{
		public static void main(String[] args)
		{
		
		int Race;
		// System.out.println("Choose your race from the following; Human, Elf, Dwarf, Half-Elf, Half- Orc" + Race);
	    // Race = 1
		getCharacterRace();
		// User will choose a character race. 
		public static void getCharacterRace()
		{
	    	String race;
	        while(true){
	        	// string to print out race options
	        	StringBuilder newsb = new StringBuilder();
	        	newsb.append("Races to choose from: ");
	        	for(String s : Info.races){
	        		newsb.append(s);
	        		newsb.append(", ");
	        	}
	        	//print all race options
	        	System.out.println(newsb.toString());
	        	
	        	System.out.print("Please enter your Character's race out of the listed options: ");
	        	race = userInput.nextLine();
	        	if(DndInfo.races.contains(race))
	        	{
	        		break;
	        	}
	        	else
	        	{
	        		System.out.println("\"" + race + "\" is not valid. Please make a valid choice.");
	        		System.out.println(""); // print empty line
	        	}
	        }

	        character.race = race;
	        System.out.println(""); // print empty line
	    }
		
		int Class;
		// System.out.println("Choose a class:" + Class);
		// Class = 1
		getCharacterClass();
		
		// User will choose a Class. Race limits will only permit specific Class choice.
		public static void getCharacterClass()
		{
	    	String characterClass;
	        while(true){
	        	// string to print out race options
	        	StringBuilder newsb = new StringBuilder();
	        	newsb.append("Classes to choose from: ");
	        	String delimiter = ""; 
	        	for(String s : Info.classes)
	        	{
	        		newsb.append(delimiter);
	        		delimiter = ", ";
	        		newsb.append(s);
	        	}
	        	//print all race options
	        	System.out.println(newsb.toString());
	        	
	        	System.out.print("Please enter your Character's class out of the listed options: ");
	        	characterClass = userInput.nextLine();
	        	if(Info.classes.contains(characterClass))
	        	{
	        		break;
	        	}
	        	else
	        	{
	        		System.out.println("\"" + characterClass + "\" is not a valid class. Please choose a valid class.");
	        		System.out.println(""); // print empty line
	        	}
	        }

	        character.characterClass = characterClass;

	        System.out.println(""); // print empty line
	    }
		
		// Character Ability Scores. Abilities will be modified by Race and Class choices.
		
		int Strength, Intelligence, Wisdom, Dexterity, Constitution, Charisma;
		int roll; 
		Strength = (int)(Math.random()*18) + 1;
		Intelligence = (int)(Math.random()*18) + 1;
		Wisdom = (int)(Math.random()*18) + 1;
		Dexterity = (int)(Math.random()*18) + 1;
		Constitution = (int)(Math.random()*18) + 1;
		Charisma = (int)(Math.random()*18) + 1;
		roll = Strength + Intelligence + Wisdom + Dexterity + Constitution + Charisma;
		System.out.println("Strength: " + Strength);
		System.out.println("Intelligence:" + Intelligence);
		System.out.println("Wisdom:" + Wisdom);
		System.out.println("Dexterity:" + Dexterity);
		System.out.println("Constitution:" + Constitution);
		System.out.println("Charisma:" + Charisma);
		System.out.println("Your total stat score is: " + roll);
		
		// Choose a character name and Alignment
		// Choose starting equipment
		} 
} 

