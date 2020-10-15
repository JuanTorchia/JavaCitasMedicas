public class Patient {
    //Atributos
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    Patient(String name, String email){
        this.name = name;
        this.email = email;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() <8){
            System.out.println("El numero telefonico debe ser de 8 digitos minimo");
        }else if(phoneNumber.length() > 8){
        this.phoneNumber = phoneNumber;}
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
}
