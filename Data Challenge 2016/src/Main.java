import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean playing = true;
		Scanner scanner = new Scanner(System.in);
		while (playing) {
			//Ask first question
			System.out.println("----------------------------------------------------------------");
			String question1 = Question.getQuestion(1);
			String[] options = question1.split(",");
			System.out.println();
			System.out.println("Please select one of the three following options: ");
			System.out.println("1. " + options[0]);
			System.out.println("2. " + options[1]);
			System.out.println("3. " + options[2]);
			System.out.print("Selection --> ");
			int answer1 = scanner.nextInt();
			System.out.println();
			while (answer1 < 1 || answer1 > 3) {
				System.out.print("Sorry, but that was not a valid response, please choose again. -->");
				answer1 = scanner.nextInt();
				System.out.println();
			}
			System.out.println("------------------------");
			System.out.println();
			
			
			//Ask second question
			String question2 = Question.getQuestion(2);
			System.out.println(question2);
			System.out.print("Answer --> ");
			int answer2 = scanner.nextInt();
			while (answer2 < 1 || answer2 > 99) {
				System.out.print("Sorry, but that was not a valid response, please choose again. -->");
				answer2 = scanner.nextInt();
				System.out.println();
			}
			System.out.println("------------------------");
			System.out.println();
			
			
			//Ask third question
			String question3 = Question.getQuestion(3);
			System.out.println(question3);
			System.out.print("Answer --> ");
			int answer3 = scanner.nextInt();
			while (answer3 < 1 || answer3 > 99) {
				System.out.print("Sorry, but that was not a valid response, please choose again. -->");
				answer2 = scanner.nextInt();
				System.out.println();
			}
			
			System.out.println("----------------------------------------------------------------");
			
			//Get the incident
			answer1 = translate(answer1); 
			int incidentId = IncidentBuilder.buildIncidentId(answer1, answer2, answer3);
			Incident incident = CsvReader.getIncident(incidentId);
			int responseTime = incident.getResponseTime();
			
		}

		scanner.close();
	}

	public static int translate(int answer) { // 1 = 15, 2 = 16, 3 = 17
		if (answer == 1) {
			return 15;
		} else if (answer == 2) {
			return 16;
		} else if (answer == 3){
			return 17;
		} else {
			System.out.println("Error getting answer 1.");
			return 0;
		}
	}
}
