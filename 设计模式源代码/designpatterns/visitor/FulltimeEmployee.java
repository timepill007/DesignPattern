package designpatterns.visitor;

//ConcreteElement
public class FulltimeEmployee implements Employee {
	private String name; 
	private double weeklyWage; 
	private int workTime; 

	public FulltimeEmployee(String name,double weeklyWage,int workTime) {
		this.name = name;
		this.weeklyWage = weeklyWage;
		this.workTime = workTime;
	}	

	public void setName(String name) {
		this.name = name; 
	}

	public void setWeeklyWage(double weeklyWage) {
		this.weeklyWage = weeklyWage; 
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime; 
	}

	public String getName() {
		return (this.name); 
	}

	public double getWeeklyWage() {
		return (this.weeklyWage); 
	}

	public int getWorkTime() {
		return (this.workTime); 
	}

	public void accept(Department handler) {
		handler.visit(this); //call the visitor's visit() method
	}
}
