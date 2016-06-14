package project;

public abstract class HotelRoom {

	
	private String hotelName;
    private String hotelType;
	private int roomNumber;
    private Integer bookingDays;
	private double roomPrice;
	private int numGuests;
    private String customerName;
    private String customerAddress;
    private String customerCreditCard;
    private Integer confirmationNumber;
    public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelType() {
		return hotelType;
	}
	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}
	public int getNumGuests() {
		return numGuests;
	}
	public void setNumGuests(int numGuests) {
		this.numGuests = numGuests;
	}

	private double commision;
	
	protected boolean available; //Checks the room if its Free, false if not, true if it is. 
	
	abstract void CheckIn();
	abstract void Checkout();
	abstract void CancelReservation();
	
	//Default Constructor
	public HotelRoom(){ 
		this.setRoomNumber(0);
		this.setRoomPrice(50);
		this.numGuests = 0;
		this.available= false;
	}
	
	//Constructor
	public HotelRoom(int number, int price, int guests){
		this.setRoomNumber(number);
		this.setRoomPrice(price);
		this.numGuests = guests;
	}
	
	
	
	@Override 
	public String toString(){
		return "";
		// TO DO
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerCreditCard() {
		return customerCreditCard;
	}
	public void setCustomerCreditCard(String customerCreditCard) {
		this.customerCreditCard = customerCreditCard;
	}

	public Integer getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(Integer confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public Integer getBookingDays() {
		return bookingDays;
	}
	public void setBookingDays(Integer bookingDays) {
		this.bookingDays = bookingDays;
	}

	public double getCommision() {
		return commision;
	}
	public void setCommision(double commision) {
		this.commision = commision;
	}

	public class HotelGuest {
		private String customerName;
	    String customerAddress;
	    String customerCreditCard;

	}

	
}

