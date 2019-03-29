
public class Player {
	
	private String name;
	private String team;
	private int goals;
	
	Player() {
		
	}
	
	Player (String name, String team, int goal) {
		this.name = name;
		this.goals = goal;
		this.team = team;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setTeam (String team) {
		this.team = team;
	}
	
	void setGoals (int goals) {
		this.goals = goals;
	}
	
	String getName() {
		return name;
	}
	
	String getTeam() {
		return team;
	}
	
	int getGoals() {
		return goals;
	}
	
	public String toString() {
		return "\n Player Name: " + name + "\t Team: " + team + "\t Goals: " + goals;
	}

}
