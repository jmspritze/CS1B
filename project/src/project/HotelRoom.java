package project;

public abstract class HotelRoom {
	protected String hotelName;
    protected String hotelType;
    protected String roomType;
	protected int roomNumber;
    protected Integer bookingDays;
	protected double roomPrice;
	protected int numGuests;
	protected String customerName;
    protected String customerAddress;
    protected Long customerCreditCard;
    protected Integer confirmationNumber;
    private double commision;
    private double finalBill; 
	protected boolean available; //Checks the room if its Free, false if not, true if it is. 
	protected String amenities = "no"; //default
	protected String view = "no"; //default
	


	//Default Constructor
	public HotelRoom(){ 
	}	
	
	//Abstract methods
	abstract void CheckIn();
	abstract void Checkout();
	abstract void CancelReservation();
	
    //Getters/setters
	
    public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	
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

	public Long getCustomerCreditCard() {
		return customerCreditCard;
	}
	public void setCustomerCreditCard(Long customerCreditCard ) {
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

	@Override 
	public String toString(){
		return "";
		// TO DO
	}

	public double commission() {
		System.out.println("$ 0.00");
		return 0.0;
	}

	public double getFinalBill() {
		return finalBill;
	}

	public void setFinalBill(double finalBill) {
		this.finalBill = finalBill;
	}

		
	
	
}

