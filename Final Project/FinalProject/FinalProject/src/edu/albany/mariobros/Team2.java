package edu.albany.mariobros;

import java.util.ArrayList;

public class Team2 extends Player<String> { 

	private ArrayList<Player<String>> players;
	
	//when a team is created two players are added to the team
	public Team2(String teamName) {
		super(teamName);	
		players = new ArrayList<>();
		players.add(new Player<String>("Princess Peach"));
		players.add(new Player<String>("Bowser"));
 	}

	
	public String toString() {
	
		System.out.println(super.teamName + "\n******");
		
		for(Player<String> x: players) {
			System.out.println(x.getName());
		}
		
		return "";
	}
}
