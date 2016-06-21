package project;

public class Activities
{
   String event; // yoga, squash, personal_training 
   String location; // gym, swimming pool, sports_room
   int duration; // e.g. 1, 2, 3 hours
   
   Activities() {
      this.event = "";
      this.location = "";
      this.duration = 0;
   }
   
   Activities(String event, String location, int duration) {
      this.event = event;
      this.location = location;
      this.duration = duration;
   }
   
   void setActivity(String activity) {
      this.event = activity;
   }
   
   String getActivity() {
      return this.event;
   }
   
   void setLocation(String location) {
      this.location = location;
   }
   
   String getLocation() {
      return this.location;
   }
   
   void setDuration(int duration) {
      this.duration = duration;
   }
   
   int getDuration() {
      return this.duration;
   }
   public String toString() {
      String activityInfo = 
            String.format("Activity: %s" + ", location: %s" + ", duration: %d hours", 
                          this.event, this.location, this.duration);
      return activityInfo;
   }
}