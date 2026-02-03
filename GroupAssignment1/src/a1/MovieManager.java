package a1;

import java.util.*;//* means import all 

public class MovieManager {
	
	//attributes
	private ArrayList<Movie> movies = new ArrayList<>();
	private Scanner keyboard = new Scanner(System.in);
	
	public MovieManager() {
		loadMovieList();
		displayMenu();
	}
	
	//loadMovieList
	private void loadMovieList() {
		// TODO Auto-generated method stub
		//store movie in ArrayList
	}	
	
	//displayMenu
	private void displayMenu() {
		//choice 1:
		addMovie();
		//choice 2:
		generateMovieListInYear();
		//choice 3:
		generateRandomMovieList();
		//choice 4:
		saveMovieListToFile();
		
	}
	//addMovie	
	private void addMovie() {
		// TODO Auto-generated method stub
		
	}

	//generateMovieListInYear	
	private void generateMovieListInYear() {
		// TODO Auto-generated method stub
		
	}

	//generateRandomMovieList	
	private void generateRandomMovieList() {
		// TODO Auto-generated method stub
		
	}

	//saveMovieListToFile
	private void saveMovieListToFile() {
		// TODO Auto-generated method stub
		
	}		
}