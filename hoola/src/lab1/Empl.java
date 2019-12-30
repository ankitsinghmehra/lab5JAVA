package lab1;

public class Empl implements Comparable{

	private int empid;
	private String empname;
	private String designation;
	
	public Empl(int empid,String empname,String designation){
		this.empid=empid;
		this.empname=empname;
		this.designation=designation;
	}
	

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

	@Override
	public String toString() {
		return "Empl [empid=" + empid + ", empname=" + empname + ", designation=" + designation + "]";
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Empl emp=(Empl)o;
		String name1=emp.getEmpname();
		String name2=this.getEmpname();
		return name2.compareTo(name1);
	}
	
}
