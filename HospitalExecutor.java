class HospitalExecutor {

    public static void main(String[] args) {

        String[] specializations = {
            "General Medicine",
            "Ortho",
            "Cardiology",
            "Dermatology",
            "Neurology",
            "Pediatrics",
            "Oncology",
            "Psychiatry",
            "Gastroenterology",
            "ENT",
            "Ophthalmology",
            "Urology",
            "Nephrology",
            "Pulmonology",
            "Endocrinology",
            "Rheumatology",
            "Gynecology",
            "Radiology",
            "Pathology",
            "Anesthesiology",
            "Hematology",
            "Infectious Disease",
            "Emergency Medicine",
            "Geriatrics",
            "Plastic Surgery",
            "Neurosurgery",
            "General Surgery",
            "Cardiothoracic Surgery",
            "Vascular Surgery",
            "Neonatology",
            "Immunology",
            "Physical Medicine",
            "Sports Medicine",
            "Pain Management",
            "Sleep Medicine",
            "Palliative Care",
            "Hepatology",
            "Critical Care",
            "Medical Genetics",
            "Occupational Medicine",
            "Podiatry"
        };

        for (String specialization : specializations) {

            System.out.println("Doctors in " + specialization + " :");

            String[] doctors = Hospital.findDoctorsBySpecialization(specialization);

            if (doctors != null) {
                Hospital.getDoctors(doctors);
            } else {
                System.out.println("No doctors found for this specialization.");
            }

            System.out.println("------------------------------------------");
        }
    }
}