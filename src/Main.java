public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Juan Torchia";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);



        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);
    }
}
