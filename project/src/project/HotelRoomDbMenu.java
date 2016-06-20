package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Random;

public class HotelRoomDbMenu extends HotelRoomDb {
	
    HotelRoom roomCheckIn = new HotelReservation();
    
	public void initMenu(){
			int menuNumber = 0;

			do{
			   System.out.println();
			   System.out.println();
			   System.out.println("Welcome to the CS1B Hotel Reservation System");
			   System.out.println("Choose an item from the menu:");
			   System.out.println();
			   System.out.println("1. Guest Check In");
			   System.out.println("2. Guest Check Out");
			   System.out.println("3. View Guest Listings");
			   System.out.println("4. View Total Commissions and Revenue");
			   System.out.println("5. Quit ");
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

			    case 1 : guestCheckIn();
			        break;

			    case 2 : guestCheckOut();
			        break;

			    case 3 : printGuestInfo();
			        break;

			    	
			    case 4: totalCommissions();
			    	break;
			    	
			   
			    case 5 : quit();
			    	break;

			} 

			}while(menuNumber < 7);

	}
	
	
	private void totalCommissions() {
		int revenue = 0;
		String title = "Commissions";
		System.out.format("%50s\n",title);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		for(Map.Entry<Integer,HotelRoom> entry : Tmap.entrySet()){
			HotelRoom room = entry.getValue();
			if(room.getHotelType().equals("hotel") || room.getHotelType().equals("casino"))
				System.out.println("working"); // test
				revenue += room.commission();
		}
		
		
	}


	private void guestCheckOut() {
		// TODO Auto-generated method stub
		
	}

	private void guestCheckIn() {

		   pickHotelType();
		   System.out.println();
		   pickRoomType();

		// Creates entry in guestlist.txt
			BufferedReader br = null;
			Random rand = new Random();

			try {   
				      br = new BufferedReader (new InputStreamReader (System.in));
					  System.out.println("Please enter the guest's name: ");
					  roomCheckIn.setCustomerName(br.readLine());
					  System.out.println("Please enter the guest's address: ");
					  roomCheckIn.setCustomerAddress(br.readLine());
				      System.out.println("How many days will the guest be staying?");
				      roomCheckIn.setBookingDays(Integer.parseInt(br.readLine()));
				      System.out.println("Please enter the guests creditcard number");
				      roomCheckIn.setCustomerCreditCard(Long.parseLong(br.readLine()));
				      int generatedConfirmationNumber =  rand.nextInt(89999)+10000; // generate random int from 10000-99999
				      roomCheckIn.setConfirmationNumber(generatedConfirmationNumber);
				      System.out.println("Check in complete. The guest's confirmation number is: " + generatedConfirmationNumber);
				    	  
			      }  
			catch ( IOException e)  {
				  e.printStackTrace ();
				  }
			
			Tmap.put(roomCheckIn.getConfirmationNumber(),roomCheckIn);
			writeDataBase();
		}
		

	private void pickRoomType() {
		// TODO Auto-generated method stub
		
	}

	private void pickHotelType() {
		int menuNumber2 = 0;
		   System.out.println("Choose where to stay:");
		   System.out.println();
		   System.out.println("1. View Hotel Listings");
		   System.out.println("2. View Casino Listings");
		   System.out.println("3. View Motel Listings");
	
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

		    case 1 : printHotel();
		        break;

		    case 2 : printCasino();
		        break;

		    case 3 : printMotel();
		        break;       
	    }
		 
	 }
	


	private void printMotel() {
		int menuNumber = 0;
		   System.out.println("The available Motels are:");
		   System.out.println("1. Motel 6");
		   System.out.println("2. Super 8");
		   System.out.println("Please select a number:");
		   System.out.println();
			try {   
			      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			      String data = br.readLine ( );
			      menuNumber = Integer.parseInt (data);
			      }  
			catch ( IOException e)  {
			  e.printStackTrace ();
			  } 
		    switch(menuNumber){

		    case 1 : 
		    	roomCheckIn.setHotelType("motel");
		    	roomCheckIn.setHotelName("Motel 6");
		        break;

		    case 2 : 
		    	roomCheckIn.setHotelType("motel");
		    	roomCheckIn.setHotelName("Motel 8");
		        break;
   
	    }
	}

	private void printCasino() {
		int menuNumber = 0;
		   System.out.println("The available Casinos are:");
		   System.out.println("1. MGM Casino");
		   System.out.println("2. Luxor Casino");
		   System.out.println("3. Paris Las Vegas");
		   System.out.println("4. Venitian");
		   System.out.println("5. Bellagio");
		   System.out.println("Please select a number.");
		   System.out.println();
			try {   
			      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			      System.out.println("Enter You Choice:");
			      String data = br.readLine ( );
			      menuNumber = Integer.parseInt (data);
			      }  
			catch ( IOException e)  {
			  e.printStackTrace ();
			  } 
		    switch(menuNumber){

		    case 1 :
		    	 System.out.println("You pciked MGM Casino");
		    	roomCheckIn.setHotelType("casino");
		    	roomCheckIn.setHotelName("MGM Casino");
		        break;

		    case 2 : 		
		    	System.out.println("You picked Luxor Casino");
		    	roomCheckIn.setHotelType("casino");
	    	    roomCheckIn.setHotelName("Luxor Casino");
		        break;

		    case 3 : 
		    	System.out.println("You picked Paris Las Vegas");
		    	roomCheckIn.setHotelType("casino");
		    	roomCheckIn.setHotelName("ParisLasVegas");
		        break;
		        
		    case 4: 
		    	System.out.println("You picked Venitian");
		    	roomCheckIn.setHotelType("casino");
		    	roomCheckIn.setHotelName("Venitian");
	        break;
	        
		    case 5:
		    	System.out.println("You picked Bellagio");
		    	roomCheckIn.setHotelType("casino");
		    	roomCheckIn.setHotelName("Bellagio");
	        break;	  
	    }
		
	}

	private void printHotel() {
		int menuNumber = 0;
		   System.out.println("The available hotels are:");
		   System.out.println("1. Best Western");
		   System.out.println("2. Crown Plaza");
		   System.out.println("3. Hilton Inn");
		   System.out.println("4. HolidayInn");
		   System.out.println("Please select a number.");
		   System.out.println();
			try {   
			      BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			      System.out.println("Enter You Choice:");
			      String data = br.readLine ( );
			      menuNumber = Integer.parseInt (data);
			      }  
			catch ( IOException e)  {
			  e.printStackTrace ();
			  } 
		    switch(menuNumber){

		    case 1 : 
		    	System.out.println("You picked Best Western");
		    	roomCheckIn.setHotelType("hotel");
		    	roomCheckIn.setHotelName("BestWestern");
		        break;

		    case 2 : 
		    	System.out.println("You picked Crown Plaza");
		    	roomCheckIn.setHotelType("hotel");
		    	roomCheckIn.setHotelName("CrownPlaza");
		        break;

		    case 3 : 
		    	System.out.println("You picked Hilton Inn");
		    	roomCheckIn.setHotelType("hotel");
		    	roomCheckIn.setHotelName("HiltonInns");
		        break;
		        
		    case 4: 
		    	 System.out.println("You picked HolidayInn");
		    	roomCheckIn.setHotelType("hotel");
		    	roomCheckIn.setHotelName("HolidayInn");
	        break;
		    }
		
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
		System.out.format("%50s\n",title);
		System.out.println("-----------------------------------------------------------------------------------------------------------");
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
		System.out.format("%50s\n",title);
		System.out.println("-----------------------------------------------------------------------------------------------------------");
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
		System.out.format("%50s\n",title);
		System.out.println("------------------------------------------------------------------------------------------------------------");
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
		System.out.format("%50s\n",title);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("Accomidation" + "\t\t" + "Guest Name" + "\t\t\t" + "Address" + "\t\t\t\t" + "Credit Card Number" );
		System.out.println();
		for(Map.Entry<Integer,HotelRoom> entry : Tmap.entrySet()){
		HotelRoom room = entry.getValue();
		//if(room.getHotelType().equals("motel"))
		System.out.format(room.hotelName + "\t\t" + room.customerName + "\t\t" + room.customerAddress + "\t\t" + room.customerCreditCard+"\n");
		}	 
	 }
	
	
	
	void quit(){
		System.out.println("Goodbye!");
		System.exit(0);
	}

}
