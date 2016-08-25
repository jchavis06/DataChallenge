
public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		hour = minute = second = -1;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void readTime(String time) {
		String[] timeSplit = time.split(":");
		this.hour = Integer.parseInt(timeSplit[0]);
		this.minute = Integer.parseInt(timeSplit[1]);
		this.second = Integer.parseInt(timeSplit[2]);
	}
	
	public int getTimeInSeconds() {
		return (3600 * hour) + (60 * minute) + second;
	}
	
	public int compareTo(Time other) {
		return this.getTimeInSeconds() - other.getTimeInSeconds();
	}
}
