package project;

public class Services
{
   private String amenity; // WiFi, dryCleaning, taxi
   
   Services() {
      this.amenity = "";
   }
   
   Services(String amenity) {
      this.amenity = amenity;
   }
   
   void setAmenity(String Services) {
      this.amenity = Services;
   }
   
   String getAmenity() {
      return this.amenity;
   }
   
   public void Display()
   {
      System.out.println(this.amenity);
   }
}