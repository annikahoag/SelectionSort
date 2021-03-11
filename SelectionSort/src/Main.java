import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		AllStudents all = new AllStudents();
		boolean runAgain = true;
		int userInput;
		
		System.out.println("Please enter one student to be added to the list of students.");
		all.addStudent();
		
		while (runAgain) {
			try {
				//ask user what they want to do 
				System.out.println("What would you like to do? Please enter: "
						+ "\n1 to print all students by name. "
						+ "\n2 to print all students by final average."
						+ "\n3 to add a student. "
						+ "\n4 to print mean, median, mode, and standard deviation of quarterly averages. "
						+ "\n5 to stop program.");
				userInput = scn.nextInt();
				
				switch(userInput) {
					
					//print by name
					case 1: userInput=1;
						all.sortByName();
						runAgain=true;
						break;
					
					//print by final average	
					case 2: userInput=2;
						all.sortByAverage();
						runAgain=true;
						break;
					
					//add students	
					case 3: userInput=3;
						all.addStudent();
						runAgain=true;
						break;
					
					//EXTRA CREDIT: mean, median, mode and standard deviation of quarter averages
					case 4: userInput=4;
						all.sortArray();
						all.mean();
						all.median();
						all.mode();
						all.stanDev();
						runAgain=true;
						break;
					
					//end program	
					case 5: userInput=5;
						runAgain=false;
						break;
				}
			}catch(java.util.InputMismatchException e) {
				System.out.println("Please only enter numbers. Program will end.");
				runAgain=false;
			}
		}//end of while
		
		scn.close();
	}
}
