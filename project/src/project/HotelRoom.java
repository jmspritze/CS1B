package project;

public abstract class HotelRoom {

	protected int roomNumber;
	protected int roomPrice;
	protected int numGuests;
	
	abstract void CheckIn();
	abstract void Checkout();
	abstract void CancelReservation();
	
	//Default Constructor
	public HotelRoom(){ 
		this.roomNumber = 0;
		this.roomPrice = 50;
		this.numGuests = 0;
	}
	
	//Constructor
	public HotelRoom(int number, int price, int guests){
		this.roomNumber = number;
		this.roomPrice = price;
		this.numGuests = guests;
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

