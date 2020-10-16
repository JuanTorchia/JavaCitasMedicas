
import static ui.UiMenu.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }


        System.out.println(myDoctor.getAvailableAppointments());

        /*
        Patient patient = new Patient("Enrique","enrique@hospital.ar");
        patient.setWeight(54.5);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("1123872075");
        System.out.println(patient.getPhoneNumber());
        */


    }



}