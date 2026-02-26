class Nurse {
    public void basicCheck(String patientName, String symptom, int bp, boolean sugar) {
        System.out.println("Nurse checking patient: " + patientName);
        System.out.println("Symptom: " + symptom);
        System.out.println("BP Level: " + bp);
        
        if (sugar) {
            System.out.println("Sugar level is high.");
        } else {
            System.out.println("Sugar level is normal.");
        }
    }
}