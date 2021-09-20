package CarImplementation;

public class Car {
	private int noOfDoor;
	private int noOfSeats;
	private String stepnee;
	Car(int noOfDoor, int noOfSeats,String stepnee){
		this.noOfDoor=noOfDoor;
		this.noOfSeats=noOfSeats;
		this.stepnee=stepnee;
		
	}
	void display() {
		System.out.print("noOfDoor: "+ noOfDoor+"  noOfSeats: "+noOfSeats);
	}

}


class CarUtilities extends Car{
	
	
	
	private String musicsystem;
	private String radio;
	private String bumpper;
	private String numberplate;
	
	CarUtilities(int noOfDoor, int noOfSeats, String stepnee,String musicsystem,String radio,String bumpper,String numberplate) {
		super(noOfDoor, noOfSeats , stepnee);
		        this.bumpper=bumpper;
				this.musicsystem=musicsystem;
		        this.numberplate=numberplate;
		        this.radio=radio;
		        
		
	}
	
	void displayCU(){
		System.out.println("  musicsystem: "+musicsystem+"  radio: "+radio);
	}
	
	
}

class CarInterior extends Car
 {
	private String seatCover; 
	private String seatCoverColor;
	CarInterior(int noOfDoor, int noOfSeats, String stepnee,String seatCover,String seatCoverColor) {
		super(noOfDoor, noOfSeats, stepnee);
		this.seatCover=seatCover;
		this.seatCoverColor=seatCoverColor;
	}
	
	void displayCI() {
		System.out.println("  seatCover"+seatCover+"  seatCoverColor"+seatCoverColor);
	}

}

class MyCar{
	public static void main(String args[]) {
		Car c = new Car(4,6,"stepney tire");
		CarInterior CI = new CarInterior(2,6,"stepney tire","cotton Seat Cover","Black");
		CarUtilities CU = new CarUtilities(6, 8, "Stepeny rim", "Full Range", "FM radio", "Towel Seat Covers", "White");
	System.out.println("Featurs Of My Car1: ");
		CI.display();
	CI.displayCI();
	System.out.println("Featurs Of My Car2: ");
	CU.display();
	CU.displayCU();
	}
}