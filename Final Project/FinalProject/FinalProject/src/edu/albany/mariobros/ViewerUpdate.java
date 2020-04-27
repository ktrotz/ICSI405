package edu.albany.mariobros;

import java.util.Hashtable;
import java.util.Iterator;

/* <<Description>> 
 * Observer Design Pattern
 * 
 */

import java.util.Observable;

public class ViewerUpdate extends Observable {
	
	private static int count = 0;
	private int personCount = 0;
	private Viewing newViewer;
	private Viewing removedViewer;
	private Hashtable<Integer, Viewing> viewerList;
	private boolean status = false; //true = user added, false = user removed
	
	//Constructor
	public ViewerUpdate(){
		viewerList = new Hashtable<Integer, Viewing>();
	}

	public void addViewer(Viewing person) {
		//add to list
		newViewer = person;
		count++;
		personCount = count;
		viewerList.put(personCount, person);
		status = true;
	}
	
	public void removeViewer(Viewing person) {		
		removedViewer = person;
		
		Iterator<Integer> iter = viewerList.keySet().iterator();
		
		while(iter.hasNext()) {
		   Viewing i = viewerList.get(iter.next());
		   
		   if(i.getViewerName().equals(person.getViewerName())) {
			   iter.remove();
		   }
		}

		status = false;
	} 
	


	public void printViewers() {
		System.out.println("Updated Viewer List\n" + "*******************" );
		
		if(viewerList.size() == 0)
			System.out.println("No current viewers");

		else {
			for(Integer i: viewerList.keySet()) {		
				System.out.println(viewerList.get(i).getViewerName());
			}
		}

		System.out.println();
	}

	public Viewing getNewViewer() {
		return newViewer;
	}
	
	public Viewing getRemovedViewer() {
		return removedViewer;
	}
	
	public boolean getStatus() {
		return status;
	}

	public void update() {		
		printViewers();
	} 
}
