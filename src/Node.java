package new_one;

public class Node {
    
      Node backward;
      Node forward;
      Vehicle vehicle;
     
	public Node(Vehicle vehicle ) {
		this.vehicle=vehicle;
	    
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
 
	

}
