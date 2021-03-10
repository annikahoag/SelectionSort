//EXTRA CREDIT: create Statistics class w/ quarter average arrays

public class Statistics {

	//instance variables
	int [] quarter1 = new int[16];
	int [] quarter2 = new int[16];
	int [] quarter3 = new int[16];
	int [] quarter4 = new int[16];
	private int statSize=0;
	private int minIndex, min, temp;
	private int quart1, quart2, quart3, quart4;
	private double meanQ1, meanQ2, meanQ3, meanQ4;
	
	
	//constructor
	public Statistics() {
		
	}
	
	//add quarterly averages to array
	public void add(double q1, double q2, double q3, double q4, int size) {
		
		//round averages 
		quart1 = this.round(q1);
		quart2 = this.round(q2);
		quart3 = this.round(q3);
		quart4 = this.round(q4);
		
		//add to array
		quarter1 [statSize] = quart1;
		quarter2 [statSize] = quart2;
		quarter3 [statSize] = quart3;
		quarter4 [statSize] = quart4;
		
		statSize++;
	}
	
	
	//round quarter averages and return rounded value
	private int round(double unRounded) {
		int rounded;
				
		unRounded = Math.round(unRounded);
		rounded = (int) unRounded;
		
		return rounded;
	}
	
	
	//sort array from least to greatest score 
	public void sortArray() {
		
		//quarter 1
		for (int i=0; i<statSize; i++) {
			minIndex = i;
			
			for (int j=i+1; j<statSize; j++) {
				if (quarter1[j]< quarter1[minIndex]) {
					
					minIndex = j;
					min = quarter1[j];
				}
			}
			
			temp = quarter1[minIndex];
			quarter1[minIndex] = quarter1[i];
			quarter1[i] = temp;
		}//end of outer for 
		
		System.out.print("Quarter 1 Averages: ");
		for (int i=0; i<statSize; i++) {
			System.out.print(quarter1[i] + " ");
		}
		System.out.println();
		
		
		//quarter 2
		for (int i=0; i<statSize; i++) {
			minIndex = i;
			
			for (int j=i+1; j<statSize; j++) {
				if (quarter2[j]< quarter2[minIndex]) {
					
					minIndex = j;
					min = quarter2[j];
				}
			}
			
			temp = quarter2[minIndex];
			quarter2[minIndex] = quarter2[i];
			quarter2[i] = temp;
		}//end of outer for 
		
		System.out.print("Quarter 2 Averages: ");
		for (int i=0; i<statSize; i++) {
			System.out.print(quarter2[i] + " ");
		}
		System.out.println();
		
		
		//quarter 3
		for (int i=0; i<statSize; i++) {
			minIndex = i;
			
			for (int j=i+1; j<statSize; j++) {
				if (quarter3[j]< quarter3[minIndex]) {
					
					minIndex = j;
					min = quarter3[j];
				}
			}
			
			temp = quarter3[minIndex];
			quarter3[minIndex] = quarter3[i];
			quarter3[i] = temp;
		}//end of outer for 
		
		System.out.print("Quarter 3 Averages: ");
		for (int i=0; i<statSize; i++) {
			System.out.print(quarter3[i] + " ");
		}
		System.out.println();
		
		
		//quarter 4
		for (int i=0; i<statSize; i++) {
			minIndex = i;
			
			for (int j=i+1; j<statSize; j++) {
				if (quarter4[j]< quarter4[minIndex]) {
					
					minIndex = j;
					min = quarter4[j];
				}
			}
			
			temp = quarter4[minIndex];
			quarter4[minIndex] = quarter4[i];
			quarter4[i] = temp;
		}//end of outer for 
		
		System.out.print("Quarter 4 Averages: ");
		for (int i=0; i<statSize; i++) {
			System.out.print(quarter4[i] + " ");
		}
		System.out.println();
		
		System.out.println();
	}
	
	
	//calculate mean
	public void findMean() {
		double total=0;
		double mean1, mean2, mean3, mean4;
		double meanDouble;
		
		//quarter 1
		for(int i=0; i<statSize; i++) {
			meanDouble = (double) quarter1[i];
			total = total + meanDouble;
		}
		mean1 = total / statSize;
		meanDouble = 0;
		total=0;
		meanQ1 = mean1;
		
		//quarter 2
		for(int i=0; i<statSize; i++) {
			meanDouble = (double) quarter2[i];
			total = total + meanDouble;
		}
		mean2 = total / statSize;
		meanDouble = 0;
		total=0;
		meanQ2 = mean2;
		
		//quarter 3
		for(int i=0; i<statSize; i++) {
			meanDouble = (double) quarter3[i];
			total = total + meanDouble;
		}
		mean3 = total / statSize;
		meanDouble = 0;
		total=0;
		meanQ3 = mean3;
		
		//quarter 4
		for(int i=0; i<statSize; i++) {
			meanDouble = (double) quarter4[i];
			total = total + meanDouble;
		}
		mean4 = total / statSize;
		meanDouble=0;
		total=0;
		meanQ4 = mean4;
		
		
		//print
		System.out.print("Means: ");
		System.out.print("   Quarter 1: " + mean1);
		System.out.print("   Quarter 2: " + mean2);
		System.out.print("   Quarter 3: " + mean3);
		System.out.print("   Quarter 4: " + mean4);
		System.out.println();
		System.out.println();
		


	}
	
	
	//calculate median
	public void findMedian() {
		double median1, median2, median3, median4;
		
		if (statSize%2 !=0) {
			median1 = quarter1[statSize/2];
			median2 = quarter2[statSize/2];
			median3 = quarter3[statSize/2];
			median4 = quarter4[statSize/2];
						
		}else {
			int index1, index2;
			index1 = (statSize/2)-1;
			index2 = index1 + 1;
			
			median1 = ((double)quarter1[index1] + (double)quarter1[index2]) / 2;
			median2 = ((double)quarter2[index1] + (double)quarter2[index2]) / 2;
			median3 = ((double)quarter3[index1] + (double)quarter3[index2]) / 2;
			median4 = ((double)quarter4[index1] + (double)quarter4[index2]) / 2;
		}
		
		//print
		System.out.print("Medians: ");
		System.out.print("  Quarter 1: " + median1);
		System.out.print("  Quarter 2: " + median2);
		System.out.print("  Quarter 3: " + median3);
		System.out.print("  Quarter 4: " + median4);
		System.out.println();
		System.out.println();
		
	}
	
