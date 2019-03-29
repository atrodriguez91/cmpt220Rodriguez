import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SoccerMatch {
	Date startTime;
	Date endTime;
	String location;
	String home;
	String visitor;
	Player homePlayers[];
	Player visitorPlayers[];
	Goal homeGoals[];
	Goal visitorGoals[];
	int homePlayerCount, visitPlayerCount;
	int homeGoalCount, visitGoalCount;

	SoccerMatch() {
		
		startTime = null;
		endTime = null;
		
		homePlayers = new Player[11];
		visitorPlayers = new Player[11];
		
		homeGoals = new Goal[10];
		visitorGoals = new Goal[10];
		
		homePlayerCount = 0;
		visitPlayerCount = 0;
		
		homeGoalCount = 0;
		visitGoalCount = 0;
		
		for (int i = 0; i < 11; i++) {
			homePlayers[i] = new Player();
			visitorPlayers[i] = new Player();
		}
		
		for (int i = 0; i < 10; i++) {
			homeGoals[i] = new Goal();
			visitorGoals[i] = new Goal();
		}
	}
	
	SoccerMatch(Date start, Date end, String loc, String hom, String visi) {
		this();
		
		startTime = start;
		endTime = end;
		location = loc;
		home = hom;
		visitor = visi;
	}
	
	void addHomePlayer(Player p) {
		homePlayers[homePlayerCount++] = p;
	}
	
	void addVisitorPlayer(Player p) {
		visitorPlayers[visitPlayerCount++] = p;
	}
	
	void addHomeGoal(Goal g) {
		homeGoals[homeGoalCount++] = g;
	}
	
	void addVisitorGoal (Goal g) {
		visitorGoals[visitGoalCount++] = g;
	}
	
	int [] getHomeGoals() {
		int goals[] = new int[10];
		
		for (int i = 0; i < 10; i++)
			goals[i] = homeGoals[i].getPlayer().getGoals();
		return goals;
	}
	
	int [] getVisitorGoals() {
		int goals[] = new int[5];
		
		for (int i = 0; i < 10; i++)
			goals[i] = visitorGoals[i].getPlayer().getGoals();
		return goals;
	}
	
	String whoWon() {
		String winStat = "";
		
		int homeGoals[] = getHomeGoals();
		int visitGoals[] = getVisitorGoals();
		int toHome = 0;
		int toVisit = 0;
		
		for (int i = 0; i < 10; i++) {
			toHome += homeGoals[i];
			toVisit += visitGoals[i];
		}
		
		if (toHome > toVisit)
			winStat += "\n Winner: Home";
		else if (toVisit > toHome)
			winStat += "\n Winner: Visitor";
		else
			winStat += "\n Tie: ";
		
		return winStat;
	}
	
	public static void main(String[] args)

	{

	Random rand = new Random();

	Date d1 = new Date(2019, 4, 10, 10, 12, 30);

	Date d2 = new Date(2019, 4, 10, 12, 40, 30);

	SoccerMatch sm = new SoccerMatch(d1, d2, "World Cup", "USA", "Brazil");

	String homePlayerName [] = {"Dude 1", "Dude 2", "Dude 3", "Dude 4", "Dude 5", "Dude 6", "Dude 7", "Dude 8", "Dude 9", "Dude 10", "Dude 11"};

	String visitPlayerName [] = {"Dudette 1", "Dudette 2", "Dudette 3", "Dudette 4", "Dudette 5", "Dudette 6", "Dudette 7", "Dudette 8", "Dudette 9", "Dudette 10", "Dudette 11"};

	
	for(int i = 0; i < 11; i++) {
		
	sm.addHomePlayer(new Player(homePlayerName[i], "USA", rand.nextInt(10)));

	sm.addVisitorPlayer(new Player(visitPlayerName[i], "Brazil", rand.nextInt(10)));

	}

	for(int i = 0; i < 10; i++) {

	sm.addHomeGoal(new Goal(rand.nextInt(59), sm.homePlayers[i]));

	sm.addVisitorGoal(new Goal(rand.nextInt(59), sm.visitorPlayers[i]));

	}

	System.out.print("\n\n---------Home Team Players --------- ");

	for(int i = 0; i < 11; i++)

	System.out.println(sm.homePlayers[i]);

	System.out.print("\n\n---------- Visiting Team Players --------- ");

	for(int i = 0; i < 11; i++)

	System.out.println(sm.visitorPlayers[i]);

	System.out.print("\n\n--------- Home Team Goals ----------");

	for(int i = 0; i < 10; i++)

	System.out.print("\n\n---------- Visiting Team Goals ---------- ");

	for(int i = 0; i < 10; i++)

	System.out.println(sm.visitorGoals[i]);

	System.out.print("\n\n---------- GAME STATUS ---------");

	System.out.println(sm.whoWon());


	}
	
	
		// Not sure why its throwing an error on last method

}
