package new_one;

public class DoublyLinkedList {
  Node head;
  Node tail;
	public DoublyLinkedList( ) {
		 this.head=null;
		 this.tail=null; 
	}
 
	public void add(Vehicle addVehicle) {
		
		Node temp=new Node(addVehicle);
		if(this.head==null&&this.tail==null)
		{
			this.head=temp;
			this.tail=temp;
		}
		else {
			Node current=this.head;
			while(current.forward!=null) {
				 current=current.forward;
			}
			current.forward=temp;
			temp.backward=current;
			this.tail=temp;
			
		}
		
		 
		
	}
	public  boolean  remove (String plate) {
		//System.out.println(this.head.getVehicle().getPlate() );
		if(this.head==null&&this.tail==null) return false;
		else {
			
			
			if( plate.equals(this.head.getVehicle().getPlate() ) ) {
				Node current=this.head.forward;
				this.head.forward=null;
				current.backward=null;
				this.head=current;
				return true;
			 
				
			}
			else if(plate.equals(this.tail.getVehicle().getPlate() ) ) {
				Node current=this.tail.backward; 
				this.tail.backward=null;
				current.forward=null;
				this.tail=current;
				return true;
				 
				
			}
			else {
				
				Node current=this.head;
				Node previous=current;
				while(!current.getVehicle().getPlate().equals(plate)) {
					previous=current;
					current=current.forward;
				}
				
				Node temp=previous.forward.forward;
				previous.forward=null;
				current.backward=null;
				current.forward=null;
				temp.backward=null;
				previous.forward=temp;
				temp.backward=previous;
				return true;
			}
			
		}
		
	}

	public void readListFromRight() {
		if(this.head==null) System.out.println("This list is empty currently, to see the list items add items");
		else {
			Node current=this.head;
			while(current!=null) {
					 if(current.getVehicle().getKind().trim().compareToIgnoreCase("car")==0) {
						Car car =(Car)current.getVehicle();
						System.out.println(car.toString());
					}else {
						Truck truck=(Truck)current.getVehicle();
						System.out.println(truck.toString());
					} 
				 
				current=current.forward;
				 
				
				
			}
			
		}

		
	}
	public void readListFromleft() {
		if(this.tail==null) System.out.println("This list is empty currently, to see the list items add items");
		else {
			Node current=this.tail;
			while(current!=null) {
					if(current.getVehicle().getKind().trim().compareToIgnoreCase("car")==0) {
						Car car =(Car)current.getVehicle();
						System.out.println(car.toString());
					}else {
						Truck truck=(Truck)current.getVehicle();
						System.out.println(truck.toString());
					}
				current=current.backward;
				
			}
		}

		
	}
}
