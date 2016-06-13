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
 * <hotelName, hotelType, roomNumber, roomType, numberOfBeds, amenities, view, roomPrice, customerName, customerAddress, 
 * customerCreditCard, confirmationNumber, bookingDays, commission>.  
 */

public class HotelRoomDb {

	private static String dataFileName = "C:\\Users\\T3600\\Documents\\GitHub\\CS1B\\guestList.txt"; 
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
    private Integer confirmationNumber;
    private Integer bookingDays;
    private double commision;

    public TreeMap <Integer,HotelRoom> Tmap = new TreeMap<Integer,HotelRoom>();
    	
    HotelRoomDb() {
	}
    
 void readDataBase(){

        try{
          //Try catch to get data from file
            FileReader fileReader =  new FileReader(dataFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) { 
              dataIn = line.split(",");

              hotelName = dataIn[0];
              hotelType = dataIn[1]; 
              roomNumber = Integer.parseInt(dataIn[2]);
              roomType= dataIn[3];  
              numberOfBeds = Integer.parseInt(dataIn[4]);
              amenities= dataIn[5];
              view = dataIn[6];
              roomPrice =  Double.parseDouble(dataIn[7]);
              customerName = dataIn[8];
              customerAddress = dataIn[9];
              customerCreditCard = dataIn[10];
              confirmationNumber = Integer.parseInt(dataIn[11]);
              bookingDays = Integer.parseInt(dataIn[12]);
              commision =  Double.parseDouble(dataIn[13]);
              
              //Determine Type and load TreeMap
              if(hotelType.equals("casino")){ 
                  switch(hotelName){
                      case "MGM":
                	    HotelRoom MGMRoom  = new MGM(hotelName,
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
                        confirmationNumber,
                        bookingDays,
                        commision);
                	    Tmap.put(roomNumber,MGMRoom);
                	      break;
                	  case "Luxor":           	    	  
               		    HotelRoom LuxorRoom = new Luxor(hotelName,
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
                                confirmationNumber,
                                bookingDays,
                                commision);
               		    Tmap.put(roomNumber,LuxorRoom);
                       	  break;
                      case "ParisLasVegas":
               		    HotelRoom ParisLasVegasRoom = new ParisLasVegas(hotelName,
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
                                confirmationNumber,
                                bookingDays,
                                commision);
               		    Tmap.put(roomNumber,ParisLasVegasRoom);
                    	  break;
                      case "Venitian":
               		    HotelRoom VenitianRoom = new Venitian(hotelName,
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
                                confirmationNumber,
                                bookingDays,
                                commision);
               		    Tmap.put(roomNumber,VenitianRoom );
                          break;
                      case "Bellagio":
               		    HotelRoom BellagioRoom = new Bellagio(hotelName,
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
                                confirmationNumber,
                                bookingDays,
                                commision);
               		    Tmap.put(roomNumber,BellagioRoom);
                          break;  
                	  }
              }   
              
              if(hotelType.equals("standard")){ 
            	  switch(hotelName){
            	      case "BestWestern":
            		   HotelRoom BestWesternRoom  = new BestWestern(hotelName,
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
                               confirmationNumber,
                               bookingDays,
                               commision);
            		   Tmap.put(roomNumber,BestWesternRoom);
            		     break;
            	      case "CrownPlaza":           	    	  
           		       HotelRoom CrownPlazaRoom = new CrownPlaza(hotelName,
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
                               confirmationNumber,
                               bookingDays,
                               commision);
           		       Tmap.put(roomNumber,CrownPlazaRoom);
                		  break;
                	  case "Hilton":
           		       HotelRoom HiltonRoom = new Hilton(hotelName,
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
                               confirmationNumber,
                               bookingDays,
                               commision);
           		       Tmap.put(roomNumber,HiltonRoom);
                		  break;
                	  case "HolidayInn":
           		       HotelRoom HolidayInnRoom = new HolidayInn(hotelName,
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
                               confirmationNumber,
                               bookingDays,
                               commision);
           		       Tmap.put(roomNumber,HolidayInnRoom );
                		  break;
                	  case "Motel6":
           		       HotelRoom Motel6Room = new Motel6(hotelName,
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
                               confirmationNumber,
                               bookingDays,
                               commision);
           		       Tmap.put(roomNumber,Motel6Room);
                		  break;
                	  case "Super8":
              		       HotelRoom Super8Room = new Super8(hotelName,
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
                                   confirmationNumber,
                                   bookingDays,
                                   commision);
              		       Tmap.put(roomNumber,Super8Room);
                   		  break;
                	  
            	  }
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

	

void printDb(){
	for(Map.Entry<Integer,HotelRoom> entry : Tmap.entrySet()){
	Integer key = entry.getKey();
	HotelRoom room = entry.getValue();
	System.out.println( room.getCustomerName());
	System.out.println(key);
	}
	 
 }
	
	
}
