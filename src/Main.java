
import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Juan Torchia","Psicologo");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        //

        Patient patient = new Patient("Enrique","enrique@hospital.ar");
        patient.setWeight(54.5);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("1123872075");
        System.out.println(patient.getPhoneNumber());



    }



}