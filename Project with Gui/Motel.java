
import java.util.Random;

import javax.swing.JOptionPane;

public class Motel extends HotelRoom {

	private double roomPrice;
	private String RoomType;
	private String amenities = "no";
	private String view = "no";

	Motel() {
	}

	@Override
	void CheckIn() {
		int beds = Integer.parseInt(JOptionPane.showInputDialog(null, "Checking in to " + this.hotelName
				+ "\n How many beds( 1 queen or 2 full)? \n Please select a number:"));
		Random rand = new Random();
		this.roomNumber = rand.nextInt(9) + 100; // generate random int from 1 - 99

		switch (beds) {
		case 1:
			this.roomType = "single";
			this.roomPrice = 63.00;

		case 2:
			this.roomType = "double";
			this.roomPrice = 83.00;
		}

		String cusName = JOptionPane.showInputDialog(null, "Please enter the guest's name: ");
		this.setCustomerName(cusName);
		String cusAddress = JOptionPane.showInputDialog(null, "Please enter the guest's address: ");
		this.setCustomerAddress(cusAddress);
		String cusDays = JOptionPane.showInputDialog(null, "How many days will the guest be staying? ");
		this.setBookingDays(Integer.parseInt(cusDays));
		String ccNumber = JOptionPane.showInputDialog(null, "Please enter the guests creditcard number: ");
		this.setCustomerCreditCard(Long.parseLong(ccNumber));
		int generatedConfirmationNumber = rand.nextInt(89999) + 10000; // generate random int from 10000-99999
																		
		this.setConfirmationNumber(generatedConfirmationNumber);
		JOptionPane.showMessageDialog(null, "Check in complete. The guest's confirmation number is: "
				+ generatedConfirmationNumber + "\n The guest's room number is: " + this.roomNumber);

	}


	@Override
	void CancelReservation() {
		// TODO Auto-generated method stub
	}
}
