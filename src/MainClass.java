import java.util.Scanner;
public class MainClass {
	
	public static void main(String[] args) {
		Scanner user_input = new Scanner( System.in );
		SchoolManagmentSystem Sch = new SchoolManagmentSystem();
		LibraryManagementSystem Lib = new LibraryManagementSystem();
		
		int Choice=0;
		System.out.print("1. School Management System\n2.Library Management System\nPlease Enter your Choice: ");
		Choice = user_input.nextInt();
		System.out.print("\n\n");
		if(Choice==1) {
			Sch.setName("Arshman Saleem"); Sch.setFatherName("Muhammad Saleem");
			Sch.setRollNo(01); Sch.setLastClass("8th"); Sch.setClassName("9th"); Sch.setLastPassingMarks(500);
			
			Sch.setAddmissionFee(10000.00); Sch.setMonthlyFee(5000.00);
			Sch.setExtracirculumFees(599.00); Sch.setGameFee(500.00);
			
			Sch.setEnglish(80.5); Sch.setPhysics(78.0);
			
			Sch.PrintStudentInfo();
		}
		else if(Choice==2) {
			Lib.setUserId(1011); Lib.setUniID(11225); Lib.setUserName("Arshman Saleem"); Lib.setFatherName("Muhammad Saleem");
			Lib.PrintUserInfo();
			Lib.AvailableBooks();
		}
		else {System.out.println("Wrong Input..Try Again");}
		
		
		
		
		

	}

}
