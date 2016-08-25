
public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date() {
		day = month = year = -1;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void readDate(String date) {
		String[] dateSplit = date.split("/");
		this.month = Integer.parseInt(dateSplit[0]);
		this.day = Integer.parseInt(dateSplit[1]);
		this.year = Integer.parseInt(dateSplit[2]);
	}
}
