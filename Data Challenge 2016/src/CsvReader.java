import java.io.*;
public class CsvReader {

	public static Incident getIncident(int incidentId) {
		Incident incident = null;
		double milePost; //index 3
		Date date = new Date(); //index 5
		Time notifiedTime = new Time(); //index 6
		Time arrivedTime = new Time(); //index 7
		Time clearedTime = new Time(); // index 8
		int emergency; //index 17
		int fireInvolved; //index 20
		
		try {
			File file = new File("C:\\Users\\jchavis06\\documents\\WitsIncidents.csv");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			br.readLine();
			String str;
			while ((str = br.readLine()) != null) {
				String[] line = str.split(",");
				int id = Integer.parseInt(line[0]);
				if (id == incidentId) {
					
					milePost = Double.parseDouble(line[3]);
					date.readDate(line[5]);
					notifiedTime.readTime(line[6]);
					arrivedTime.readTime(line[7]);
					clearedTime.readTime(line[8]);
					emergency = Integer.parseInt(line[17]);
					fireInvolved = Integer.parseInt(line[20]);
					
					incident = new Incident(milePost, date, notifiedTime, 
							arrivedTime, clearedTime, emergency, fireInvolved);
				}
			}
		
			br.close();
		} catch (Exception e) {
			System.out.println("Error getting incident: " + e.getMessage());
		}
		
		return incident;
	}
}
