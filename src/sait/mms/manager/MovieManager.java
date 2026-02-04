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
    	while(true) {
			System.out.println("\nMovie Management system");
			System.out.println("1 Add New Movie and Save");
			System.out.println("2 Generate List of Movies Released in a Year");
			System.out.println("3 Generate List of Random Movies");
			System.out.println("4 Exit");
			System.out.print("\nEnter an option: ");
			
			int choice;
			
			if(keyboard.hasNextInt()) {
				choice = keyboard.nextInt();
				keyboard.nextLine();
			} else {
				keyboard.nextLine();
				System.out.println("\nInvalid option");
				continue;
			}
			
			if (choice == 1) {
				addMovie();
			}else if (choice == 2) {
				generateMovieListInYear();
			}else if (choice == 3) {
				generateRandomMovieList();
			}else if (choice == 4) {
				saveMovieListToFile();
				System.out.println("Saving movies...");
				break;
			}else {
				System.out.println("\nInvalid option");
			}
    	}
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
