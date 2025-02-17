package designpatterns.visitor;

public class Client {
	public static void main(String args[]) {
		EmployeeList list = new EmployeeList();
		Employee fte1,fte2,fte3,pte1,pte2;

		fte1 = new FulltimeEmployee("Sunny",3200.00,45);
		fte2 = new FulltimeEmployee("Tom",2000.00,40);
		fte3 = new FulltimeEmployee("Rose",2400.00,38);
		pte1 = new ParttimeEmployee("Jim",80.00,20);
		pte2 = new ParttimeEmployee("Ray",60.00,18);

		list.addEmployee(fte1);
		list.addEmployee(fte2);
		list.addEmployee(fte3);
		list.addEmployee(pte1);
		list.addEmployee(pte2);

		Department dep;
		dep = (Department)XMLUtil.getBean();
		list.accept(dep);
	}
}
