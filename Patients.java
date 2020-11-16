import java.util.ArrayList;
public class Patients {
    // Initialising name and id.
    String name;
    int id;
    // These are two arraylists, in which we are going to input our names and ids.
    static ArrayList<Integer> ids = new ArrayList<>();
    static ArrayList<String> names = new ArrayList<>();
    // Patient object constructor.
    public Patients(String name, int id) {
        this.name = name;
        this.id = id;
    // Adding patients attributes to lists.
        ids.add(id); 
        names.add(name);
    }
    // Simple toString to return name.
    public String toString() {
        return name;
    }
    // Simple toString to return id.
    public int getId() {
        return id;
    }
    // Custom toString that return full id + name.
    public String getPatient() {
        return "NAME: " + name + "\nID: " + id;
    }
    // Function that returns all patients names in a nice format.
    public static void allNames() {
        for (int i = 0; i <= names.size() - 1; i++) {
            System.out.println("ID: " + i + " NAME: " + names.get(i));
        }
    }   
    // Function that returns a string array of all patient names in a nice format,used for GUI
        public static String [] namesArr() {
        	String arr [] = new String[names.size()];
        	for (int i = 0; i <= names.size() - 1; i++) {
                arr[i]=("ID: " + i + "        NAME: " + names.get(i));
            }
        	return arr;
        }
    
} 