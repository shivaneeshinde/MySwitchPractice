package datastructure.com.exception;

public class TimeOutException {
	
	public void m1(int a){
		try{
			if(a==0){
				throw new RuntimeException();
			}
			else{
				//m1(a);
				while(true){
					Integer i = new Integer(a);
				}
			}
		}
		catch(RuntimeException e){

		}
		catch(Exception e){

		}
		finally{
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeOutException ob = new TimeOutException();
		ob.m1(1);
	}

}
