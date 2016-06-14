package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class HotelRoomDbMenu extends HotelRoomDb {
	
	
	public void initMenu(){
			int menuNumber = 0;

			do{
			   System.out.println();
			   System.out.println();
			   System.out.printf("Welcome to the CS1B Hotel Reservation System");
			   System.out.println("Choose an item form the menu:");
			   System.out.println();
			   System.out.println("1. View Hotel Guest Listings");
			   System.out.println("2. View Casino Guest Listings");
			   System.out.println("3. View Motel Guest Listings");
			   System.out.println("4. Quit ");
			    BufferedReader br = null;
			    String data = null;

			try {   
			      br = new BufferedReader (new InputStreamReader (System.in));
			      System.out.println("Enter You Choice:");
			      data = br.readLine ( );
			      menuNumber = Integer.parseInt (data);
			      }  
			catch ( IOException e)  {
			  e.printStackTrace ();
			  } 

		    switch(menuNumber){

			   case 1 : printHotelGuest();
			       break;

			    case 2 : printCasinoGuest();
			       break;

			    case 3 : printMotelGuest();
			        break;

			    case 4 : quit();

			break;

			} 

			}while(menuNumber < 4);

	}
	
	void printHotelGuest(){
		for(Map.Entry<Integer,HotelRoom> entry : Tmap.entrySet()){
		Integer key = entry.getKey();
		HotelRoom room = entry.getValue();
		if(room.getHotelType().equals("hotel"))
		System.out.println( room.getHotelName() + ", " + room.getCustomerName());
		}
		 
	 }
	void printCasinoGuest(){
		for(Map.Entry<Integer,HotelRoom> entry : Tmap.entrySet()){
		Integer key = entry.getKey();
		HotelRoom room = entry.getValue();
		if(room.getHotelType().equals("casino"))
		System.out.println( room.getHotelName() + ", " + room.getCustomerName());
		}
	 }
	void printMotelGuest(){
		for(Map.Entry<Integer,HotelRoom> entry : Tmap.entrySet()){
		Integer key = entry.getKey();
		HotelRoom room = entry.getValue();
		if(room.getHotelType().equals("motel"))
		System.out.println( room.getHotelName() + ", " + room.getCustomerName());
		}
		 
	 }
	void quit(){
		System.out.println("Goodbye!");
	}

}
