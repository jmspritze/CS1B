package project;

public class Consumption<T> extends HotelRoom{
	   private T data;
	   int num_persons;
	   
	   Consumption() { 
	      //what do you initialize data as?
	      this.data = null;
	      this.num_persons = 0;
	   }
	   
	   Consumption(double price, int num_persons, T data){
	      this.data = data;
	      this.num_persons = num_persons;
	   }

	   public T getConsumption()
	   {
	      return data;
	   }

	   public void setConsumtion(T data)
	   {
	      this.data = data;
	   }
	   
	   void setNum_persons(int num_persons) {
	      this.num_persons = num_persons;
	   }
	   
	   int getNum_persons() {
	      return  this.num_persons;
	   }
	   
	   public void Display()
	   {
	      System.out.println(this.data);
	   }

	@Override
	void CheckIn() {
		// TODO Auto-generated method stub
		
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
