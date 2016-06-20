package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/*
 * This class reads in a file containing hotel information and Guest information.
 * The format of the text file is: 
 * <hotelName, hotelType,confirmationNumber, roomNumber, roomType, numberOfBeds, amenities, view, bookingDays, roomPrice, customerName, customerAddress, 
 * customerCreditCard, commission>.  
 */

public class HotelRoomDb {
	private static String dataFileName = "C:\\Users\\T3600\\Documents\\Github\\CS1B\\guestList.txt";
	//private static String dataFileName = "C:\\Users\\John\\Desktop\\java\\CS1B\\guestList.txt"; 
	//private static String dataFileName = "//Users//antoinevo//Desktop//guestList.txt"; 
    private String line = null;
    private String[] dataIn= null;
    private String hotelName;
    private String hotelType;
    private Integer roomNumber;
    private String roomType;
    private Integer numberOfBeds;
    private String amenities;
    private String view;
    private double roomPrice;
    private String customerName;
    private String customerAddress;
    private Long customerCreditCard;
    private Integer confirmation;
    private Integer bookingDays;
    private double commision;

    public TreeMap <Integer,HotelRoom> Tmap = new TreeMap<Integer,HotelRoom>();
    	
    HotelRoomDb() {
	}
    
 void readDataBase(){

        try{
            FileReader fileReader =  new FileReader(dataFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) { 
              dataIn = line.split("~");
              hotelName = dataIn[0];
              hotelType = dataIn[1]; 
              confirmation = Integer.parseInt(dataIn[2]);
              roomNumber = Integer.parseInt(dataIn[3]);
              roomType= dataIn[4];  
              numberOfBeds = Integer.parseInt(dataIn[5]);
              amenities= dataIn[6];
              view = dataIn[7];
              bookingDays = Integer.parseInt(dataIn[8]);
              roomPrice =  Double.parseDouble(dataIn[9]);
              customerName = dataIn[10];
              customerAddress = dataIn[11];
              customerCreditCard = Long.parseLong(dataIn[12]);
              commision =  Double.parseDouble(dataIn[13]);
              
              //Determine Type and load TreeMap
              if(hotelType.equals("casino")){ 
                 HotelRoom casinoroom  = new CasinoHotel();
                     casinoroom.setHotelName(hotelName);
                     casinoroom.setHotelType(hotelType);
                     casinoroom.setRoomNumber(roomNumber);
                     casinoroom.setRoomType(roomType);
                     casinoroom.setNumberOfBeds(numberOfBeds);
                     casinoroom.setRoomPrice(roomPrice);
                     casinoroom.setCustomerName(customerName);
                     casinoroom.setCustomerAddress(customerAddress);
                     casinoroom.setCustomerCreditCard(customerCreditCard);
                     casinoroom.setConfirmationNumber(confirmation);
                     casinoroom.setBookingDays(bookingDays);
                     casinoroom.setCommision(commision);
                Tmap.put(confirmation,casinoroom);
              }
              if(hotelType.equals("hotel")){ 
                  HotelRoom hotelroom  = new Hotel();
                      hotelroom.setHotelName(hotelName);
                      hotelroom.setHotelType(hotelType);
                      hotelroom.setRoomNumber(roomNumber);
                      hotelroom.setRoomType(roomType);
                      hotelroom.setNumberOfBeds(numberOfBeds);
                      hotelroom.setRoomPrice(roomPrice);
                      hotelroom.setCustomerName(customerName);
                      hotelroom.setCustomerAddress(customerAddress);
                      hotelroom.setCustomerCreditCard(customerCreditCard);
                      hotelroom.setConfirmationNumber(confirmation);
                      hotelroom.setBookingDays(bookingDays);
                      hotelroom.setCommision(commision);
            	Tmap.put(confirmation,hotelroom);
              }
              
              if(hotelType.equals("motel")){ 
                  HotelRoom motelroom  = new Motel();
                    motelroom.setHotelName(hotelName);
                    motelroom.setHotelType(hotelType);
                    motelroom.setRoomNumber(roomNumber);
                    motelroom.setRoomType(roomType);
                    motelroom.setNumberOfBeds(numberOfBeds);
                    motelroom.setRoomPrice(roomPrice);
                    motelroom.setCustomerName(customerName);
                    motelroom.setCustomerAddress(customerAddress);
                    motelroom.setCustomerCreditCard(customerCreditCard);
                    motelroom.setConfirmationNumber(confirmation);
                    motelroom.setBookingDays(bookingDays);
                    motelroom.setCommision(commision);
               Tmap.put(confirmation,motelroom);
              }
                	
           }
            bufferedReader.close();  
        }

        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + dataFileName + "'");                
        }

        catch(IOException ex) {
            System.out.println("Error reading file '"  + dataFileName + "'");                  
        }   
 }
void writeDataBase(){
	try{
		FileWriter fileWrite = new FileWriter(dataFileName);
		BufferedWriter bufferedWriter  = new BufferedWriter(fileWrite);
	    for(Map.Entry<Integer,HotelRoom> entry : Tmap.entrySet()){
		    HotelRoom room = entry.getValue();
		    entry.getValue();
		fileWrite.write(room.hotelName +"~"+ room.hotelType +"~"+ room.confirmationNumber +"~"+ room.roomNumber +"~"+ room.roomType +"~"+ room.bookingDays +"~"+ room.amenities +"~"+ room.view + "~" + (double)room.roomPrice + "~" + room.customerName + "~" + room.customerAddress + "~" + room.customerCreditCard  + "\r\n");
		}
	bufferedWriter.close();
   }
	catch(FileNotFoundException ex) {
		System.out.println( "Unable to write file");
	}
	catch(IOException ex){
		System.out.println("Error writing file.");
	}
	}
}

