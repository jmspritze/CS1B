package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Hotel extends HotelRoom {
	
    private Integer numberOfBeds;
    private String amenities;
    private String view;

  //Constructor for DataBase objects something
Hotel(){}


@Override
void CheckIn() {
           System.out.println("checking In");
           
		// Creates entry in guestlist.txt
			BufferedReader br = null;
			Random rand = new Random();

			try {   
				      br = new BufferedReader (new InputStreamReader (System.in));
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