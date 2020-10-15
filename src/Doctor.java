import javax.print.Doc;

public class Doctor {
    //Atributos
    static int id = 0; // Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality){
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("El id del medico asignado es: " + id);
    }

}