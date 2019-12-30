package Assesment;
import java.util.*;

public class Customer {

	private int id;
	private String name;
	private String email;
	private String phone;
	static Customer[] ct=new Customer[10];
	static Customer cr=new Customer();
	
	static Scanner sc=new Scanner(System.in);
	
	public Customer(int id,String name,String email,String phone){
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	void validate(){
		String uid,pass;
		System.out.println("Enter User id:");
		uid=sc.nextLine();
		System.out.println("Enter Password:");
		pass=sc.nextLine();
		if(uid.equals("ABCCust") && pass.equals("abc@123")){
			operations();
		}
		else
			System.out.println("Invalid Credentials!!!");
	}
	void operations(){
		int op=0;
		while(op!=5){
			System.out.println("Select the option:");
		System.out.println(" press 1 to Add Customer Details \n"+ 
				"press 2 to Print Customer Details \n"+
				"press 3 to Edit Existing Details \n"+
				"press 4 to Delete Existing Customer details \n"+
				"press 5 to Exit");
		op=sc.nextInt();
		
		switch(op){
		case 1:
			addDetails();
			break;
		case 2:
			printDetails();
			break;
		case 3:
			editDetails();
			break;
		case 4:
			deleteDetails();
			break;
		default:
			System.out.println("Thanks for using portal");
			break;		
		}
	  }
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

	void addDetails(){
		System.out.println("Enter ID:");
		cr.id=sc.nextInt();
		System.out.println("Enter Name:");
		cr.name=sc.nextLine();
		System.out.println("Enter email:");
		cr.email=sc.nextLine();
		System.out.println("Enter Phone:");
		cr.phone=sc.nextLine();
		for(int i=0;i<ct.length;i++){
			if(ct[i]==null){
				ct[i]=new Customer(cr.id, cr.name, cr.email, cr.phone);
				break;
			}
		}
		
	}
	
	 void printDetails(){
		Arrays.sort(ct, new CompareById());
		for(int i=0;i<ct.length;i++){
			System.out.println(ct[i]);
		}
		
	}
	
	static void editDetails(){
		
	}
	
	static void deleteDetails(){
		
	}
	
	public static void main(String[] args){
		ct[0]=new Customer(101,"Rahul","rahul@del","1234567890");
		ct[1]=new Customer(102,"amit","amit@del","999999999");
		ct[2]=new Customer(103,"jiglibum","jigli@bum","2343436323");
		cr.validate();
		
		
	}
}
