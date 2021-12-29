package FAQ.MyInterview.Code;

import java.util.HashSet;
import java.util.Set;

public class Car {
	
	public String model;
	public String colour;
	public int speed;
	
	// Overwriting hashCode method to calculate hashcode for object based on Car model and speed
	@Override
	public int hashCode() {
		int modelHashCode = this.model.hashCode();
		int carSpeed = this.speed;
		int constMod = 7;
		int hashcode = (modelHashCode + carSpeed) % constMod;
		return hashcode;
	}
	
	//Overwiting equals method to return true if car model and speed are same for 2 cars
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		else {
			if(getClass()!= o.getClass())
				return false;
			
			Car obj = (Car) o;
			return (this.model.equals(obj.model) && this.speed == obj.speed);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Car> set = new HashSet<>();
		
	}

}
