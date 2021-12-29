package FAQ.MyInterview.Code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PassByValue {
	
	public class Employee{
		private int id;
		private String name;
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return Integer.MAX_VALUE;
			//return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
		private PassByValue getEnclosingInstance() {
			return PassByValue.this;
		}
		
	}
		
	
    public void m1() {
		Set<Employee> set = new HashSet<>();
		Map<Employee, String> map = new HashMap<>();
        Employee e = new Employee (1, "Abc");
        set.add(e);
        System.out.println("Hashcode before: "+e.hashCode());
        e = m2(e);
        Employee e2 = m2(e);
        set.add(e);
        map.put(e, "one");
        map.put(e2, "two");
        System.out.println("Hashcode after: "+e.hashCode());
        System.out.println(e.getName());
        System.out.println("size of set: "+set.size());
        System.out.println("size of map: "+map.size());
        System.out.println(map.get(e2));
    }
    
    public Employee m2(Employee e) {
        //e = new Employee(2, "Xyz");
    	e.setName("Xyz");
        return e;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByValue obj = new PassByValue();
		obj.m1();
	}

}
