public class Seat {

	int seatNumber;
	int rowNumber;
	String seatType;
	double price;
	boolean isBooked=false;



	Seat (int seatNumber, int rowNumber, String seattype, double price) {

		this.seatNumber = seatNumber;
		this.rowNumber = rowNumber;
		this.seatType = seatType;
		this.price = price;

	}



	public void setIsBooked(boolean isBooked){
		this.isBooked = isBooked;
	}




	boolean bookSeat () {

		if (!isBooked) {

			isBooked = true;
			return true;
		}

		return false;
	}


 	

	void displaySeat () {

		System.out.print ("Seat Number: " + seatNumber + ", Row Number: " + rowNumber + ", Seat Type: " + seatType + ", Price: " + price ); 

	}

}