
public class Incident {

	private double milePost; 
	private Date date = new Date();
	private Time notifiedTime = new Time();
	private Time arrivedTime = new Time(); 
	private Time clearedTime = new Time();
	private int emergency; 
	private int fireInvolved; 
	
	public Incident(double milePost, Date date, Time notifiedTime,
			Time arrivedTime, Time clearedTime, int emergency, int fireInvolved) {
		this.milePost = milePost;
		this.date = date;
		this.notifiedTime = notifiedTime;
		this.arrivedTime = arrivedTime;
		this.clearedTime = clearedTime;
		this.emergency = emergency;
		this.fireInvolved = fireInvolved;
	}

	public double getMilePost() {
		return milePost;
	}

	public Date getDate() {
		return date;
	}

	public Time getNotifiedTime() {
		return notifiedTime;
	}

	public Time getArrivedTime() {
		return arrivedTime;
	}

	public Time getClearedTime() {
		return clearedTime;
	}

	public int getEmergency() {
		return emergency;
	}

	public int getFireInvolved() {
		return fireInvolved;
	}
	
	public int getResponseTime() {
		return arrivedTime.compareTo(notifiedTime);
	}
}
