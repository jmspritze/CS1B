
public abstract class Room {

	protected int roomNumber;
	protected int roomPrice;
	protected int numGuests;
	protected String cityName;
	
	abstract void CheckIn();
	abstract void Checkout();
	abstract void Extend();
	abstract void CancelReservation();
	
	//Default Constructor
	public Room(){ 
		this.roomNumber = 0;
		this.roomPrice = 50;
		this.numGuests = 0;
		this.cityName = "";
	}
	
	//Constructor
	public Room(int number, int price, int guests, String city){
		this.roomNumber = number;
		this.roomPrice = price;
		this.numGuests = guests;
		this.cityName = city;
	}
	
	
	
	public void Reservation(){
		// TO DO
		 //Enter number of days want to reserve. Calculate price by multiplying number of days with price. 
		 //Ask confirmation from guest to reserve and generate confirmation number using 
		 //Math.random. and save to other text file
		// TO DO
	}
	
	@Override 
	public String toString(){
		return "";
		// TO DO
	}
	
	 // Casino method
	public int play() {
		return 0; // TO DO
	}
	
	
}
