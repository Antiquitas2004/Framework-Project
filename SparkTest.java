package sparktest;

public class SparkTest 
{
		public static void main(String[] args)
		{
		// User will choose a character race. 
		int Race;
		// System.out.println("Choose your race from the following; Human, Elf, Dwarf, Half-Elf, Half- Orc" + Race);
	    // Race = 1
		
	    // User will choose a Class. Race limits will only permit specific Class choice.
		int Class;
		// System.out.println("Choose a class:" + Class);
		// Class = 1
		
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
