package project;

public class Food
{
   String meal_type; // breakfast, lunch, dinner
   String location; // room_service, hotel_restaurant
 
   Food() {
      this.meal_type = "";
      this.location = "";
   }
   
   Food(String meal_type, String location) {
      this.meal_type = meal_type;
      this.location = location;
   }
   
   void setMealType(String meal_type) {
      this.meal_type = meal_type;
   }
   
   String getMealType() {
      return this.meal_type;
   }
   
   void setLocation(String location) {
      this.meal_type = location;
   }
   
   String getLocation() {
      return this.location;
   }
   
   public String toString() {
      String foodInfo = 
            String.format("Meal type: %s" + ", location: %s",
                          this.meal_type, this.location);
      return foodInfo;
   }
}
