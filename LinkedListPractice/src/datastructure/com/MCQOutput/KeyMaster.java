package datastructure.com.MCQOutput;

public class KeyMaster {

	public int i;
	public KeyMaster(int i) {
		this.i=i;
	}
	
	public boolean equals(Object o) {
		return i==((KeyMaster)o).i;
	}
	
	public int hashCode() {
		return i;
	}
	
	
}
