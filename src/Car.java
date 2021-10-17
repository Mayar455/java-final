package new_one;

public class Car extends Vehicle {
   private int doorNumber;
  
	public Car( ) {
		 super();
	}
	public String toString() {
		 return "This "+ this.getKind()+" has plate number "+this.getPlate()+", is of "+this.getModel()+" model, and  "+this.getMark() ;

	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	 

}
