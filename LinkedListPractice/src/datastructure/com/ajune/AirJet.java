package datastructure.com.ajune;

import java.io.IOException;

class AirJet extends Airplane {
	
	public Airjet() throws IOException{
		System.out.println("Airjet");
		try {
			super();
		}
		catch(IOException e) {
			System.out.println("IOExc in jet");
		}
	}


}
