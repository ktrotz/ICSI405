package edu.albany.hw5;

import java.util.regex.*;
import java.io.*;

class Grep implements Runnable{
	
	static String n = "";
	static String word = "";
	static String text = "";
	private int startPos;
	
	static Pattern pattern = null;
	static BufferedReader input = null;
	static BufferedReader copyInput = null;
	static BufferedReader copyInput2 = null;
	static BufferedReader copyInput3 = null;
	
	public Grep(int startPos) {
		this.startPos = startPos;
	}
	
	public void run() {
		
		long startTime = System.currentTimeMillis();
		
		//Read file
		try {
			String s;
			int i = 0;
			int length = 0;

			//file length
			while(copyInput.readLine() != null) {
				length++;
			}

			//1st Thread
			if(startPos < length/2)
			{
				if(n.equals("-n"))
				{
					while ((s = copyInput2.readLine()) != null) {
						i++;
						Matcher m = pattern.matcher(s);
						if (m.find())
							System.out.println(i+ " " + s);
					}
				}

				else
					while ((s = copyInput2.readLine()) != null) {
						Matcher m = pattern.matcher(s);
						if (m.find())
							System.out.println(s);
					}
			}
		
			//2nd Thread
			if(startPos >= length/2)
			{
				for(int x = length/2; x < length; x++)
				{
					if(n.equals("-n"))
					{
						while ((s = copyInput2.readLine()) != null) {
							i++;
							Matcher m = pattern.matcher(s);
							if (m.find())
								System.out.println(i+ " " + s);
						}
					}

					else
						while ((s = copyInput2.readLine()) != null) {
							Matcher m = pattern.matcher(s);
							if (m.find())
								System.out.println(s);
						}
				}
			}

		}

		catch (Exception e) {
			System.err.println("Line not found: " + e.getMessage());
			System.exit(1);
		}
		
        long endTime = System.currentTimeMillis();
		
		long timeElapsed = endTime - startTime;
		
		System.out.println("Thread Time in milliseconds: " + timeElapsed);
		
}


	public static void main(String args[]) throws IOException {



		long startTime = System.currentTimeMillis();
		
		if(args.length == 4) {
			n = args[1];
			word = args[2];
			text = args[3];
		}
		
		else if(args.length == 3) {
			n = "";
			word = args[1];
			text = args[2];
		}
		
		/********************************************************************/

		//Receive word
		        // Compiled RE
		try {
			pattern = Pattern.compile(word);
		} 
			
		catch (PatternSyntaxException e) {
			System.err.println("Word not found: " + e.getDescription());
			System.exit(1);
		}
		
		/********************************************************************/

		//Read file
		
		try {			
			input = new BufferedReader(new InputStreamReader(new FileInputStream(text)));
		} 
		
		catch (FileNotFoundException e) {
			System.err.println("File not found: " +	text + ": " + e.getMessage());
			System.exit(1);
		}
		
		try {			
			copyInput = new BufferedReader(new InputStreamReader(new FileInputStream(text)));
		} 
		
		catch (FileNotFoundException e) {
			System.err.println("File not found: " +	text + ": " + e.getMessage());
			System.exit(1);
		}
		
		try {			
			copyInput2 = new BufferedReader(new InputStreamReader(new FileInputStream(text)));
		} 
		
		catch (FileNotFoundException e) {
			System.err.println("File not found: " +	text + ": " + e.getMessage());
			System.exit(1);
		}
		
		try {			
			copyInput3 = new BufferedReader(new InputStreamReader(new FileInputStream(text)));
		} 
		
		catch (FileNotFoundException e) {
			System.err.println("File not found: " +	text + ": " + e.getMessage());
			System.exit(1);
		}
		
		
		/********************************************************************/
		
		//Find word
		try {
			String s;
			int i = 0; 
			
			if(n.equals("-n"))
			{
				while ((s = input.readLine()) != null) {
					i++;
					Matcher m = pattern.matcher(s);
					if (m.find())
						System.out.println(i+ " " + s);
				}
			}
			
			else
				while ((s = input.readLine()) != null) {
					Matcher m = pattern.matcher(s);
					if (m.find())
						System.out.println(s);
				}
			
			
		}
		
		catch (Exception e) {
			System.err.println("Line not found: " + e.getMessage());
			System.exit(1);
		}
		
		long endTime = System.currentTimeMillis();
		
		long timeElapsed = endTime - startTime;
		
		System.out.println("Time in milliseconds: " + timeElapsed);
		
		
		
		/********************************************************************/
		
		///THREADS
		int length = 0;

		//file length
		while(copyInput3.readLine() != null) {
				length++;
				
		}
		
		
		Runnable run1 = new Grep(0);
		Runnable run2 = new Grep(length/2);
		
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run2);
		thread1.start();

		synchronized(thread1){
            try{
                thread1.wait();
            }
            
            catch(InterruptedException e){
                e.printStackTrace();
            }
            thread2.notify(); 
             
    }
		 
		
		
	}
}