package designpatterns.observer;

public interface Observer {
	public String getName();
	public void setName(String name);
	public void help(); 
	public void beAttacked(AllyControlCenter acc);
}