	//calculate mode
	public void findMode() {
		int current, count, most, currentNum;
		int [] countArr1 = new int [statSize];
		
		System.out.print("Modes: ");
		
		//quarter 1
		System.out.print("Quarter 1: ");
		
		//add number of occurrences of each number to parallel array countArr
		for (int i=0; i<statSize; i++) {
			
			current = quarter1[i];
			count=0;
			
			for (int j=0; j<statSize; j++) {
				if (current == quarter1[j]) {
					count++;
				}
			}
			
			countArr1[i] = count;
		}
		
		//figure out what the largest number in countArr is 
		most = 1;
		for (int i=0; i<statSize; i++) {
			if (countArr1[i] > most) {
				most = countArr1[i];
			}
		}
		
		//print numbers that have the most as their number in countArr
		if (most!=1) {
			for (int i=0; i<statSize; i++) {
				if (countArr1[i] == most) {
					System.out.print(quarter1[i] + " ");
					currentNum = quarter1[i];
					
					for (int j=i; j<statSize; j++) {
						if (quarter1[j] == currentNum) {
							i++;
						}
					}
				}
			}//end of for
		}else {
			System.out.print("There is no mode. ");
		}
		
		
		
		
		//quarter 2
		current=0;
		count=0;
		most=0;
		currentNum=0;
		int [] countArr2 = new int [statSize];
		
		System.out.print("Quarter 2: ");
		
		//add number of occurrences of each number to parallel array countArr
		for (int i=0; i<statSize; i++) {
			
			current = quarter2[i];
			count=0;
			
			for (int j=0; j<statSize; j++) {
				if (current == quarter2[j]) {
					count++;
				}
			}
			
			countArr2[i] = count;
		}
		
		//figure out what the largest number in countArr is 
		most = 1;
		for (int i=0; i<statSize; i++) {
			if (countArr2[i] > most) {
				most = countArr2[i];
			}
		}
		
		//print numbers that have the most as their number in countArr
		if (most!=1) {
			for (int i=0; i<statSize; i++) {
				if (countArr2[i] == most) {
					System.out.print(quarter2[i] + " ");
					currentNum = quarter2[i];
					
					for (int j=i; j<statSize; j++) {
						if (quarter2[j] == currentNum) {
							i++;
						}
					}
				}
			}//end of for
		}else {
			System.out.print("There is no mode. ");
		}
		
		
		//quarter 3
		current=0;
		count=0;
		most=0;
		currentNum=0;
		int [] countArr3 = new int [statSize];
		
		System.out.print("Quarter 3: ");
		
		//add number of occurrences of each number to parallel array countArr
		for (int i=0; i<statSize; i++) {
			
			current = quarter3[i];
			count=0;
			
			for (int j=0; j<statSize; j++) {
				if (current == quarter3[j]) {
					count++;
				}
			}
			
			countArr3[i] = count;
		}
		
		//figure out what the largest number in countArr is 
		most = 1;
		for (int i=0; i<statSize; i++) {
			if (countArr3[i] > most) {
				most = countArr3[i];
			}
		}
		
		//print numbers that have the most as their number in countArr
		if (most!=1) {
			for (int i=0; i<statSize; i++) {
				if (countArr3[i] == most) {
					System.out.print(quarter3[i] + " ");
					currentNum = quarter3[i];
					
					for (int j=i; j<statSize; j++) {
						if (quarter3[j] == currentNum) {
							i++;
						}
					}
				}
			}//end of for
		}else {
			System.out.print("There is no mode. ");
		}
		
		
		
		
		//quarter 4
		current=0;
		count=0;
		most=0;
		currentNum=0;
		int [] countArr4 = new int [statSize];
		
		System.out.print("Quarter 4: ");
		
		//add number of occurrences of each number to parallel array countArr
		for (int i=0; i<statSize; i++) {
			
			current = quarter4[i];
			count=0;
			
			for (int j=0; j<statSize; j++) {
				if (current == quarter4[j]) {
					count++;
				}
			}
			
			countArr4[i] = count;
		}
		
		//figure out what the largest number in countArr is 
		most = 1;
		for (int i=0; i<statSize; i++) {
			if (countArr4[i] > most) {
				most = countArr4[i];
			}
		}
		
		//print numbers that have the most as their number in countArr
		if (most!=1) {
			for (int i=0; i<statSize; i++) {
				if (countArr4[i] == most) {
					System.out.print(quarter4[i] + " ");
					currentNum = quarter4[i];
					
					for (int j=i; j<statSize; j++) {
						if (quarter4[j] == currentNum) {
							i++;
						}
					}
				}
			}//end of for
		}else {
			System.out.print("There is no mode. ");
		}
	
		
		System.out.println();
		System.out.println();
		
	}//end of class
	

	
	
