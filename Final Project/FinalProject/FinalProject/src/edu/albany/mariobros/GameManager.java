package edu.albany.mariobros;

public class GameManager {

	public static void main(String[] args) {	
		
		System.out.println("GAME STREAM OPEN\n****************");
	
		//creates list of viewers
		ViewerUpdate up = new ViewerUpdate(); 
		
		//add at least 2 viewers
		Viewing all = new Viewing();
		Viewing person1 = new Viewing("donkeykong2012");
		Viewing person2 = new Viewing("jacktheripper");
		
		//update viewers
		up.addViewer(person1);
		all.update(up, up.getNewViewer().getViewerName());
		
		up.addViewer(person2);
		all.update(up, up.getNewViewer().getViewerName());
		
		System.out.println();

		//updated list
		up.update();

		
		//GAME START
		//TEAM 1
		System.out.println("TEAMS BEING ASSIGNED");
		Player<String> team1 = new Team1("Team 1");
		System.out.println(team1);

		Team1Score mario = Team1Score.getScore(); //Singleton
		Team1Score luigi = Team1Score.getScore();

		//TEAM 2
		Player<String> team2 = new Team2("Team 2");
		System.out.println(team2);

		Team2Score peach = Team2Score.getScore();
		Team2Score bowser = Team2Score.getScore();

		
		System.out.println("GAME START\n**********");
		
		mario.addCoin("Mario");
		luigi.addCoin("Luigi");
		System.out.println(mario);				
		System.out.println();


		peach.addCoin("Peach");
		bowser.addCoin("Bowser");
		System.out.println(peach + "\n");
		
		//add 2 more to list
		//more updates

		Viewing person3 = new Viewing("jennyfromtheblock");
		up.addViewer(person3);
		all.update(up, up.getNewViewer().getViewerName());
		up.update();
	
		Viewing person4 = new Viewing("clair");
		up.addViewer(person4);
		all.update(up, up.getNewViewer().getViewerName());
		up.update();
		
		//Team 1 Score Updates
		mario.addCoin("Mario");
		luigi.addCoin("Luigi");
		System.out.println(mario + "\n");

		//Team 2 Score Updates
		peach.addCoin("Peach");
		bowser.loseCoin("Mario", "Bowser");
		System.out.println(peach + "\n");		
		
		up.removeViewer(person3);
		all.update(up, person3.getViewerName());
		up.update();
		
		mario.addCoin("Mario");
		System.out.println(mario);
		
		up.removeViewer(person1);
		all.update(up, person1.getViewerName());
		up.removeViewer(person2);
		all.update(up, person2.getViewerName());
		up.removeViewer(person4);
		all.update(up, person4.getViewerName());
		up.update();
		
		System.out.println("GAME STREAM CLOSED");
	
		
		//maybe update viewers on viewer count, who joined and game stats
		
	}
}
