package Day13;

public class ThisKeyWord {
	
	int x, y;
	
	ThisKeyWord(int x,int y) {
		//when class and method variables are same to differentiate we use this keyword	
		this.x=x;			
		this.y=y;
				
	}
	
	void setValues(int x,int y) {
		//when class and method variables are same to differentiate we use this keyword	
		this.x=x;			
		this.y=y;
		
	}
	
	void display() {
		System.out.println(x+"  "+y);
	}

	public static void main(String[] args) {
		ThisKeyWord th=new ThisKeyWord(30,40);		
		th.setValues(15, 20);
		th.display();

	}

}
