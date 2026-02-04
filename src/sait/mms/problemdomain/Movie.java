package sait.mms.problemdomain;
//The main method will serve as the entry point to the program, initializing the necessary components and triggering the main menu.
public class Movie {
	//attributes
	private int duration;//in minutes
	private String title;
	private int year;
	
	
	//non-default constructor
	
	public Movie(int duration, String title, int year) {
		this.duration = duration;
		this.title = title;
		this.year = year;
	}


	//public getters (3)
	public int getDuration() {
		return duration;
	}


	public String getTitle() {
		return title;
	}


	public int getYear() {
		return year;
	}

	//public format to file method
	//return string no spaces with a comma
	//File IO
	public String formatForFile() {
		return duration + "," + title + "," + year;
	}
	
	
	//Overridden toString
	@Override
	public String toString() {
		return duration + "\t\t" + year + "\t" + title;
//		return String.format("Movie [duration=%s, title=%s, year=%s]", duration, title, year);
	}
	
}
