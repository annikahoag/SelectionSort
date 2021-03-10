import java.util.Scanner;

public class AllStudents {
	
	//instance variables 
	private StudentInfo[] allStudents = new StudentInfo[16];
	Scanner scn = new Scanner (System.in);
	private String name;
	private int gradYear, finalAverage;
	private int size=0;
	private int minIndex, maxIndex;
	private String min;
	private int max;
	private double q1, q2, q3, q4;
	//EXTRA CRDIT: create Statistics class
	Statistics stat = new Statistics();
	
	//constructor 
	public AllStudents() {
		
	}
	
	
	//takes in student information and store to array
	public void addStudent () {
		double finalAverageD=0;
		String nameLong;
		
		if (size<15) {
			try {
				scn = new Scanner(System.in);
				System.out.println("Please enter the student's name.");
				nameLong = scn.nextLine();
				name = nameLong.trim();
				
				scn = new Scanner(System.in);
				System.out.println("Please enter the student's graduation year.");
				gradYear = scn.nextInt();
				
				//EXTRA CREDIT: ask for quarter averages and calculate final average 
				scn = new Scanner(System.in);
				System.out.println("Please enter the student's quarter 1 average.");
				q1 = scn.nextDouble();
				
				scn = new Scanner(System.in);
				System.out.println("Please enter the student's quarter 2 average.");
				q2 = scn.nextDouble();
				
				scn = new Scanner(System.in);
				System.out.println("Please enter the student's quarter 3 average.");
				q3 = scn.nextDouble();
				
				scn = new Scanner(System.in);
				System.out.println("Please enter the student's quarter 4 average.");
				q4 = scn.nextDouble();
				
				//EXTRA CREDIT: call to Statistics class to add to array of quarterly averages 
				stat.add(q1, q2, q3, q4, size);
			
				finalAverageD = (q1 + q2 + q3 + q4) / 4;
				finalAverageD = Math.round(finalAverageD);
				finalAverage = (int) finalAverageD;
	
				
				//store to array and increase  size
				StudentInfo stu = new StudentInfo(name, gradYear, finalAverage);
				allStudents[size] = stu;
				size++;
				
			}catch (java.util.InputMismatchException e) {
				System.out.println("Invalid input. Program will move on.");
				System.out.println();
			}
		
		}else {
			System.out.println("There are too many students in the list.");
			System.out.println();
		}
		
	}
	
	
	//sort names in ascending order 
	public void sortByName() {
		
		for (int i=0; i<size; i++) {
			minIndex = i;
			
			for (int j=i+1; j<size; j++) {
				if (allStudents[minIndex].getName().compareTo(allStudents[j].getName()) > 0) {
					minIndex = j;
					min = allStudents[j].getName();
				}
			}
			
			StudentInfo minTemp = allStudents[minIndex];
			allStudents[minIndex] = allStudents[i];
			allStudents[i] = minTemp;
			
		}//end of outer for
		
		this.print();

	}
	
	
	//sort averages in ascending order
	public void sortByAverage() {
		
		for (int i=0; i<size; i++) {
			
			maxIndex = i;
			
			for (int j=i+1; j<size; j++) {
				if (allStudents[j].getFinalAverage() > allStudents[maxIndex].getFinalAverage()) {
					
					maxIndex = j;
					max = allStudents[j].getFinalAverage();
				}
			}
			
			StudentInfo maxTemp = allStudents[maxIndex];
			allStudents[maxIndex] = allStudents[i];
			allStudents[i] = maxTemp;
			
		}//end of outer for 
		
		this.print();
	}
	
	
	//print method 
	private void print() {

		int gradInt, averageInt;
		String gradString, averageString;
		
		System.out.println();
		System.out.printf("%-30s%-30s%s", "Name", "Graduation Year", "Final Average");
		System.out.println();
		
		for (int i=0; i<size; i++) {
			gradInt = allStudents[i].getGradYear();
			averageInt = allStudents[i].getFinalAverage();
			
			gradString = String.valueOf(gradInt);
			averageString = String.valueOf(averageInt);
			
			System.out.printf("%-30s%-30s%s", allStudents[i].getName(), 
				gradString, averageString);	
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	
	}
	
	//EXTRA CREDIT: the following are all calls to Statistics class
	
	//call sort array
	public void sortArray() {
		stat.sortArray();
	}
	
	//call mean method
	public void mean() {
		stat.findMean();
	}
	
	//call median method
	public void median() {
		stat.findMedian();
	}
	
	//call mode method
	public void mode() {
		stat.findMode();
	}
	
	//call standard deviation method
	public void stanDev() {
		stat.findStanDev();
	}
	
	
}
