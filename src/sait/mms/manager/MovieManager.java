package sait.mms.manager;

import java.io.*;
import java.util.*;//* means import all 
import sait.mms.problemdomain.Movie;
//o	The class should handle the user interface for the menu and
//the movie management functionality (adding movies, listing movies
//by year, generating random movies, and saving movies to file).
public class MovieManager {
	
	//attributes
	private ArrayList<Movie> movies = new ArrayList<>();
	private Scanner keyboard = new Scanner(System.in);
	private File file = new File("res/movies.txt");
	
	public MovieManager() {
		loadMovieList();
		displayMenu();
	}
	
	//loadMovieList: Loads the movie list from the movies.txt file.
	private void loadMovieList() {
		//store movie in ArrayList
		try {
			Scanner in = new Scanner(file);
			
			while (in.hasNext()) {
				String line = in.nextLine();
				String[] tokens = line.split(".");
				
				int duration = Integer.parseInt(tokens[0].trim());
				String title = tokens[1].trim();
				int year = Integer.parseInt(tokens[2].trim());
				
				Movie m = new Movie(duration, title, year);
				movies.add(m);
			}
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Movie file not found.");
		}
	}	
	
	//displayMenu: Displays the main menu to the user.
	private void displayMenu() {
		int choice = 0;
		//choice 1:
		addMovie();
		//choice 2:
		generateMovieListInYear();
		//choice 3:
		generateRandomMovieList();
		//choice 4:
		saveMovieListToFile();
		
	}
	//addMovie: Prompts the user to add a movie.	
	private void addMovie() {
		
		
	}

	//generateMovieListInYear: Displays movies released in a specific year.	
	private void generateMovieListInYear() {
		
	}

	//generateRandomMovieList: Generates and displays a random selection of movies.	
	private void generateRandomMovieList() {
		
	}

	//saveMovieListToFile: Saves all the movies in the list back to the data file (movies.txt). 
	private void saveMovieListToFile() {
		
	}		
}
