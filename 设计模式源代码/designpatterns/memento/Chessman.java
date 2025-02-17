package designpatterns.memento;

//Originator
public class Chessman {
	private String label;
	private int x;
	private int y;

	public Chessman(String label,int x,int y) {
		this.label = label;
		this.x = x;
		this.y = y;
	}

	public void setLabel(String label) {
		this.label = label; 
	}

	public void setX(int x) {
		this.x = x; 
	}

	public void setY(int y) {
		this.y = y; 
	}

	public String getLabel() {
		return (this.label); 
	}

	public int getX() {
		return (this.x); 
	}

	public int getY() {
		return (this.y); 
	}
	
    //save state
	public ChessmanMemento save() {
		return new ChessmanMemento(this.label,this.x,this.y);
	}
	
    //restore state
	public void restore(ChessmanMemento memento) {
		this.label = memento.getLabel();
		this.x = memento.getX();
		this.y = memento.getY();
	}
}
