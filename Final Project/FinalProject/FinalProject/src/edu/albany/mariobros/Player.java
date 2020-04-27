package edu.albany.mariobros;

public class Player<T> {
	
	T teamName;
	
	public Player(T teamName) {
		this.teamName = teamName;
	}
	
	public T getName() {
		return teamName;
	}
}
