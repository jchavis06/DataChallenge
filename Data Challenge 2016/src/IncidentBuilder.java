
public class IncidentBuilder {

	public static int buildIncidentId(int answer1, int answer2, int answer3) {
		String num = "";
		num += answer1;
		num += answer2;
		num += answer3;
		
		return (Integer.parseInt(num));
	}
}
