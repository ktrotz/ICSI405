package edu.albany.mariobros;

import java.util.ArrayList;

/*Generics and Inheritance*/
public class Team1 extends Player<String> {
	
	private ArrayList<Player<String>> players;
	
	//when a team is created two players are added to the team
	public Team1(String teamName) {
		super(teamName);	
		players = new ArrayList<>();
		players.add(new Player<String>("Mario"));
		players.add(new Player<String>("Luigi"));
 	}

	public String toString() {
		
		System.out.println(super.teamName + "\n******");
		
		for(Player<String> x: players) {
			System.out.println(x.getName());
		}
		
		return "";
	}
	

}
