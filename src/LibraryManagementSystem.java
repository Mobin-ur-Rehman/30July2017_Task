
public class LibraryManagementSystem {
	
	//declare variable's for #module 01
	int UserId, UniID;
	String UserName, FatherName;
	
	//setter for #module 01
	public void setUserName(String userName) {UserName = userName;}
	public void setFatherName(String fatherName) {FatherName = fatherName;}
	public void setUserId(int userId) {UserId = userId;}
	public void setUniID(int uniID) {UniID = uniID;}
	
	//getter for #module 01
	public String getUserName() {return UserName;}
	public String getFatherName() {return FatherName;}
	public int getUserId() {return UserId;}
	public int getUniID() {return UniID;}
	
	//************************************** Module #01 Complete **************************************
	
	
	
	//declare variable's for #module 02
	String Physics_Sub[] = {"Theoretical concepts in physics","Lectures on Theoretical Physics","The Physicist's World","The Character of Physical Law"};
	String Chemistry_Sub[] = {"Organic chemistry","Inorganic chemistry","Physical chemistry","Biochemistry"};
	String Botany_Sub[] = {"Abiotic Stresses","Algae","Basics of Botany","Bio-Fuel Plants"};
	String Zoology_Sub[] = {"Evolving Animals","Integrated Principles of Zoology","Demon Fish","Biological Exuberance"};
	
	String Department[] ={"Software Engineering", "Computer Science", "Information Technology", "MBBS", "BDS"};
	
	
	
	public void PrintUserInfo() {
		System.out.println("\t\t\t\t\tStudent Information\n");
		System.out.println("User ID    : "+getUserId()+"\t\t\t\t\t\t\tUniversity ID: "+getUniID());
		System.out.println("User Name  : "+getUserName()+"\nFather Name: "+getFatherName());
		for(int i=1; i<93; i++) { System.out.print("-");}
	}
	
	//Availability of Books
	public void AvailableBooks() {
		System.out.println("\n\nPhysics Book's Collection (Availability): ");
		for(int i=0; i<Physics_Sub.length; i++) {System.out.print((i+1)+". "+Physics_Sub[i]+"\n");}
		
		System.out.println("\nChemistry Book's Collection (Availability): ");
		for(int i=0; i<Chemistry_Sub.length; i++) {System.out.print((i+1)+". "+Chemistry_Sub[i]+"\n");}
		
		System.out.println("\nBotany Book's Collection (Availability): ");
		for(int i=0; i<Botany_Sub.length; i++) {System.out.print((i+1)+". "+Botany_Sub[i]+"\n");}
		
		System.out.println("\nZoology Book's Collection (Availability): ");
		for(int i=0; i<Zoology_Sub.length; i++) {System.out.print((i+1)+". "+Zoology_Sub[i]+"\n");}

	}
	
	
	
	
}
