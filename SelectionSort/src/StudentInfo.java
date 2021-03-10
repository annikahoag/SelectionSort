
public class StudentInfo {

	//instance variables 
	private String name;
	private int gradYear, finalAverage;
	
	//constructor
	public StudentInfo(String n, int g, int f) {
		name = n;
		gradYear = g;
		finalAverage = f;
	}
	
	//returns name
	public String getName() {
		return name;
	}
	
	
	//returns gradYear
	public int getGradYear() {
		return gradYear;
	}
	
	//returns final average
	public int getFinalAverage() {
		return finalAverage;
	}
	
}
