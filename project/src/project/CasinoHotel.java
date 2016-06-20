package project;

public class CasinoHotel extends HotelRoom implements CommissionAble{
	
	    private Integer numberOfBeds;
	    private String amenities;
	    private String view;
	    private double commissionRate = .2; 
	    
	  //Constructor for DataBase objects
	CasinoHotel(){}

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
	public double commission() {
		double result = (getRoomPrice()*getBookingDays()*getCommision());
		System.out.println("Earned " + result + " from " + getHotelName());	
		return result;
	}
	
	}

