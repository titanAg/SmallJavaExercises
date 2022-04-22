//Kyle Orcutt 300277486
public class International {
	protected String departLocation, 
	 				 destination,
	 				 flightNumber,
	 				 status = "On Time",
	 				 country;
	protected Time departTime,
				   duration;
	protected double securityFee;
	
	public International(String dl, String dest, Time dt, Time dur, double sf, String co) {
		departLocation = dl;
		destination = dest;
		departTime = dt;
		duration = dur;
		securityFee = sf;
		country = co;
	}

	public String getDepartLocation() { return departLocation; }
	public String getDestination() { return destination; }
	public String getFlightNumber() { return flightNumber; }
	public String getFreightDescription() { return status; }
	public String getCountry() { return country; }
	public Time getDepartTime() { return departTime; }
	public Time getDuration() { return duration; }
	public double getSecurityFee() { return securityFee; }

	public void setDepartTime(Time t) { departTime = t; }
	public void setDuration(Time t) { duration = t; }
	public void setStatus(String s) { status = s; }
	
	public String toString() {
		return "\nFlight " + flightNumber + "-I departs " + departLocation + " for " +
		       destination + " at " + departTime + "\n" + "Status: " + status + "\n" + 
			   "Country: " + country + "\n";
		   }

}