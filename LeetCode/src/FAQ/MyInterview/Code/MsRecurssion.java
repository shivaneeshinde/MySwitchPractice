package FAQ.MyInterview.Code;

public class MsRecurssion {
	
	public void print(int n) {
		if(n<=0)
			return;
		print(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MsRecurssion obj = new MsRecurssion();
		obj.print(10);
	}

}
