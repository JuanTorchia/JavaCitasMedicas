package model;

public class Patient extends User {
    //Atributos
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    public Patient(String name, String email){
        super(name,email);
        //Mas Instrucciones

    }

    public String getHeight() {
        return height + "Mts.";
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + "Kg.";
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\n Weight: " +getWeight()+ "\n Height "+getHeight()+"\nBlood "+blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde el nacimiento");
    }
}
