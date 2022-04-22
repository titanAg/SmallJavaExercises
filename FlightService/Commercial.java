//Kyle Orcutt 300277486
public class Commercial {
	protected String departLocation, 
					 destination,
					 flightNumber,
					 status = "On Time";
	protected Time departTime,
				   duration;
	protected double securityFee;
	
	public Commercial(String dl, String dest, Time dt, Time dur, String stat, double sf) {
	      departLocation = dl;
	      destination = dest;
	      departTime = dt;
	      duration = dur;
	      status = stat;
	      securityFee = sf;
	   }
	
	public String getDepartLocation() { return departLocation; }
	public String getDestination() { return destination; }
	public String getFlightNumber() { return flightNumber; }
	public String getFreightDescription() { return status; }
	public Time getDepartTime() { return departTime; }
	public Time getDuration() { return duration; }
	public double getSecurityFee() { return securityFee; }
	   
	public void setDepartTime(Time t) { departTime = t; }
	public void setDuration(Time t) { duration = t; }
	public void setStatus(String s) { status = s; }

	public String toString() {
	return "\nFlight " + flightNumber + "-C departs " + departLocation + " for " +
		             destination + " at " + departTime + "\n" + "Status: " + status + "\n";
		   }
}