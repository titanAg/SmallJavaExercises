// Kyle Orcutt
// simple add student service done in my early school days

import java.util.*;

public class StudentGradeService {
	public static void main(String[] args) {
		ArrayList<String> allStudents = new ArrayList<String>();
		ArrayList<Integer> allGrades = new ArrayList<Integer>();
		int selection = 0;
		int editSelection = 0;
		String student = "";
		int grade = 0;
		int inputCount = 0;
		Scanner input = new Scanner(System.in);

		while (selection != 3) {
			try {
				if (inputCount < 1) {
					inputCount++;
					System.out.println("Main Menu \n");
					System.out.println("Select one of the following options");
					System.out.println("1. Add a Student");
					System.out.println("2. Edit student grades");
					System.out.println("3. Exit");

					selection = input.nextInt();
				}
				if (selection == 1) {
					if (inputCount == 1) {
						inputCount++;
						System.out.println("Please enter the students name:");
						student = input.next();
						allStudents.add(student);
					}
					System.out.println("Please enter a grade for " + student + ":");
					grade = input.nextInt();
					allGrades.add(grade);
					inputCount = 0;

				} else if (selection == 2) {
					if (allStudents.size() > 0) {
						if (inputCount == 1) {
							inputCount += 2;
						}
						if (editSelection == 0) {
							System.out.println("What student would you like to enter a grade for?");

							for (int i = 0; i < allStudents.size(); i++) {
								System.out.println(i + 1 + ") " + allStudents.get(i) + " - " + allGrades.get(i));
							}
							editSelection = input.nextInt();
						}

						System.out.println("Please enter a grade for " + allStudents.get(editSelection - 1));
						int newGrade = input.nextInt();
						allGrades.remove(editSelection - 1);
						allGrades.add(editSelection - 1, newGrade);
						editSelection = 0;
					}else {
						System.out.println("No students exist, please make another selection.");
					}
		
					inputCount = 0;
				} else if (selection < 1 || selection > 3) {
					System.out.println("Invalid selection, please enter a number for one of the options listed.");
					inputCount = 0;
				}

			} catch (InputMismatchException m) {
				if (inputCount == 1) {
					System.out.println("Invalid selection, please enter a number for one of the options listed.");
					inputCount = 0;
				} else if (inputCount == 2) {
					System.out.println("Invalid entry, please enter a valid grade in the form of an integer.");
				} else if (inputCount == 3) {
					if (editSelection > 0 && editSelection <= allStudents.size()) {
						System.out.println("Invalid entry, please enter a valid grade in the form of an integer.");
					}else {
						System.out.println("Invalid selection, please enter a number for one of the options listed.");
					}
				}
				input.nextLine();
			} catch (IndexOutOfBoundsException o) {
				System.out.println("Invalid selection, please enter a valid number for the option listed.");
				input.nextLine();
				editSelection = 0;
			}
		} 
		System.out.println("Thank you, Goodbye!");
		input.close();

		for (int i = 0; i < allStudents.size(); i++) {
			System.out.print(allStudents.get(i) + " " + allGrades.get(i));
			System.out.println();
		}
	}
}
