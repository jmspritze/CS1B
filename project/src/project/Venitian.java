package project;



public class Venitian extends HotelRoom implements Casino {

	private String roomName;
	private String casinoName;
	private int maxGuestsPerRoom;
	private int casinoScore;
	
	public Venitian() {
		super();
		this.roomName = "";
		this.casinoName = "";
		this.maxGuestsPerRoom = 5;
		this.casinoScore = 0;
	}

	public Venitian(String rName, String cName, int maxGuests, int cScore, boolean checkIn){
		super();
		this.roomName = rName;
		this.casinoName = cName;
		this.maxGuestsPerRoom = maxGuests;
		this.casinoScore = cScore;
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
	void CancelReservation() {
		// TODO Auto-generated method stub

	}

}


