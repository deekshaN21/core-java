public class PatientExecutor {
    public static void main(String[] args) {
        
        Patient patient = new Patient();
        patient.sick();
        
        Mobile mobile = new Mobile();
        mobile.register("Rahul", "Fever", "rahul@gmail.com", 9876543210L);
        
        Reception reception = new Reception();
        reception.book("Rahul", "Fever", "rahul@gmail.com", 9876543210L);
        
        Hospital hospital = new Hospital();
        hospital.bookAppointment("Rahul", "Fever");
        
        Nurse nurse = new Nurse();
        nurse.basicCheck("Rahul", "Fever", 120, false);
        
        Doctor doctor = new Doctor();
        doctor.treat("Rahul", "Fever");
    }
}