
public class HolidayInn extends Room implements Casino {

	private String roomType; // Normal or Conference Room
	private String casinoName;
	private int casinoScore;
	
	
	public HolidayInn() {
		super();
		this.roomType = "";
		this.casinoName = "";
		this.casinoScore = 0;
	}

	public HolidayInn(String rType, String cName, int cScore){
		super();
		this.roomType = rType;
		this.casinoName = cName;
		this.casinoScore = cScore;
	}
	
	@Override
	public int play() {
		// TODO Auto-generated method stub
		return 0;
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
