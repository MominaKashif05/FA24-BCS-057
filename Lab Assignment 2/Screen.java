public class Screen {
    

	int screenNumber;
	String movieTitle;
	Seat[][] seats;  // Corrected 2D array declaration



	Screen(int screenNumber, String movieTitle, int rows, int cols) {

		this.screenNumber = screenNumber;
		this.movieTitle = movieTitle;
		this.seats = new Seat[rows][cols]; 


		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				seats[i][j] = new Seat(j + 1, i + 1, "Regular", 15.00);
			}
		}
	}




	public boolean bookSeat(int row, int col, Customer customer) {

		if (seats[row][col].bookSeat()) { 

			seats[row][col].setIsBooked(true);
			return true;
		}

        return false;
	}



	public void displayScreen() {

        	System.out.println("Screen: " + screenNumber + ", Movie: " + movieTitle);


        	for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {

				seats[i][j].displaySeat();
			}
		}
	}

}
