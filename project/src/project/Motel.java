package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Motel extends HotelRoom {
	
	private double roomPrice;
    private String RoomType;
    private String amenities = "no";
    private String view = "no";
	
  //Constructor for DataBase objects
    Motel(){}
    

@Override
void CheckIn() {
	
    System.out.printf("Checking in to %s \n",this.hotelName);
    System.out.println();
	// Creates entry in guestlist.txt
		BufferedReader br = null;
		Random rand = new Random();
		this.roomNumber =  rand.nextInt(9)+100; // generate random int from 1-99

		try {   
			      br = new BufferedReader (new InputStreamReader (System.in));
			      System.out.println("How many beds( 1 queen or 2 full)? ");
				  int beds = Integer.parseInt(br.readLine());
				  switch(beds){
				  case 1:
					  this.roomType = "single";
					  this.roomPrice = 63.00;
				  
				  case 2:
					  this.roomType = "double";
					  this.roomPrice = 83.00;
				  }
				  System.out.println("Please enter the guest's name: ");
				  this.setCustomerName(br.readLine());
				  System.out.println("Please enter the guest's address: ");
				  this.setCustomerAddress(br.readLine());
			      System.out.println("How many days will the guest be staying?");
			      this.setBookingDays(Integer.parseInt(br.readLine()));
			      System.out.println("Please enter the guests creditcard number");
			      this.setCustomerCreditCard(Long.parseLong(br.readLine()));
			      int generatedConfirmationNumber =  rand.nextInt(89999)+10000; // generate random int from 10000-99999
			      this.setConfirmationNumber(generatedConfirmationNumber);
			      System.out.println("Check in complete. The guest's confirmation number is: " + generatedConfirmationNumber);
			      System.out.println("The guest's room number is: " + this.roomNumber);
			    	  
		      }  
		catch ( IOException e)  {
			  e.printStackTrace ();
			  }
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
