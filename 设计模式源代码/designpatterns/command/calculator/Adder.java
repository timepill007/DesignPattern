package designpatterns.command.calculator;

//Receiver
public class Adder {
	private int num=0; 
	
	public int add(int value) {
		num += value;
		return num;
	}
}
