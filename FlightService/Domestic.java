//Kyle Orcutt 300277486
public class Domestic {
	protected String departLocation, 
	 				 destination,
	 				 flightNumber,
	 				 status = "On Time";
	protected Time departTime,
				   duration;
	protected double securityFee,
					 airportFee;
	
	public Domestic(String dl, String dest, Time dt, Time dur, double sf, double af) {
		departLocation = dl;
		destination = dest;
		departTime = dt;
		duration = dur;
		securityFee = sf;
		airportFee = af;
	}

	public String getDepartLocation() { return departLocation; }
	public String getDestination() { return destination; }
	public String getFlightNumber() { return flightNumber; }
	public String getFreightDescription() { return status; }
	public Time getDepartTime() { return departTime; }
	public Time getDuration() { return duration; }
	public double getSecurityFee() { return securityFee; }
	public double getAirportFee() { return airportFee; }

	public void setDepartTime(Time t) { departTime = t; }
	public void setDuration(Time t) { duration = t; }
	public void setStatus(String s) { status = s; }
	
	public String toString() {
		return "\nFlight " + flightNumber + "-D departs " + departLocation + " for " +
		       destination + " at " + departTime + "\n" + "Status: " + status + "\n";
		   }

}