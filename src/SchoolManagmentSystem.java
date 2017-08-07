import java.util.Date;
public class SchoolManagmentSystem {
	
	//declare variable's for #module 01
	String Name, FatherName, ClassName, LastClass; 
	double LastPassingMarks; int RollNo;
	
	//setter for #module 01
	public void setName(String name) {Name = name;}
	public void setFatherName(String fatherName) {FatherName = fatherName;}
	public void setClassName(String className) {ClassName = className;}
	public void setLastClass(String lastClass) {LastClass = lastClass;}
	public void setLastPassingMarks(double lastPassingMarks) {LastPassingMarks = lastPassingMarks;}
	public void setRollNo(int rollNo) {RollNo = rollNo;}
	
	//getter for #module 01
	public String getName() {return Name;}
	public String getFatherName() {return FatherName;}
	public String getClassName() {return ClassName;}
	public String getLastClass() {return LastClass;}
	public double getLastPassingMarks() {return LastPassingMarks;}
	public int getRollNo() {return RollNo;}
	
	//************************************** Module #01 Complete **************************************
		
	
	
	
	
	
	//declare variable's for #module 02
	double AddmissionFee, MonthlyFee, ExtracirculumFees, GameFee;
	
	//setter for #module 02
	public void setAddmissionFee(double addmissionFee) {AddmissionFee = addmissionFee;}
	public void setMonthlyFee(double monthlyFee) {MonthlyFee = monthlyFee;}
	public void setExtracirculumFees(double extracirculumFees) {ExtracirculumFees = extracirculumFees;}
	public void setGameFee(double gameFee) {GameFee = gameFee;}
	
	//getter for #module 02
	public double getAddmissionFee() {return AddmissionFee;}
	public double getMonthlyFee() {return MonthlyFee;}
	public double getExtracirculumFees() {return ExtracirculumFees;}
	public double getGameFee() {return GameFee;}
	
	//************************************** Module #02 Complete **************************************
	
	
	
	
	
	
	//declare variable's for #module 03
	double English, Physics;
	
	//setter for #module 03
	public void setEnglish(double english) {English = english;}
	public void setPhysics(double physics) {Physics = physics;}
	
	//getter for #module 03
	public double getEnglish() {return English;}
	public double getPhysics() {return Physics;}
	
	public String CalculateSubjectStatus() {
		if(English >= 50 && Physics >= 50) {return "English: Pass ("+getEnglish()+"/100)"+"\n\t\t\tPhysics: Pass ("+getPhysics()+"/100)";}
		else if(English >= 50 && Physics < 50) {return "English: Pass\nPhysics: Fail";}
		else if(English < 50 && Physics >= 50) {return "English: Fail\nPhysics: Pass";}
		else if(English < 50 && Physics < 50) {return "English: Fail\nPhysics: Fail";}
		else return "";
	}
	
	//************************************** Module #03 Complete **************************************
	
	//double AddmissionFee, MonthlyFee, ExtracirculumFees, GameFee;
	public void PrintStudentInfo() {
		Date date = new Date();
		System.out.print("\t\t\t\t\tStudent Addmission Slip\t\t\t   ");
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "", date);
		
		System.out.print("\n\n");
		System.out.println("\tStudent Name: "+getName()+"\t\t\t\t\t Addmission Fee: "+getAddmissionFee()+" PKR");
		System.out.println("\tFather Name : "+getFatherName()+"\t\t\t\t\t Monthly Fee:\t  "+getMonthlyFee()+" PKR");
		System.out.println("\tAddmission  : "+getClassName()+" Class"+"\t\t\t\t\t\t Extrac Fee:\t   "+getExtracirculumFees()+" PKR");
		System.out.println("\tExam Passed : "+getLastClass()+" Class"+"\t\t\t\t\t\t Game Fee:\t   "+getGameFee()+" PKR");
		System.out.print("\tLast Exam Status : \n\t\t\t"+CalculateSubjectStatus());
		System.out.println("\t\t\t-----------------------------");
		System.out.println("\t\t\t\t\t\t\t\t\tTotal: \t\t "+(getAddmissionFee()+getExtracirculumFees()+getMonthlyFee()+getGameFee())+" PKR");
		System.out.print("\t");
		for(int i=1; i<=93; i++) {System.out.print("-");}
		
		System.out.println("\n\tA community with high expectation and high academic achievement.\n\tABC School, 1223 Street near XYZ Road Karachi");
		
		
	}
	
}


