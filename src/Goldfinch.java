public class Goldfinch extends Animal implements Flyable,Walkable{

	double wingSpan;
	
	public Goldfinch() {
	
		super ();
		wingSpan=9.0;
	}//end empty argument constructor



	public  Goldfinch(int SimID, Location l,double ws) {
	} 
				
			

	
	//getters and toString Method
	
	
	public double getWingSpan() {
		return wingSpan;
	}



	public void setWingSpan(double wingSpan) {
	if(wingSpan<5 || wingSpan>11) 
			
				 {
				this.wingSpan=wingSpan;
				}
	}

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", SimID=" + SimID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}



	@Override
	public void walk(int direction) {
		// TODO Auto-generated method stub
		Location currentLocation= super.getLocation();
		switch(direction) {
		
		case 1: currentLocation.update(currentLocation.getxCoord(),currentLocation.getyCoord()+1 );
		break;
		
		case 2: currentLocation.update(currentLocation.getxCoord()+1,currentLocation.getyCoord() );
		break;
	
		case 3: currentLocation.update(currentLocation.getxCoord(),currentLocation.getyCoord()-1 );
		break;
		
		case 4: currentLocation.update(currentLocation.getxCoord()-1,currentLocation.getyCoord() );
		break;
		
		}//end switch block
	}//end walk method


	@Override
	public void fly(Location l) {
		// TODO Auto-generated method stub
	super.location=l;

	}
	
	
}//end class