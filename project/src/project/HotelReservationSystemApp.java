package project;

public class HotelReservationSystemApp {
	public static void main(String[] args){

	//HotelReservation hotelReservation = new HotelReservation();
	//hotelReservation.ReportAllReservations();
	//hotelReservation.ShowCasinoRooms();
		HotelRoomDb db = new HotelRoomDb();
		db.readDataBase();
		db.printDb();

	
	}
}
