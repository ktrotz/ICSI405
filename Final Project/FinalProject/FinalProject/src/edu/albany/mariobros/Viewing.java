package edu.albany.mariobros;

//import java.util.Hashtable;
import java.util.Observable;
import java.util.Observer;

//change name again maybe
public class Viewing implements Observer {	

	private ViewerUpdate status;
	private String viewer;
	
	public Viewing(String viewer) {
		this.viewer = viewer;
	}
	
	public Viewing() {
		viewer = "";
	}
	
	public String getViewerName() {
		return viewer;
	}
	
	@Override
	public void update(Observable o, Object t) {
		
		status = (ViewerUpdate) o;
		
		if(status.getStatus())
			System.out.println(t + " started watching\n");	
		
		else
			System.out.println(t + " stopped watching\n");	
		
	}	
}
