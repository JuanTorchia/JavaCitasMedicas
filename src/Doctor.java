public class Doctor {
    //Atributos
    int id;
    String name;
    String speciality;

    Doctor(String name){
        System.out.println("El nombre del medico asignado es: " + name);
    }

    //Compartamientos
    public void showName(){
        System.out.println(name);
    }
}
