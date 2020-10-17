
import static ui.UiMenu.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@platzi.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        /*
        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Enrique","enrique@hospital.ar");
        System.out.println(patient);


    }



}