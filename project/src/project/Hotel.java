package project;

public class Hotel extends HotelRoom implements CommissionAble {
	
    private Integer numberOfBeds;
    private String amenities;
    private String view;
    
  //Constructor for DataBase objects something
Hotel(){}


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


@Override
// Calculates commission earned and Print it.
public double commission() {
	double result = (getRoomPrice()*getBookingDays()*getCommision());
	System.out.println("Earned " + result + " from " + getHotelName());	
	return result;
}

}