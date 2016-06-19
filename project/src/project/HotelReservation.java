package project;

import java.util.ArrayList;

public class HotelReservation {
	private String customerName;
	private String customerAddress;
	private int creditCardNumber;
	private int bookingDays;
	private int confirmationNumber;
	private ArrayList<HotelRoom> roomList;
	
	
	//Default Constructor
	public HotelReservation(){
		this.customerName = "";
		this.customerAddress = "";
		this.creditCardNumber = 0;
		this.bookingDays = 0;
		this.confirmationNumber = 0;
	}

	//regular Constructor
	public HotelReservation(String name, String address, int cardNumber, int bookingDays, int confirmNum){
		this.customerName = name;
		this.customerAddress = address;
		this.creditCardNumber = cardNumber;
		this.bookingDays = bookingDays;
		this.confirmationNumber = confirmNum;
	}
	
	
	public void ReadRoomList(){
		// TO DO
	}
	
	public void HotelReservationList(){
	// TO DO
	}
	
	public void RoomCheckIn(){
		// TO DO
	
	}
	
	public void RoomCheckout(){
		// TO DO
	}
	
	public void ExtendStay(){
	   // TO DO	
	}
	
	public void CancelRoomReservation(){
		// TO DO
	}
	
	public void SaveRoomReservation(){
		
	}

	public void ShowCasinoRooms() {
		// TODO Auto-generated method stub
		
	}

	public void ReportAllReservations() {
		// TODO Auto-generated method stub
		
	}
	
}

