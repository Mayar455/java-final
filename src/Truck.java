package new_one;

public class Truck extends Vehicle  {
private int loadCapacity;
 
	public Truck( ) {
	 super();
	}
public String toString() {
	 return "This "+ this.getKind()+" has plate number "+this.getPlate()+",  is of "+this.getModel()+" model and "+this.getMark();

}
public int getLoadCapacity() {
	return loadCapacity;
}
public void setLoadCapacity(int loadCapacity) {
	this.loadCapacity = loadCapacity;
}
 
 
}
