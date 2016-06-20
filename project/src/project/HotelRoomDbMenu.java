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
			   System.out.println("Welcome to the CS1B Hotel Reservation System");
			   System.out.println("Choose an item from the menu:");
			   System.out.println();
			   System.out.println("1. Guest CheckIn");
			   System.out.println("2. Guest Check Out");
			   System.out.println("3. View Guest Listings");
			   System.out.println("4. View Total Booking Revenue");
			   System.out.println("5. View Total Commissions");
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

			    case 1 : printGuestInfo();
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
	
	void printGuestInfo(){
		int menuNumber2 = 0;
		   System.out.println("Choose Guest List to view:");
		   System.out.println();
		   System.out.println("1. View Hotel Guest Listings");
		   System.out.println("2. View Casino Guest Listings");
		   System.out.println("3. View Motel Guest Listings");
		   System.out.println("4. View All Guest Listings");
	
		try {   
		      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		      System.out.println("Enter You Choice:");
		      String data = br.readLine ( );
		      menuNumber2 = Integer.parseInt (data);
		      }  
		catch ( IOException e)  {
		  e.printStackTrace ();
		  } 

	    switch(menuNumber2){

		    case 1 : printHotelGuest();
		        break;

		    case 2 : printCasinoGuest();
		        break;

		    case 3 : printMotelGuest();
		        break;
		        
		    case 4: printAllGuest();
	        break;	        
	    }
		 
	 }
	
	void printHotelGuest(){
		String title = "Hotel Guests";
		System.out.format("%40s\n",title);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Hotel" + "\t\t" + "Guest Name" + "\t\t" + "Address" + "\t\t\t\t" + "Credit Card Number" );
		System.out.println();
		for(Map.Entry<Integer,HotelRoom> entry : Tmap.entrySet()){
		HotelRoom room = entry.getValue();
		if(room.getHotelType().equals("hotel"))
		System.out.format(room.hotelName + "\t" + room.customerName + "\t" + room.customerAddress + "\t\t" + room.customerCreditCard+"\n");
		}
		 
	 }
	void printCasinoGuest(){
		String title = "Casino Guests";
		System.out.format("%40s\n",title);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Casino" + "\t\t" + "Guest Name" + "\t\t" + "Address" + "\t\t\t\t" + "Credit Card Number" );
		System.out.println();
		for(Map.Entry<Integer,HotelRoom> entry : Tmap.entrySet()){
		HotelRoom room = entry.getValue();
		if(room.getHotelType().equals("casino"))
		System.out.format(room.hotelName + "\t" + room.customerName + "\t" + room.customerAddress + "\t\t" + room.customerCreditCard+"\n");
		}
		 
	 }
	void printMotelGuest(){
		String title = "Motel Guests";
		System.out.format("%40s\n",title);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Motel" + "\t\t" + "Guest Name" + "\t\t" + "Address" + "\t\t\t\t" + "Credit Card Number" );
		System.out.println();
		for(Map.Entry<Integer,HotelRoom> entry : Tmap.entrySet()){
		HotelRoom room = entry.getValue();
		if(room.getHotelType().equals("motel"))
		System.out.format(room.hotelName + "\t" + room.customerName + "\t" + room.customerAddress + "\t\t" + room.customerCreditCard+"\n");
		}	 
	 }
	
	void printAllGuest(){
		String title = "All Guests";
		System.out.format("%40s\n",title);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Accomidationd" + "\t\t" + "Guest Name" + "\t\t\t" + "Address" + "\t\t\t\t" + "Credit Card Number" );
		System.out.println();
		for(Map.Entry<Integer,HotelRoom> entry : Tmap.entrySet()){
		HotelRoom room = entry.getValue();
		//if(room.getHotelType().equals("motel"))
		System.out.format(room.hotelName + "\t\t" + room.customerName + "\t\t" + room.customerAddress + "\t\t" + room.customerCreditCard+"\n");
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
