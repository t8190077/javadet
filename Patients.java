import java.util.ArrayList;
// Patient class that uses 2D array to add patients
// amount of rows is dynamic and changes with ArrayList functions
// but amount of column (which represents the Patients attributes is fixed) so it enters
// a String array[5] in every ArrayList cell
public class Patients {
	// Initializing attributes.
	String name, amka, dob, email, number; // dob = date of birth
	// Initializing ArrayList with String[] array in every cell
	static ArrayList<String[]> patients = new ArrayList<String[]>();
	// Patient object constructor with attributes as arguments.
	public Patients(String name, String amka, String dob, String email, String number) {
		String[] data = new String[5];
		this.name = name;
		this.amka = amka;
		this.dob = dob;
		this.email = email;
		this.number = number;
		// enter patient's data to a String[5] array that later stores in patients ArrayList
		data[0] = name;
		data[1] = amka;
		data[2] = dob;
		data[3] = email;
		data[4] = number;
		// stores String[] data to ArrayList<String[]> patients.
		patients.add(data);
		}
	//custom toString that returns String format with current Employee's data
	@Override
	public String toString() {
		return "Name: " + this.name + "\nAmka: " + this.amka + "\nDate of Birth: " + this.dob + "\nEmail: " + this.email + "\nPhone number: " + this.number;
	}
	// Method that returns name.
	public String getName() {
		return name;
	}
	
	// Method that prints data from all patients
	public static void allPatients() {
		System.out.print("Patients: ");
		// loop for every ArrayList row
		for (String[] array : patients) {
			System.out.println();
			// loop for every ArrayList column
			for (String element : array) {
				System.out.printf("%s  ", element);
			}
		}
	}
	// Method that prints all patient's names only
	public static void getNames() {
		for (int i=0; i<patients.size(); i++) {
			System.out.println(patients.get(i)[0]);
		}
	}
}
	


