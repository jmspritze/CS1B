package project;

public class CasinoHotel extends HotelRoom {
	
	    private Integer numberOfBeds;
	    private String amenities;
	    private String view;

	  //Constructor for DataBase objects
	
	CasinoHotel(
	      //too many
			String hName,
			String hType,
			Integer rNumber,
			String rTypem,
			Integer nBeds,
			String amens,
			String views,
			double rPrice,
			String cName,
			String cAddress,
			String cCreditCard,
			Integer cNumber,
			Integer bDays,
			double cmmisions){
	    this.setHotelName(hName);
	    this.setHotelType(hType);
	    this.setRoomNumber(rNumber);   //setRoomNumber(rNumber);
	    numberOfBeds = nBeds;
	    amenities = amens;
	    view = views;
	    this.setRoomPrice(rPrice);   
	    this.setCustomerName(cName);
	    this.setCustomerAddress(cAddress);
	    this.setCustomerCreditCard(cCreditCard);
	    this.setConfirmationNumber(cNumber);
	    this.setBookingDays(bDays);
	    this.setCommision(cmmisions);
		
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
