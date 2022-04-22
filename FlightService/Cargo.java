//Kyle Orcutt 300277486
public class Cargo extends Flight{
	protected String //departLocation, 
					 //destination,
					 //flightNumber,
					 freightDescription;
	//protected Time departTime,
				   //duration;
	
	public Cargo(String dl, String dest, Time dt, Time dur, String fd) {
		super(dl, dest, dt, dur);
		//departLocation = dl;
		//destination = dest;
		//departTime = dt;
		//duration = dur;
		freightDescription = fd;
		//setDepartTime(dt);
		//setDuration(dur);
		   }
	
	//public String getDepartLocation() { return departLocation; }
	//public String getDestination() { return destination; }
	//public String getFlightNumber() { return flightNumber; }
	public String getFreightDescription() { return freightDescription; }
	//public Time getDepartTime() { return departTime; }
	//public Time getDuration() { return duration; }
	   
	//public void setDepartTime(Time t) { departTime = t; }
	//public void setDuration(Time t) { duration = t; }
	
	public String toString() {
		return "\nFlight " + flightNumber + "-C departs " + departLocation + " for " +
		       destination + " at " + departTime + "\n" + "Freight: " + freightDescription + "\n";
		   }

}