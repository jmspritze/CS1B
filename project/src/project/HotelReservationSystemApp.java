package project;

public class HotelReservationSystemApp {
	public static void main(String[] args){

	//HotelReservation hotelReservation = new HotelReservation();
	//hotelReservation.ReportAllReservations();
	//hotelReservation.ShowCasinoRooms();
		HotelRoomDbMenu db = new HotelRoomDbMenu();
		db.readDataBase();
		db.initMenu();

	
	}
}
