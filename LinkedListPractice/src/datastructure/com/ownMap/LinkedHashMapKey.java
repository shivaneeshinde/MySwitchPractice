package datastructure.com.ownMap;

public class LinkedHashMapKey {
	
	final int data = 112;
	private String key;
	
	public LinkedHashMapKey(String key) {
		super();
		this.key = key;
	}
	
	//index = hashCode(key) & (n-1).
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		result = prime * result + ((key == null) ? 0 : (key.charAt(0)+"").hashCode());
		System.out.println("hashCode for key: "+ key + " = " + result);
		System.out.println("Index "+ (result & 15));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedHashMapKey other = (LinkedHashMapKey) obj;
		if (data != other.data)
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
}