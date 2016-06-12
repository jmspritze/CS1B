package project;

public abstract class HotelRoom {

	protected int roomNumber;
	protected int roomPrice;
	protected int numGuests;
	protected boolean available; //Checks the room if its Free, false if not, true if it is. 
	
	abstract void CheckIn();
	abstract void Checkout();
	abstract void CancelReservation();
	
	//Default Constructor
	public HotelRoom(){ 
		this.roomNumber = 0;
		this.roomPrice = 50;
		this.numGuests = 0;
		this.available= false;
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
	

	
}

