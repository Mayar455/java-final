package new_one; 

 
public class Vehicle {
	private String plate,model,mark;
    private String kind;
	public Vehicle() {
	 
	}


 public boolean compareTo(String stringone,String stringtwo)
 {
	 
	 if(stringone.compareTo(stringtwo)==0) return true;
	 else return false ;
 }
 public String getPlate() {
	return plate;
}

public void setPlate(String plate) {
	this.plate = plate;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getMark() {
	return mark;
}

public void setMark(String mark) {
	this.mark = mark;
}

public String toString() {
	 return "This vehicle  has plate number "+this.getPlate()+" and is of "+this.getModel()+" mark of "+this.getMark();
 	 }


public String getKind() {
	return kind;
}


public void setKind(String kind) {
	this.kind = kind;
}


}
