
public class VenetianHotel extends Room implements Casino {

	private String roomName;
	private String casinoName;
	private int maxGuestsPerRoom;
	private int casinoScore;
	boolean checkIn;
	
	public VenetianHotel() {
		super();
		this.roomName = "";
		this.casinoName = "";
		this.maxGuestsPerRoom = 5;
		this.casinoScore = 0;
		this.checkIn = false;
	}

	public VenetianHotel(String rName, String cName, int maxGuests, int cScore, boolean checkIn){
		super();
		this.roomName = rName;
		this.casinoName = cName;
		this.maxGuestsPerRoom = maxGuests;
		this.casinoScore = cScore;
		this.checkIn = checkIn;
	}
	
	@Override
	void CheckIn() {
		// TODO Auto-generated method stub
	}

	@Override
	void Checkout() {
		// TODO Auto-generated method stub

	}

	@Override
	void Extend() {
		// TODO Auto-generated method stub

	}

	@Override
	void CancelReservation() {
		// TODO Auto-generated method stub

	}

}
