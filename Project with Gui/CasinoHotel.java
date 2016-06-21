
import java.util.Random;
import javax.swing.JOptionPane;

public class CasinoHotel extends HotelRoom implements CommissionAble {

	private double roomPrice;
	private String RoomType;;
	private String amenities;
	private String view;

	CasinoHotel() {

	}

	@Override
	void CheckIn() {
		int beds = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Checking in to " + this.hotelName + "\n What type of room? \n1. Penthouse \n"
						+ "2. King size suite \n3. Standard queen suite \n4. Budget suite \n Please select a number:"));

		Random rand = new Random();
		this.roomNumber = rand.nextInt(9999) + 1000; // generate random int from 1000-99999
				
		switch (beds) {
		case 1:
			this.roomType = "penthouse";
			this.setRoomPrice(750.00);
			break;

		case 2:
			this.roomType = "king";
			this.setRoomPrice(400.00);
			break;

		case 3:
			this.roomType = "queen";
			this.setRoomPrice(333.00);
			break;

		case 4:
			this.roomType = "budget";
			this.setRoomPrice(100.00);
			break;
		}

		String cusName = JOptionPane.showInputDialog(null, "Please enter the guest's name: ");
		this.setCustomerName(cusName);
		String cusAddress = JOptionPane.showInputDialog(null, "Please enter the guest's address: ");
		this.setCustomerAddress(cusAddress);
		String cusDays = JOptionPane.showInputDialog(null, "How many days will the guest be staying? ");
		this.setBookingDays(Integer.parseInt(cusDays));
		String ccNumber = JOptionPane.showInputDialog(null, "Please enter the guests creditcard number: ");
		this.setCustomerCreditCard(Long.parseLong(ccNumber));
		int generatedConfirmationNumber = rand.nextInt(89999) + 10000; // generate random int from 1000-99999
		this.setConfirmationNumber(generatedConfirmationNumber);
		JOptionPane.showMessageDialog(null, "Check in complete. The guest's confirmation number is: "
				+ generatedConfirmationNumber + "\n The guest's room number is: " + this.roomNumber);

	}


	@Override
	void CancelReservation() {
		// TODO Auto-generated method stub
	}

	@Override
	public double commission() {
		double result = Math.round((getRoomPrice() * getBookingDays() * getCommision()) * 100.00) / 100.00; // rounds to hundredth
																											
		return result;
	}

}
