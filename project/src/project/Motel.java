package project;

public class Motel extends HotelRoom {
	
    private Integer numberOfBeds;
  //Constructor for DataBase objects

Motel(String hName,
	  String hType,
	  Integer rNumber,
	  String rTypem,
	  Integer nBeds,
	  double rPrice,
	  String cName,
	  String cAddress,
	  String cCreditCard,
	  Integer cNumber,
	  Integer bDays,
	  double cmmisions)
{

    this.setHotelName(hName);
    this.setHotelType(hType);
    this.setRoomNumber(rNumber);   //setRoomNumber(rNumber);
    numberOfBeds = nBeds;
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
