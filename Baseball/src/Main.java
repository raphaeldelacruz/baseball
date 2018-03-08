import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player Name:");
		String name = sc.nextLine();
		System.out.println("Enter Player Hits:");
		int hits = sc.nextInt();
		System.out.println("Enter Player At Bats:");
		int atBats = sc.nextInt();
		System.out.println("Enter Player Walks:");
		int walks = sc.nextInt();
		System.out.println("Enter Player Hits by Pitch:");
		int hitsbypitch = sc.nextInt();
		System.out.println("Enter Player Sacrifice Flys:");
		int sacflies = sc.nextInt();
		System.out.println("Enter Player Doubles:");
		int doubles = sc.nextInt();
		System.out.println("Enter Player Triples:");
		int triples = sc.nextInt();
		System.out.println("Enter Player Homeruns:");
		int hr = sc.nextInt();
		
		BaseballPlayer player1 = new BaseballPlayer(hits,atBats,walks,hitsbypitch,sacflies,doubles,triples,hr);
		
		// Babe Ruth = 2873, 8399, 2062, 43, 0, 506, 136, 714
		System.out.println("The Baseball Stats for " + name + " are:");
		System.out.println("Hits: " + hits + " At Bats: " + atBats + " Walks: " + walks 
				+ " Hits by Pitch: " + hitsbypitch + " Sacrifice Flies: " + sacflies + " Doubles: " 
				+ doubles + " Triples: " + triples + " Homeruns: " + hr);
		System.out.println("Batting Average: " + player1.getBA() + " OBP: " + player1.getOBP() + " SLG: " 
				+ player1.getSLG() + " OPS: " + player1.getOPS() + " TB: " + player1.getTB());		
	}
}
//HELP MEEEEEEE
