package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Random;

public class HotelRoomDbMenu extends HotelRoomDb {
	
	
	public void initMenu(){
			int menuNumber = 0;

			do{
			   System.out.println();
			   System.out.println();
			   System.out.printf("Welcome to the CS1B Hotel Reservation System");
			   System.out.println("Choose an item from the menu:");
			   System.out.println();
			   System.out.println("1. View Hotel Guest Listings");
			   System.out.println("2. View Casino Guest Listings");
			   System.out.println("3. View Motel Guest Listings");
			   System.out.println("4. Make a Reservation");
			   System.out.println("5. Cancel a Reservation");
			   System.out.println("6. Quit ");
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
			        
			//    case 4: makeReservation();
			  //  	break;
			    	
			    case 5: cancelReservation();
			    	break;
			    	
			    case 6 : quit();
			    	break;

			} 

			}while(menuNumber < 7);

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
	

	// Creates and returns a reservation
	/*INCOMPLETE METHOD vvvv What do we want to do with the reservation we create? read it into a file?
	HotelReservation makeReservation(){ 
		BufferedReader br = null;
		Random rand = new Random();
	    HotelReservation Reservation = new HotelReservation();
		try {   
			      br = new BufferedReader (new InputStreamReader (System.in));
				  System.out.println("Name?");
			      Reservation.setCustomerName(br.readLine());
				  System.out.println("Address?");
			      Reservation.setCustomerAddress(br.readLine());
			      System.out.println("How many days do you plan on staying?");
			      Reservation.setBookingDays(Integer.parseInt(br.readLine()));
			      System.out.println("Please enter Credit Card Number");
			      Reservation.setCreditCardNumber(Integer.parseInt(br.readLine()));
			      int generatedConfirmationNumber =  rand.nextInt(89999)+10000; // generate random int from 10000-99999
			      Reservation.setConfirmationNumber(generatedConfirmationNumber);
			      System.out.println("Reservation Created. Your confirmation number is: " + generatedConfirmationNumber);
			    	  
		      }  
		catch ( IOException e)  {
			  e.printStackTrace ();
			  }
		
		return Reservation;

	};*/
	
	
	void cancelReservation(){
	
	};
	
	
	void quit(){
		System.out.println("Goodbye!");
	}

}
