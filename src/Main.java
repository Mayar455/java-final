package new_one;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner; 


public class Main {

	public static void main(String[] args) {
		
		Vehicle vehicles[]=new Vehicle [100];
		   try {
			      File file = new File("veriler.txt"); 
			      Scanner reader = new Scanner(file); 
			      int i=0;
			      while (reader.hasNextLine()) {
			        String data = reader.nextLine();
			        String items[]=data.split(" "); 
			        if(items[0].trim().compareToIgnoreCase("car")==0) {
			        	Car car =new Car();
			        	car.setKind(items[0]);
			        	car.setPlate(items[1]);
			        	car.setModel(items[2]);
			        	car.setMark(items[3]);
			        	car.setDoorNumber(Integer.parseInt(items[4].trim()));
			        	 
			        	vehicles[i]=car;
			         
			        }
			        else {
			        	Vehicle truck=new Truck();
			        	truck.setKind(items[0]);
			        	truck.setPlate(items[1]);
			        	truck.setModel(items[2]);
			        	truck.setMark(items[3]+items[4]);
			        	 
			        	vehicles[i]=truck;
			        	 
			        }
			        i++;
			       
			      
			      }
			      reader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
System.out.println("\t#.I and #.II ");
System.out.println("\n");
System.out.println("This step does the two procedures  at a time, we  make 100  length long vehicle Array  from  the  Vehicle class as per the question ");
System.out.println("and we process the data text file, that done, we fill the array with vehicle instances, plus, we make sure if a vehicle is a car");
System.out.println("\n\t The print out ");
System.out.println("\t...............\n");
for (Vehicle vehicle:vehicles) {
	 
	    if (vehicle==null)break;
		if(vehicle.getKind().trim().compareToIgnoreCase("car")==0) {
			Car car =(Car)vehicle;
			 
			 switch(car.getDoorNumber()) {
			case 2:
				System.out.print(car.toString());
				System.out.println(". Besides, this a sport car");
				break;
			case 4:
				System.out.print(car.toString());
				System.out.println(". Besides, this a standard car");
				break;
			case 5:
				System.out.print(car.toString());
				System.out.println(". Besides, this a  sWagoncar");
				break;
			default:
				System.out.println("We dont have any car to display");
				break;
				
			} 
			
			
		}else {
			Truck truck=(Truck) vehicle;
			System.out.println(truck.toString());
		}
		
		
	 
}
System.out.println("\n");
System.out.println("\t#.III ");
System.out.println("\n");
System.out.println("This one is the doubly linked list section. All it does is: it makes a doubly linked list instance from the DoublyLinkedList");
System.out.println("blue print, then adds  vehicle items to the list, since it is doubly, we can add either from tail or head, I just use  head");
DoublyLinkedList list=new DoublyLinkedList();
for (Vehicle vehicle:vehicles) {
	if(vehicle!=null)list.add(vehicle); 
	else break;// the maximum number of vehicle in the array is 100, but we don't want to add null values as they are not vehicle.
}
 
System.out.println("\n\t Reading the list from Right side");
System.out.println("\t..................................\n");
list.readListFromRight();
System.out.println("\n\t Reading the list from Left side");
System.out.println("\t..................................\n");
list.readListFromleft();


try {
    File file = new File("islemler.txt"); 
    Scanner reader = new Scanner(file); 
 
    while (reader.hasNextLine()) {
      String data = reader.nextLine();
      String items[]=data.split(" "); 

     
      if(items[0].trim().compareToIgnoreCase("ekle")==0) {
       String vehicleKind=items[1],plate=items[2],model=items[3],mark=items[4],doorNumber=items[5];
       if(vehicleKind.trim().compareToIgnoreCase("car")==0) 
    	   {
    	   Vehicle vehicle=new Car();
    	   vehicle.setPlate(plate);
    	   vehicle.setMark(mark);
    	   vehicle.setModel(model);
    	   vehicle.setKind(vehicleKind);
    	   Car car =(Car) vehicle;
    	   car.setDoorNumber(Integer.parseInt(doorNumber));
    	   list.add(car);
    	   
    	   }else {
    	       Vehicle vehicle=new Truck();
    		   vehicle.setPlate(plate);
    		   vehicle.setMark(mark);
    		   vehicle.setKind(vehicleKind);
    		   vehicle.setModel(model);
    		   Truck truck =(Truck) vehicle;
    		 //since the last number from the text read up is either a door number or a load capacity
    		  // declaring door number suffices in both cases. for a truck we are using an alias .
    		   truck.setLoadCapacity(Integer.parseInt(doorNumber));
    		   list.add(truck);
    	    	  
    	      }
      }
      else {
    	   String plate=items[1];
    	   list.remove(plate);
      
      	 
      }
 
     
    
    }
    reader.close();
  } catch (FileNotFoundException e) {
    System.out.println(" The  file can't be resolved, check if the path is correct, and make sure that it is a text file ");
  }
System.out.println("\n");
System.out.println("\t#.IV and #.V ");
System.out.println("\n");
System.out.println("This print out is to show that we have added vehicle\'s items from the process.txt file and removed  ");
System.out.println( "some vehicle with particular plate  numbers from the  doubly  linked list  as  per  the  question ");
System.out.println("\n\t Reading the list from Right side");
System.out.println("\t..................................\n");
 list.readListFromRight();
 System.out.println("\n\t Reading the list from Left side");
 System.out.println("\t..................................\n");

 list.readListFromleft();
 

	}

}