	//calculate standard deviation
	public void findStanDev() {
		double stanDev1, stanDev2, stanDev3, stanDev4;
		
		//quarter 1
		double tempMean1 = meanQ1;
		double difference, temp;
		double []devArr1 = new double [statSize];
		double devMean, total=0, devDouble;
		
		//square each number-mean
		for (int i=0; i<statSize; i++) {
			difference = quarter1[i] - tempMean1;
			temp = difference * difference;
			devArr1[i] = temp;
		}
		
		
		//find mean of numbers in devArr	
		for (int i=0; i<statSize; i++) {
			devDouble = devArr1[i];
			total = total + devDouble;
		}
		devMean = total / statSize;
			
		//square root devMean
		stanDev1 = java.lang.Math.sqrt(devMean);
		
		
		//quarter 2
		double tempMean2 = meanQ2;
		difference=0;
		temp=0;
		double []devArr2 = new double [statSize];
		devMean=0;
		total=0; 
		devDouble=0;
		
		//square each number-mean
		for (int i=0; i<statSize; i++) {
			difference = quarter2[i] - tempMean2;
			temp = difference * difference;
			devArr2[i] = temp;
		}
		
		
		//find mean of numbers in devArr	
		for (int i=0; i<statSize; i++) {
			devDouble = devArr2[i];
			total = total + devDouble;
		}
		devMean = total / statSize;
			
		//square root devMean
		stanDev2 = java.lang.Math.sqrt(devMean);
		
		
		//quarter 3
		double tempMean3 = meanQ3;
		difference=0;
		temp=0;
		double []devArr3 = new double [statSize];
		devMean=0;
		total=0; 
		devDouble=0;
		
		//square each number-mean
		for (int i=0; i<statSize; i++) {
			difference = quarter3[i] - tempMean3;
			temp = difference * difference;
			devArr3[i] = temp;
		}
		
		
		//find mean of numbers in devArr	
		for (int i=0; i<statSize; i++) {
			devDouble = devArr3[i];
			total = total + devDouble;
		}
		devMean = total / statSize;
			
		//square root devMean
		stanDev3 = java.lang.Math.sqrt(devMean);
		
		
		
		//quarter 4
		double tempMean4 = meanQ4;
		difference=0;
		temp=0;
		double []devArr4 = new double [statSize];
		devMean=0;
		total=0; 
		devDouble=0;
		
		//square each number-mean
		for (int i=0; i<statSize; i++) {
			difference = quarter4[i] - tempMean4;
			temp = difference * difference;
			devArr4[i] = temp;
		}
		
		
		//find mean of numbers in devArr	
		for (int i=0; i<statSize; i++) {
			devDouble = devArr4[i];
			total = total + devDouble;
		}
		devMean = total / statSize;
			
		//square root devMean
		stanDev4 = java.lang.Math.sqrt(devMean);
		
		
		
		
		//print
		System.out.print("Standard Deviations: ");
		System.out.print("  Quarter 1: " + stanDev1);
		System.out.print("  Quarter 2: " + stanDev2);
		System.out.print("  Quarter 3: " + stanDev3);
		System.out.print("  Quarter 4: " + stanDev4);
		System.out.println();
		System.out.println();
		
		
	}
	
}
