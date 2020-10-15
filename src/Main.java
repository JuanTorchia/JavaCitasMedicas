
import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahí Salgado");
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctornAnn = new Doctor();
        myDoctor.showId();

        showMenu();

    }



}