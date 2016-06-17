package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

<<<<<<< HEAD
	private static String dataFileName = "C:\\Users\\John\\Desktop\\java\\CS1B\\guestList.txt"; 
=======
	private static String dataFileName = "//Users//antoinevo//Desktop//guestList.txt"; 
>>>>>>> c5612dfdf58287d0dbb35a5fe513945bdfa717e1
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
    private String customerCreditCard;
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
              dataIn = line.split(",");

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
              customerCreditCard = dataIn[12];
              commision =  Double.parseDouble(dataIn[13]);
              
              //Determine Type and load TreeMap
              if(hotelType.equals("casino")){ 
                 HotelRoom casinoroom  = new CasinoHotel(hotelName,
                    hotelType, 
                    roomNumber,
                    roomType,
                    numberOfBeds,
                    amenities,
                    view,
                    roomPrice,
                    customerName,
                    customerAddress,
                    customerCreditCard,
                    confirmation,
                    bookingDays,
                    commision);
                	   Tmap.put(confirmation,casinoroom);
              }
              if(hotelType.equals("hotel")){ 
                  HotelRoom hotelroom  = new Hotel(hotelName,
                     hotelType, 
                     roomNumber,
                     roomType,
                     numberOfBeds,
                     amenities,
                     view,
                     roomPrice,
                     customerName,
                     customerAddress,
                     customerCreditCard,
                     confirmation,
                     bookingDays,
                     commision);
            		    Tmap.put(confirmation,hotelroom);
              }
               if (hotelType.equals("motel")){
            	   HotelRoom motelroom  = new Motel(hotelName,
                     hotelType, 
                     roomNumber,
                     roomType,
                     numberOfBeds,
                     amenities,
                     view,
                     roomPrice,
                     customerName,
                     customerAddress,
                     customerCreditCard,
                     confirmation,
                     bookingDays,
                     commision);
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
	
}
