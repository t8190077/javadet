public class Main extends Patients{
    public static void main(String[] args) {
        System.out.println("Enter patients name. ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Patients adam = new Patients(name);
        adam.getPatient();
    };
}
