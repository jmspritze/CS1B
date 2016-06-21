
import java.util.Map;

import javax.swing.JOptionPane;

public class HotelRoomDbMenu extends HotelRoomDb {

	public void initMenu() {
		int menuNumber = 0;

		do {
			menuNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Welcome to the CS1B Hotel Reservation System. \n Choose an item from the menu: \n\n1. Guest Check In \n"
							+ "2. Guest Check Out \n3. View Guest Listings \n4. View Total Commissions and Revenue \n5. Quit \n Enter your choice:"));

			switch (menuNumber) {

			case 1:
				pickHotelType();
				break;

			case 2:
				guestCheckOut();
				break;

			case 3:
				printGuestInfo();
				break;

			case 4:
				totalCommissions();
				break;

			case 5:
				quit();
				break;

			}

		} while (menuNumber < 6);

	}

	private void totalCommissions() {
		int revenue = 0;
		// JOptionPane.showMessageDialog(null,"Commissions /n
		// ---------------------------------------------------");

		for (Map.Entry<Integer, HotelRoom> entry : Tmap.entrySet()) {
			HotelRoom room = entry.getValue();
			if (room.getHotelType().equals("hotel") || room.getHotelType().equals("casino"))
				revenue += room.commission();

			JOptionPane.showMessageDialog(null, "Commissions Earned $" + revenue + " from " + getHotelName() + "\n");

		}

		JOptionPane.showMessageDialog(null, " Total Revenue Earned: $ " + revenue);

	}

	private void guestCheckOut() {
	
		JOptionPane.showMessageDialog(null, "Thanks for using " + hotelName + ".");

	}

	private void pickHotelType() {
		int menuNumber2 = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Choose where to stay:\n1. View Hotel Listings \n"
						+ "2. View Casino Listings \n3. View Motel Listings \n Enter your choice:"));

		switch (menuNumber2) {

		case 1:
			printHotel();
			break;

		case 2:
			printCasino();
			break;

		case 3:
			printMotel();
			break;
		}

	}

	private void printMotel() {
		HotelRoom roomCheckIn = new Motel();
		int menuNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
				"The available Motels are: \n1. Motel 6 \n" + "2. Super 8 \n Enter You Choice:"));
		;
		switch (menuNumber) {

		case 1:
			JOptionPane.showMessageDialog(null, "You picked Motel 6");
			roomCheckIn.setHotelType("motel");
			roomCheckIn.setHotelName("Motel 6");
			roomCheckIn.CheckIn();
			break;

		case 2:
			JOptionPane.showMessageDialog(null, "You picked Motel 8");
			roomCheckIn.setHotelType("motel");
			roomCheckIn.setHotelName("Motel 8");
			roomCheckIn.CheckIn();
			break;

		}
		Tmap.put(roomCheckIn.getConfirmationNumber(), roomCheckIn);
		writeDataBase();
	}

	private void printCasino() {
		HotelRoom roomCheckIn = new CasinoHotel();
		int menuNumber = Integer
				.parseInt(JOptionPane.showInputDialog(null, "The available Casinos are:  \n\n1. MGM Casino \n"
						+ "2. Luxor Casino \n3. Paris Las Vegas \n4. Venitian \n5. Bellagio \n Enter You Choice:"));

		switch (menuNumber) {

		case 1:
			JOptionPane.showMessageDialog(null, "You picked MGM Casino");
			roomCheckIn.setHotelType("casino");
			roomCheckIn.setHotelName("MGM Casino");
			roomCheckIn.CheckIn();
			break;

		case 2:
			JOptionPane.showMessageDialog(null, "You picked Luxor Casino");
			roomCheckIn.setHotelType("casino");
			roomCheckIn.setHotelName("Luxor Casino");
			roomCheckIn.CheckIn();
			break;

		case 3:
			JOptionPane.showMessageDialog(null, "You picked Paris Las Vegas");
			roomCheckIn.setHotelType("casino");
			roomCheckIn.setHotelName("ParisLasVegas");
			roomCheckIn.CheckIn();
			break;

		case 4:
			JOptionPane.showMessageDialog(null, "You picked Venitian");
			roomCheckIn.setHotelType("casino");
			roomCheckIn.setHotelName("Venitian");
			roomCheckIn.CheckIn();
			break;

		case 5:
			JOptionPane.showMessageDialog(null, "You picked Bellagio");
			roomCheckIn.setHotelType("casino");
			roomCheckIn.setHotelName("Bellagio");
			roomCheckIn.CheckIn();
			break;
		}
		Tmap.put(roomCheckIn.getConfirmationNumber(), roomCheckIn);
		writeDataBase();

	}

	private void printHotel() {
		HotelRoom roomCheckIn = new Hotel();
		int menuNumber = Integer
				.parseInt(JOptionPane.showInputDialog(null, "The available hotels are:  \n\n1. Best Western \n"
						+ "2. Crown Plaza \n3. Hilton Inn \n4. HolidayInn \n5. Bellagio \n \n Enter You Choice:"));

		switch (menuNumber) {

		case 1:
			JOptionPane.showMessageDialog(null, "You picked Best Western");
			roomCheckIn.setHotelType("hotel");
			roomCheckIn.setHotelName("BestWestern");
			roomCheckIn.CheckIn();
			break;

		case 2:
			JOptionPane.showMessageDialog(null, "You picked Crown Plaza");
			roomCheckIn.setHotelType("hotel");
			roomCheckIn.setHotelName("CrownPlaza");
			roomCheckIn.CheckIn();
			break;

		case 3:
			JOptionPane.showMessageDialog(null, "You picked Hilton Inn");
			roomCheckIn.setHotelType("hotel");
			roomCheckIn.setHotelName("HiltonInns");
			roomCheckIn.CheckIn();
			break;

		case 4:
			JOptionPane.showMessageDialog(null, "You picked HolidayInn");
			roomCheckIn.setHotelType("hotel");
			roomCheckIn.setHotelName("HolidayInn");
			roomCheckIn.CheckIn();
			break;
		}
		Tmap.put(roomCheckIn.getConfirmationNumber(), roomCheckIn);
		writeDataBase();

	}

	void printGuestInfo() {
		int menuNumber2 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Choose Guest List to view:  \n\n1. View Hotel Guest Listings \n"
						+ "2. View Casino Guest Listings \n3. View Motel Guest Listings \n4. View All Guest Listings  \n \n Enter You Choice:"));

		switch (menuNumber2) {

		case 1:
			printHotelGuest();
			break;

		case 2:
			printCasinoGuest();
			break;

		case 3:
			printMotelGuest();
			break;

		case 4:
			printAllGuest();
			break;
		}

	}

	void printHotelGuest() {
		String title = "Hotel Guests";

		for (Map.Entry<Integer, HotelRoom> entry : Tmap.entrySet()) {
			HotelRoom room = entry.getValue();
			if (room.getHotelType().equals("hotel"))
				JOptionPane.showMessageDialog(null,
						title + "\n---------------------------------------------\n" + "Hotel" + "\t\t" + "Guest Name"
								+ "\t\t" + "Address" + "\t\t\t\t" + "Credit Card Number \n" + room.hotelName + "\t"
								+ room.customerName + "\t" + room.customerAddress + "\t\t" + room.customerCreditCard
								+ "\n");
		}

	}

	void printCasinoGuest() {
		String title = "Casino Guests";
		for (Map.Entry<Integer, HotelRoom> entry : Tmap.entrySet()) {
			HotelRoom room = entry.getValue();
			if (room.getHotelType().equals("casino"))
				JOptionPane.showMessageDialog(null,
						title + "\n---------------------------------------------\n" + "Casino" + "\t\t" + "Guest Name"
								+ "\t\t" + "Address" + "\t\t\t\t" + "Credit Card Number \n" + room.hotelName + "\t"
								+ room.customerName + "\t" + room.customerAddress + "\t\t" + room.customerCreditCard
								+ "\n");

		}

	}

	void printMotelGuest() {
		String title = "Motel Guests";
		for (Map.Entry<Integer, HotelRoom> entry : Tmap.entrySet()) {
			HotelRoom room = entry.getValue();
			if (room.getHotelType().equals("motel"))
				JOptionPane.showMessageDialog(null,
						title + "\n---------------------------------------------\n" + "Motel" + "\t\t" + "Guest Name"
								+ "\t\t" + "Address" + "\t\t\t\t" + "Credit Card Number \n" + room.hotelName + "\t"
								+ room.customerName + "\t" + room.customerAddress + "\t\t" + room.customerCreditCard
								+ "\n");

		}
	}

	void printAllGuest() {
		String title = "All Guests";
		for (Map.Entry<Integer, HotelRoom> entry : Tmap.entrySet()) {
			HotelRoom room = entry.getValue();
			JOptionPane.showMessageDialog(null,
					title + "\n---------------------------------------------\n" + "Accomodation" + "\t\t" + "Guest Name"
							+ "\t\t" + "Address" + "\t\t\t\t" + "Credit Card Number \n" + room.hotelName + "\t"
							+ room.customerName + "\t" + room.customerAddress + "\t\t" + room.customerCreditCard
							+ "\n");

		}
	}

	void quit() {
		JOptionPane.showMessageDialog(null, "Goodbye! \nThanks for using CS1B Hotel Reservation System.");
		System.exit(0);
	}

}
